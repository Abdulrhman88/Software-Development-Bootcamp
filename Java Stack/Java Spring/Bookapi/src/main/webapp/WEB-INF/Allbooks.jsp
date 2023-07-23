<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    

    <table style="width:100%">
        <tr>
          <td>ID</td>
          <td>title</td>
          <td>language</td>
          <td># Pages</td>
        </tr>
        
        <c:forEach var="x" items="${allbooks}">
        <tr>
          <td><a href="" value="${x.title}"></a></td>
          <td><a href="" value="${x.language}"></a></td>
          <td><a href="" value="${x.numberOfPages}"></a></td>
        </tr>
    </c:forEach>
      </table>

</body>
</html>