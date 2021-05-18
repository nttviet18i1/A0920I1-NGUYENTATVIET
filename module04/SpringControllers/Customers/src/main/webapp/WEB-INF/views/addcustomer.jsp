<%--
  Created by IntelliJ IDEA.
  User: Viet
  Date: 5/16/2021
  Time: 7:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Create New Customer</h1>
<form action="/create" method="post">
    <label>ID: </label> <input type="text" name="id">
    <label>Name: </label> <input type="text" name="name">
    <label>AGE: </label> <input type="text" name="age">
    <label>ADDRESS: </label> <input type="text" name="address">
    <button type="submit">Submit</button>
</form>

</body>
</html>
