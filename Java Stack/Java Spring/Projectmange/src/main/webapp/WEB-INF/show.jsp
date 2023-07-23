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

        table, th, td {
            border:1px solid black;
        }

    </style>
</head>

<body>
<div class="wrap ">
    <div class="nav">
        <h1>the wire</h1>

    </div>
    <div class="info">
<h3>title :${lashow.title}</h3>
<h3>description :${lashow.description}</h3>
    </div>

</div>

</body>
</html>