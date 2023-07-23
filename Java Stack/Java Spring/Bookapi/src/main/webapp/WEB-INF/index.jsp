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


<%--<h1>title : ${book.title}</h1>--%>
<%--<h2>description: ${book.description} </h2>--%>
<%--<h2>language : ${book.language}</h2>--%>
<%--<h2>number of page: ${book.numberOfPages}</h2>--%>

<%--for all the book in database by forEach and the key allbooks--%>
<%--<c:forEach var="x" items="${books}">--%>
<%--<Table>--%>
<%--    <td></td>--%>

<%--    <h1>title : ${x.title}</h1>--%>
<%--    <h2>description: ${x.description} </h2>--%>
<%--    <h2>language : ${x.language}</h2>--%>
<%--    <h2>number of page: ${x.numberOfPages}</h2>--%>

<%--</c:forEach>--%>


<table style="width:100%">
    <thead>
    <tr>
      <td>ID</td>
      <td>title</td>
      <td>language</td>
      <td># Pages</td>
    </tr>
    </thead>

    <tbody>
    <c:forEach var="x" items="${books}">
    <tr>
        <td>${x.id}</td>
      <td><a href="/books/${x.id}">${x.title}</a></td>
      <td>${x.language}</td>
      <td>${x.numberOfPages}</td>
    </tr>
    </tbody>
    </c:forEach>
  </table>






    
</body>
</html>





