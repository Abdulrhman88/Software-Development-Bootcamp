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
        table, th, td {
            border:1px solid black;
        }
    </style>
</head>
<body>
<div class="wrap">


    <table style="width:100%">
        <tr>

            <td>Name</td>
            <td>Careator</td>
            <td>Version</td>
            <td>action</td>

        </tr>
        <tr>

            <c:forEach var="x" items="${Langues}">
            <td>  <a href="/la/${x.id}/show">${x.name}</a></td>
            <td>${x.creator}</td>
            <td>${x.version}</td>
                <td>

                    <a href="/la/${x.id}/edit">edit</a>
                    <form:form method="post" action="/la/destroy/${x.id}">
                        <input type="hidden" name="_method" value="DELETE">
                        <button class="btn btn-danger" type="submit">Delete</button>
                    </form:form>
                </td>
        </tr>
        </c:forEach>

    </table>


    <div class="form">
        <form:form action="la/create" method="post" modelAttribute="lang">
                <form:errors path="name"  class="text-danger"/>
            <form:errors path="creator"  class="text-danger"/>
            <form:errors path="version"  class="text-danger"/>
            <label for="name"> Name :</label>
            <input type="text" name="name"><br>
            <label for="creator">Creator:</label>
            <input type="text" name="creator"><br>
            <label for="version">Version :</label>
            <input type="text" name="version" ><br>
            <input type="submit" value="sumbit">

        </form:form>



    </div>

</div>

</body>
</html>