<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

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
        <h1>add a Book Your shelf!</h1>
        <a href="/dashbord">back to shelfels </a>
    </div>
    <form:form action="/book/create" method="POST" modelAttribute="createbook">
        <form:errors path="title"  class="text-danger"/>
        <form:errors path="author"  class="text-danger"/>


        <label for="title"> Title :</label>
        <input type="text" name="title"><br>

        <label for="author">author:</label>
        <input type="text" name="author"><br>




        <input type="submit" value="sumbit">

    </form:form>
</div>



</div>
</body>
</html>