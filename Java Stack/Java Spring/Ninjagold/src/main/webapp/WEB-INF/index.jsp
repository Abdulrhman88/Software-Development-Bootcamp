<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">

<head>
    <title>Title</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
</head>
<style>
    .wrap
    {
        height: 600px;
        width: 92%;
        border: 3px black solid;
        margin: 0% auto;

    }
    .nav
    {
        height: 71px;
width: 35%;

display: flex;
justify-content: space-between;
    }

    .midelle
    {

        display: flex;
        justify-content: space-between;
        height: 276px;

       
       
        margin-top: 3%;
       
        
    }
    .box1
    {
        display: flex;
        align-items: center;
        flex-direction: column;
        outline: 3px black solid;
        width: 188px;
        height: 164px;
        margin-top: 5%;
        margin-left: 10px;
        justify-content: space-around;
        
    }
    .AA
{
width: 99%;
height: 190px;
margin: 0% auto;
display: flex;
flex-direction: column;
justify-content: space-between;
margin-bottom: 122px;

}
#up
{
width: 99%;
height: 67px;
}
.do
{
width: 99%;
height: 100px;
outline: 3px black solid;
}
#inp1
{
width: 196px;
height: 32px;
margin-top: 20px;
margin-right: 34px;
}

    
</style>
<body>

<div class="wrap">
<div class="nav">
    <h1>Your Gold </h1>
    <c:out value="${gold}" />
</div>
<div class="midelle">

    <div class="box1"><h3>Farm</h3> (earns 10-20 gold)
        <form action="/gold" method="post">
            <input  type="hidden" name="loc" value="farm">
            <button type="submit" id="submit">Find Gold!</button>
        </form>
    </div>

    <div class="box1"><h3>cave</h3> (earns 5-10 gold)
        <form action="/gold" method="post">
            <input  type="hidden" name="loc" value="cave">
            <button type="submit" >Find Gold!</button>
        </form>
    </div>

    <div class="box1"><h3>House</h3> (earns 2-5 gold)
        <form action="/gold" method="post">
            <input  type="hidden" name="loc" value="house">
            
            <button type="submit" >Find Gold!</button>
        </form>
    </div>

    <div class="box1">

        <h3>Casiono</h3> (earns /takes 0-50 gold)
        <form action="/gold" method="post">
            <input  type="hidden" name="loc" value="casino">
            
            <button type="submit" >Find Gold!</button>
        </form>
    </div>

    <div class="down"></div>

</div>
<div class="AA">
    
    <div id="up"><h2>Activities : </h2></div>
        <div id="activities">
            <c:forEach var="x" items="${log}">
            <p>
                <c:out value="${x}"/>
            </p>
            </c:forEach>
        </div>
    </div>

</div>

</div>


</body>

</html>