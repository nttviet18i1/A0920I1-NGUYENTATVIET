<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 4/6/2021
  Time: 12:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>DANH SACH KHACH HANG</h1>
  <table>
    <tr>
      <td>Name</td>
      <td>BirthDay</td>
      <td>Address</td>
      <td>Image</td>
    </tr>
    <tr>
      <c:forEach items="${customer}" var="cus">
    <tr>
      <th scope="row">${cus.name}</th>
      <td>${cus.birthday}</td>
      <td>${cus.address}</td>
      <td><img src="${cus.image}" alt="image" border=3 height=100 width=100></img></td>
    </tr>
    </c:forEach>
    </tr>
  </table>
  </body>
</html>
