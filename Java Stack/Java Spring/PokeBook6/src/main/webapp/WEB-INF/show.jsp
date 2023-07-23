<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
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
    <div class="nav">
        <h1 style="color:blue;">Expense Details </h1>
        <a href="poke">Go back</a>
        <div>
            <h3>Expense Name : "${pokeshow.expense}"</h3>
            <h3>Expense descripotin: "${pokeshow.description}"</h3>
            <h3>Vendor "${pokeshow.vendor}"</h3>
            <h3>amount: "${pokeshow.amount}" </h3>
        </div>

    </div>
</div>







</body>
</html>