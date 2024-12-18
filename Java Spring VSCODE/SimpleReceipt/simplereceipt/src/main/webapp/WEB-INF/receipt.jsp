<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Simple Receipt</title>
</head>
<body>
    <h2>Customer Name: <c:out value="${name}"></h2>
    <h4>Item Name: <c:out value="${itemName}"></h4>
    <h4>Price: <c:out value="${price}"></h4>
    <h4>Description: <c:out value="${description}"></h4>
    <h4>Vendor: <c:out value="${vendor}"></h4>
</body>
</html>