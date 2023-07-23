<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Success!</title>
    <style>
        .wrap{
            margin: 0 auto;
        }
        .nav{
            display: flex;
            justify-content: space-between;
        }

        table, th, td {
            border:1px solid black;
        }

    </style>
</head>

<body>
<div class="wrap ">
    <div class="nav">
        <h1>welcome <c:out value="${user.userName}" /></h1>
        <a href="logout">logout</a>
        <a href="/project/new">+new Project</a>
    </div>


<h2>All project</h2>
    <table style="width:100%">
        <tr>
            <td>Project</td>
            <td>Team Lead</td>
            <td>Due Date</td>
            <td>Action</td>

        </tr>
        <c:forEach var="x" items="${project}">
            <c:if test="${x.join==null}">

            <tr>
                <td>${x.title}</td>
                <td>${x.user.userName}</td>
                <td>date</td>
                <td><a href="/join/${x.id}">Join Team</a></td>

            </tr>
        </c:if>
        </c:forEach>
    </table>

    
<h2>Your project</h2>
<table style="width:100%">
    <tr>
        <td>Project</td>
        <td>Team Lead</td>
        <td>Due Date</td>
        <td>Action</td>

    </tr>
    <c:forEach var="y" items="${project}">
    <c:if test="${y.join.id==user.id}">
        <tr>
            <td><a href="/project/${y.id}/show">${y.title}</a></td>
            <td>${y.user.userName}</td>
            <td>date</td>

            <td>
        <c:if test="${y.user.id==user.id}">

            <a href="/project/${y.id}/edit">Edit</a>

            <form action="project/${y.id}" method="post">
                <input type="hidden" name="_method" value="delete">
                <input type="submit" value="Delete">
            </form>
        </c:if>
                <a href="/leave/${y.id}">leave team</a>

            </td>


        </tr>

    </c:if>
    </c:forEach>
</table>
</div>
</body>
</html>