
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Viet
  Date: 5/16/2021
  Time: 6:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p > List Customer </p>

<table border="1" >
    <tr>
        <th>ID</th>
        <th>NAME</th>
        <th>AGE</th>
        <th>ADDRESS</th>
        <th>ACTION</th>
        <a  href="/create">Create New Customer</a>
    </tr>

    <c:forEach items="${customers}" var="customer">
        <tr>
            <td>${customer.id}</td>
            <td>${customer.name}</td>
            <td>${customer.age}</td>
            <td>${customer.address}</td>
            <td><a href="/delete/${customer.id}">Delete</a> </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
