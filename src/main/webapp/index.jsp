<%--
  Created by IntelliJ IDEA.
  User: lina.pugo
  Date: 3/10/2017
  Time: 11:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello, web!</title>
</head>
<body>
<form method="post" action="/hello">
    <h3>Please enter your personal data: </h3>
    <table>
        <tr>
            <td><label for="user-name">Name: </label></td>
            <td><input id="user-name" type="text" name="userName"></td>
        </tr>
        <tr>
            <td><label for="sur-name">Surname: </label></td>
            <td><input id="sur-name" type="text" name="userSurname"></td>
        </tr>
        <tr>
            <td><label for="e-mail">E-mail: </label></td>
            <td><input id="e-mail" type="text" name="email"></td>
        </tr>
    </table>
    <br>
    <input type="submit" value="Submit">
</form>
</body>
</html>
