<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<h3>name:${lashow.name}</h3>
<h3>Creator:${lashow.creator}</h3>
<h3>Version:${lashow.version}</h3>

<a href="/la">Dashbord</a>
<a href="/la/${lashow.id}/edit">edit</a>
<a href="/la/destroy/${lashow.id}">delet</a>
