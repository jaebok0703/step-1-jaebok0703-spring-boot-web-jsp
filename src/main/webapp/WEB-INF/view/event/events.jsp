<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Events</title>
</head>
<body>
    <h1>Event List</h1>
    <h3>${message}</h3>
    <hr/>
    <table>
        <thead>
            <tr>
                <th>Name</th>
                <th>Limit of enrollment</th>
                <th>Start Time</th>
                <th>End Time</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${events}" var="event">
            <tr>
                <td>${event.name}</td>
                <td>${event.limitOfEnrollment}</td>
                <td>${event.startDateTime}</td>
                <td>${event.endDateTime}</td>
            </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>