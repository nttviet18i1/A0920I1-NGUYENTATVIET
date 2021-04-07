<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 3/26/2021
  Time: 7:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product discout</title>
</head>
<body>
<form method="post" action="/product">
    <input type="text" name="txtproduct" placeholder="Product: "/>


        <select  name="price">
            <option value="1000">1000</option>
            <option value="2000">2000</option>
            <option value="3000">3000</option>
            <option value="4000">4000</option>
            <option value="5000">5000</option>
        </select>


    <input type="text" name="discount" placeholder="Discount Percent: "/>
    <input type = "submit" id = "submit" value = "Submit"/>
</form>

</body>
</html>
