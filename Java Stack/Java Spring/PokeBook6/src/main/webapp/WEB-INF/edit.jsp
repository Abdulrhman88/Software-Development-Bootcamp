<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
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
    <div class="nav ">
        <h1 style="color:green;">Edit Expense</h1>
        <a href="poke">Go back</a>
    </div>
    <div class="form">
        <form:form action="/poke/${id}/update" method="POST" modelAttribute="pokeupdate">

                <form:label path="expense">Expense Name :</form:label>
            <form:input type="text" path="expense"></form:input><br>

                <form:label path="vendor">Vendor:</form:label>
                <form:input type="text" path="vendor"></form:input><br>

            <form:label path="expense">amount :</form:label>
                <form:input type="text" path="amount"></form:input><br>

                <form:label path="description">Descripotin:</form:label>

                <form:textarea path="description"  cols="30" rows="10"></form:textarea><br>
                <input type="submit" value="Sumbit">

        </form:form>
    </div>
</div>

</body>
</html>