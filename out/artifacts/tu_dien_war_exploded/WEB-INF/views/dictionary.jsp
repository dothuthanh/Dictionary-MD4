<%--
  Created by IntelliJ IDEA.
  User: BipVuong
  Date: 8/17/2020
  Time: 11:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
</head>
<body>
<form action="search" method="post">
    <fieldset>
        <legend>Dictionary</legend>
        <input type="text" name="engWord" placeholder="enter engWord">
        <input type="submit" value="search">
    </fieldset>
</form>
<h1>${Result}</h1>
</body>
</html>
