<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<div class="form">
    <form:form action="/project/${id}/update" method="post" modelAttribute="update">

        <form:errors path="title"  class="text-danger"/>
    <label for="title"> Title :</label>
    <input type="text" name="title" value="${ledit.title}"><br>

        <form:errors path="description"  class="text-danger"/>
    <label for="description">description :</label>
    <input type="text" name="description" value="${ledit.description}"><br>

    <input type="submit" value="sumbit">

    </form:form>
</body>
</html>

