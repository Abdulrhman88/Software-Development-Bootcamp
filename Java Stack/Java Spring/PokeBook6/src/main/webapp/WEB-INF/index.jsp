<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        table, th, td {
            border:1px solid black;
        }
    </style>
</head>
<body>
<div class="wrap">
    <h1 style="color:blue ;">PokeBook</h1>

    <table style="width:100%">
        <tr>
            <td>Expense</td>
            <td>vendor</td>
            <td>amount</td>
            <td>action</td>
        </tr>
        <tr>
            <c:forEach var="x" items="${pokes}">
                <td><a href="/poke/${x.id}/show">${x.expense}</a></td>
            <td>${x.vendor}</td>
            <td>${x.amount}</td>
            <td style="display: flex">
                <a href="/poke/${x.id}/edit">edit</a>
                <form action=/poke/destroy/${x.id} method="POST">
                    <input type="hidden" name="_method" value="delete">
                    <input type="submit" value="Delete">
                </form>
            </td>
        </tr>
        </c:forEach>
    </table>

    <h2 style="color: blue;">Track an expense :</h2>
    <div class="form">
        <form action="poke/create" method="post"  modelAttribute="poke" >

                <label for="expense"> Expense Name :</label>
                <input type="text" name="expense"><br>

                <label for="vendor">Vendor:</label>
                <input type="text"  name="vendor"><br>

                <label for="amount">Amount :</label>
                <input type="text" name="amount" ><br>

                <label for="description">Descripotin:</label>
                <textarea name="description" cols="30" rows="10"></textarea>
            <input type="submit" value="Sumbit">

        </form>



    </div>

</div>

</body>
</html>