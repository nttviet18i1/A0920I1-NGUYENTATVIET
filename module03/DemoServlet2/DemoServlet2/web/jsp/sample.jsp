<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: linht
  Date: 3/29/2021
  Time: 6:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%! String test = "Sample text"; %>
<%--    <%--%>
<%--        String[] test = {"Hello","Bonjour"};--%>
<%--//        test += " Nam";--%>
<%--    %>--%>
<%--    <%! int k = 7; %>--%>

<%--&lt;%&ndash;    <h1><%=test%></h1>&ndash;%&gt;--%>
<%--    <%--%>
<%--        for(String str : test) {--%>
<%--    %>--%>
<%--    <h1><%=str%></h1>--%>
<%--    <%--%>
<%--        }--%>
<%--    %> --%>
    <c:if test="${error != null}">
        <h1>${error}</h1>
    </c:if>
    <a><%=test%></a>
    <a>${test}</a>
    <c:choose>
        <c:when test="${dtb >= 9}">
            <h2>Xuất sắc</h2>
        </c:when>
        <c:when test="${dtb >= 8}">
            <h2>Giỏi</h2>
        </c:when>
        <c:when test="${dtb >= 6.5}">
            <h2>Khá</h2>
        </c:when>
        <c:when test="${dtb >= 5}">
            <h2>Trung Bình</h2>
        </c:when>
        <c:otherwise>
            <h2>Yếu</h2>
        </c:otherwise>
    </c:choose>
    <c:forEach items="${listNames}" var="name">
        <h2>${name}</h2>
    </c:forEach>

</body>
</html>
