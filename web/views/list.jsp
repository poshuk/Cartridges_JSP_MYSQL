<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<link rel="stylesheet" href="styles/style.css"  type="text/css">

<html>
<head>
    <title>Cartridges list</title>
</head>
<body>
<div>
    <table>
        <caption>
            <h1>Список всех заменных картриджей</h1>
        </caption>
        <c:forEach var="cartridges" items="${cartridges}">
            <tr>
                <td><c:out value="${cartridges.id}" /></td>
                <td><c:out value="${cartridges.date}" /></td>
                <td><c:out value="${cartridges.modelPrinter}" /></td>
                <td><c:out value="${cartridges.modelCartridge}" /></td>
                <td><c:out value="${cartridges.company}" /></td>
                <td><c:out value="${cartridges.department}" /></td>
                <td><c:out value="${cartridges.note}" /></td>
                <td><c:out value="${cartridges.lastName}" /></td>

            </tr>
        </c:forEach>
    </table>
</div>

</body>
</html>
