<%--
  Created by IntelliJ IDEA.
  User: Viet
  Date: 5/18/2021
  Time: 3:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form:form action="login" method="post" modelAttribute="login" >
    <fieldset>
        <h1>Login</h1>
        <TABLE>
            <tr>
                <td><form:label path="account">Acount</form:label></td>
                <td><form:input path="account"></form:input></td>
            </tr>
            <tr>
                <td><form:label path="password">PassWord</form:label></td>
                <td><form:input path="password"></form:input></td>
            </tr>
            <tr>
                <td><form:button >Login</form:button> </td>
            </tr>
        </TABLE>
    </fieldset>
</form:form>

</body>
</html>
