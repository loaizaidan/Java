<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.css" />
    <link rel="stylesheet" href="/css/style.css"/>
</head>
<body>
    <div class="main_container">
        <div class="fruits-table">
            <table class="table">
                <thead>
                <tr>
                    <th scope="col">Name</th>
                    <th scope="col">Price</th>
                </tr>
                </thead>
                <tbody>

                <c:forEach var="item" items="${fruits}">
                    <tr class="${item.name.startsWith('G') ? "orange" : ""}">
                    <td><c:out value="${item.name}"></c:out></td>
                    <td><c:out value="${item.price}"></c:out></td>
                    </tr>
                </c:forEach>

                </tbody>
            </table>
        </div>
    </div>
</body>
</html>