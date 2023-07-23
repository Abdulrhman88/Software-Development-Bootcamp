<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<form:form action="/ninjas/new" method="POST" modelAttribute="ninja">
    <p>
        <form:label path="dojo">Select Dojo</form:label>
        <form:select path="dojo">
        <c:forEach var="x" items="${dojos}">
        <form:option value="${x.id}">
            <c:out value="${x.name}"/>
        </form:option>
        </c:forEach>
        </form:select>



    First name : <form:input type="text" path="firstName"></form:input>
    last name: <form:input type="text" path="lastName"></form:input>
    age:<form:input type="text" path="age"></form:input>

    <input type="submit" value="sumbit">
</form:form>