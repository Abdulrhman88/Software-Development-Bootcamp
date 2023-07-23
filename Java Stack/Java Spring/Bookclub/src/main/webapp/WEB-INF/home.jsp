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
        books ervery one shevles
        <a href="/">logout</a>
        <a href="/book/new">add to my shelf</a>
    </div>



<table style="width:100%">
    <tr>
        <td>ID</td>
        <td>title</td>
        <td>Autor name</td>
        <td>Posted by </td>

    </tr>
    <c:forEach var="x" items="${books}">
    <tr>


        <td>${x.id}</td>
        <td><a href="/info/${x.id}">${x.title}</a></td>    
        <td>${x.author}</td>
        <td><c:out value="${x.user.userName}"/></td>
    </tr>
    </c:forEach>
</table>
</div>
</body>
</html>