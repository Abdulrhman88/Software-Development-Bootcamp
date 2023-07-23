package com.example.projectmange.services;

import com.example.projectmange.models.Project;
import com.example.projectmange.repositories.ProjectRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectServices {
    @Autowired
    ProjectRepositories projectrepo;

    public ProjectServices(ProjectRepositories projectrepo) {
        this.projectrepo = projectrepo;
    }

    public List<Project> allProject(){
        return projectrepo.findAll();
    }

    public Project createProject(Project project) {
        return projectrepo.save(project);
    }

    public Project saveProject(Project project) {
        return projectrepo.save(project);
    }

    public Project findProject(Long id){
        Optional<Project> optionalPoke= projectrepo.findById(id);
        if (optionalPoke.isPresent()){
            return optionalPoke.get();
        }else {
            return null;
        }

    }
    public Project udpate(Project project,Long id){
        Project p =projectrepo.findById(id).get();
        p.setTitle(project.getTitle());
        p.setDescription((project.getDescription()));

        return projectrepo.save(p);
    }

    public void delet(Long id){

        Optional<Project> l=projectrepo.findById(id);
        projectrepo.delete(l.get());
    }
    public Project leave(Project project) {
        project.setJoin(null);
        return projectrepo.save(project);
    }
}
