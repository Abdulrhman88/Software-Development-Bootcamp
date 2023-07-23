<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Success!</title>
    <style>
        .wrap{
            margin: 0 auto;
        }
        .nav{
            display: flex;
            justify-content: space-between;
        }

        table, th, td {
            border:1px solid black;
        }

    </style>
</head>

<body>
<div class="wrap ">
    <div class="nav">
        <h1>Hello <c:out value="${user.userName}" /> Welcome to</h1>
        <h1>Book Broker</h1>
        <a href="/book/new">add to my shelf</a>
    </div>


<h3>Available Books to Borrow</h3>
    <table style="width:100%">
        <tr>
            <td>ID</td>
            <td>title</td>
            <td>Autor name</td>
            <td>owner</td>
            <td>action</td>

        </tr>
        <c:forEach var="x" items="${books}">
            <c:if test="${x.borrow==null}">

            <tr>


                <td>${x.id}</td>
                <td><a href="/info/${x.id}">${x.title}</a></td>
                <td>${x.author}</td>
                <td><c:out value="${x.user.userName}"/></td>
                <td>
                    <c:if test="${x.user.id==user.id}">                        <p>
                            <a href="/book/${x.id}/edit">Edit</a>

                        <form action="/books/${x.id}" method="post">
                            <input type="hidden" name="_method" value="delete">
                            <input type="submit" value="Delete">
                        </form>
                        </p>
                    </c:if>
                        <p>
                            <a href="/borrow/${x.id}">Borrow</a>
                        </p>
            </c:if>

                </td>

            </tr>
        </c:forEach>



    </table>
    <hr>
    <h3>Books im Borrowing..</h3>
    <table style="width:100%">
        <tr>
            <td>ID</td>
            <td>title</td>
            <td>Autor name</td>
            <td>owner</td>
            <td>action</td>

        </tr>

        <c:forEach var="x" items="${books}">
        <c:if test="${x.borrow.id==user.id}">
            <tr>


                <td><c:out value="${x.id}"></c:out></td>
                <td><c:out value="${x.title}"></c:out></td>
                <td><c:out value="${x.author}"></c:out></td>
                <td><c:out value="${x.user.userName}"></c:out></td>
                <td>
                    <a href="return/${x.id}">remove</a>
                </td>
            </tr>
        </c:if>
        </c:forEach>
    </table>


</div>
</body>
</html>