<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=, initial-scale=1.0">
    <title>Document</title>
    
<style>
    .wrap{
        width: 80%;
        
    }
    .nav{
        display: flex;
        justify-content: space-between;
    }
    .box{
        margin: 0 auto;
        border: 1px black solid;
        width: 40%;
        height: 300px;
    margin-top: 106px;
        
    }
</style>
</head>
<body>
    <div class="wrab">
        <div class="nav">
            <c:out value="${books.title}"/>
            <a href="/dashbord">back to the shefles</a>
        </div>
        <c:out value="${user.userName}"/> <c:out value="${books.title}"/> <c:out value="${book.user.username}"/>

        <hr>

        <div class="box">
            <c:out value="${books.thoughts}"/>
        </div>
        <h1></h1>
    </div>

</body>
</html>