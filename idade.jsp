<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Idade Atual</title>
</head>
<body>
    <h1>Sua idade atual é: <%= request.getAttribute("idade") %> anos</h1>
</body>
</html>
