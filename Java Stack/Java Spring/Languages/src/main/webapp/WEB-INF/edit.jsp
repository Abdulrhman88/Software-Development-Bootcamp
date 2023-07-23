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
        <form:form action="/la/${id}/update" method="POST" modelAttribute="update">

            <form:label path="name">name :</form:label>
            <form:input type="text" path="name" value="${ledit.name}"></form:input><br>

            <form:label path="creator">creator:</form:label>
            <form:input type="text" path="creator" value="${ledit.creator}"></form:input><br>

            <form:label path="version">Version :</form:label>
            <form:input type="text" path="version" value="${ledit.version}"></form:input><br>

            <input type="submit" value="sumbit">


        </form:form>
    </div>
</div>

</body>
</html>