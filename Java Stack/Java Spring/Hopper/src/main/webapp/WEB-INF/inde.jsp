<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>Hopper's Receipt</title>
</head>
<body>
    
    <h1>Coustmer name : <c:out value="${name}"/></h1>
    <h2> item name :<c:out value="${itemname}"/></h2>
    <h2> price : <c:out value="${price}"/></h2>
    <h2>description :<c:out value="${des}"/></h2>
    <h2>vendor: <c:out value="${vendor}"/></h2>    
    </body>
</html>