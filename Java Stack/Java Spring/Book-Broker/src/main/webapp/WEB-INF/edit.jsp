<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        .wrap{
            margin: 0 auto;
        }
        .nav{
            display: flex;
            justify-content: space-between;
        }

    </style>
</head>
<body>
<div class="wrap">
    <div class="nav ">

        <a href="/la">Dashbord</a>
    </div>
    <div class="form">
        <form:form action="/book/${id}/update" method="POST" modelAttribute="update">

            <form:label path="title">name :</form:label>
            <form:input type="text" path="title" value="${book.title}"></form:input><br>

            <form:label path="author">author:</form:label>
            <form:input type="text" path="author" value="${book.author}"></form:input><br>



            <input type="submit" value="sumbit">


        </form:form>
    </div>
</div>

</body>
</html>