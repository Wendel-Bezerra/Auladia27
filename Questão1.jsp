<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Calculadora</title>
</head>
<body>
    <h1>Calculadora</h1>
    <form action="CalculadoraServlet" method="post">
        Número 1: <input type="text" name="numero1"><br>
        Número 2: <input type="text" name="numero2"><br>
        <input type="submit" value="Calcular">
    </form>
</body>
</html>
