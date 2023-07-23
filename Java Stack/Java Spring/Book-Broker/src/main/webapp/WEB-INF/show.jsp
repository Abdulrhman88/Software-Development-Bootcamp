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
title :<h1>${books.title}</h1>
book author:        <h1>${books.author}</h1>
   owner for book:      <h1>${books.user.userName}</h1>

    </div>
</div>

</body>
</html>