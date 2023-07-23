<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
          border: 2px solid pink;
          width: 30%;
          hi
        }
        .m{
            margin: 0% ;
            width: 50%;
            height: 50%;
        }
        </style>
</head>
<body>


<div class="m">
            
<table>
    <tr>
      <td>Name  </td>
      <td>Price</td>
      
    </tr>
    <c:forEach var="x" items="${fruits}">
    <tr>
       
      <td><c:out value="${x.name}"/></td>
      <td><c:out value="${x.price}"/></td>
     
    </tr>
</c:forEach>
  </table>


</div>
    
</body>
</html>