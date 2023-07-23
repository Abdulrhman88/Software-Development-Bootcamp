<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<style>
    table, th, td {
        border:1px solid black;
    }
</style>
<body>


<h1><c:out value="${dojos.name}"/> </h1>
<table class="table">
    <thead>
    <tr>
        <th scope="col">First Name</th>
        <th scope="col">Last Name</th>
        <th scope="col">Age</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="x" items="${dojos.ninjas}">
        <tr>
            <td><c:out value="${x.firstName}"/></td>
            <td>
                <c:out value="${x.lastName}" />
            </td>
            <td>
                <c:out value="${x.age}" />
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>



</body>
</html>