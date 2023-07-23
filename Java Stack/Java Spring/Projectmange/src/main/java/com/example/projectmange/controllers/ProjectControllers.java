package com.example.projectmange.controllers;

import com.example.projectmange.models.Project;
import com.example.projectmange.models.User;
import com.example.projectmange.services.ProjectServices;
import com.example.projectmange.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
public class ProjectControllers {
    private ProjectServices projectSer;
    private UserServices userServices;
   private UserControllers userControllers;

    public ProjectControllers(ProjectServices projectSer, UserServices userServices, UserControllers userControllers) {
        this.projectSer = projectSer;
        this.userServices = userServices;
        this.userControllers = userControllers;
    }

    @RequestMapping(value = "/dashbord", method = RequestMethod.GET)
    private String projectdashbord(Model model, HttpSession session) {

        if (!userControllers.ulogin(session)) {
            return "redirect:/login";
        }

        model.addAttribute("project", projectSer.allProject());
        model.addAttribute("user", userServices.findUserById((long) session.getAttribute("user_id")));


        return "dashbord.jsp";
    }

    @RequestMapping(value = "/project/new", method = RequestMethod.GET)
    public String indexnew(Model model, HttpSession session, @ModelAttribute("project") Project project) {
        if (!userControllers.ulogin(session)) {

            return "redirect:/login";
        }
        model.addAttribute("user", userServices.findUserById((long) session.getAttribute("user_id")));
        return "createpro.jsp";
    }

    @RequestMapping(value = "/project/create", method = RequestMethod.POST)
    public String createproject(@Valid @ModelAttribute("createproejct") Project project, BindingResult result, HttpSession session , Model model) {
        if (!userControllers.ulogin(session)) {

            return "redirect:/login";
        } else if (result.hasErrors()) {
            model.addAttribute("createproejct", new Project());

            return "redirect:/project/new";
        } else {
            User user = userServices.findUserById((long) session.getAttribute("user_id"));
            project.setUser(user);
            projectSer.createProject(project);
            return "redirect:/dashbord";
        }


    }
    @RequestMapping(value = "/project/{id}/edit")
    public String edit(@PathVariable("id") long id, Model model, @ModelAttribute("update") Project project, BindingResult result) {
        Project a = projectSer.findProject(id);
        model.addAttribute("ledit", a);
        return "eidt.jsp";
    }

    @RequestMapping(value = "/project/{id}/update", method = RequestMethod.POST)
    public String update(@Valid@ModelAttribute("update") @PathVariable("id") long id, Project project, BindingResult result,Model model) {
        if (result.hasErrors()) {
//            Project project1=projectSer.udpate("update",project);
            return "redirect:/project/{id}/edit";

        } else {
            projectSer.udpate(project, id);
            return "redirect:/dashbord";
        }
    }

    @RequestMapping(value = "/project/{id}", method = RequestMethod.DELETE)
    public String destroy(@PathVariable("id") Long id) {
        projectSer.delet(id);

        return "redirect:/dashbord";
    }

    @RequestMapping(value = "/join/{id}")
    public String join(@PathVariable("id") Long id, Model model, HttpSession session) {
        Project project = projectSer.findProject(id);
        User user = userServices.findUserById((long) session.getAttribute("user_id"));
        project.setJoin(user);
        projectSer.saveProject(project);
        return "redirect:/dashbord";

    }
    @RequestMapping("/leave/{id}")
    public String leave(@PathVariable("id") Long id, Model model) {
        projectSer.leave(projectSer.findProject(id));
        return "redirect:/dashbord";
    }
    @RequestMapping(value = "/project/{id}/show")
    public String show (Model model,@PathVariable("id")long id) {
        Project p = projectSer.findProject(id);
        model.addAttribute("lashow", p);
        return "show.jsp";

    }
}
