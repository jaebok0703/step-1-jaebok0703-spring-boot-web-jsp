<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Menus</title>
</head>
<body>
    <h1>Menu List</h1>
    <h3>${message}</h3>
    <hr/>
    <table>
        <thead>
            <tr>
                <th>Name</th>
                <th>Price</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${menus}" var="menu">
            <tr>
                <td>${menu.name}</td>
                <td>${menu.price}</td>
            </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>