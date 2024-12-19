<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Visits!</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="container mt-5">
    <div class="text-center">
        <h1>You have visited <a href="/">http://localhost:8080</a> <c:out value="${count}"/> times.</h1>
        <div class="mt-4">
            <a href="/" class="btn btn-primary me-2">Test another visit?</a>
        </div>
    </div>
</body>
</html>