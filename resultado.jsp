<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Resultado</title>
</head>
<body>
    <h1>Resultado</h1>
    Número 1: <%= request.getAttribute("numero1") %><br>
    Número 2: <%= request.getAttribute("numero2") %><br>
    Soma: <%= request.getAttribute("soma") %><br>
    Subtração: <%= request.getAttribute("subtracao") %><br>
    Multiplicação: <%= request.getAttribute("multiplicacao") %><br>
    Divisão: <%= request.getAttribute("divisao") %><br>
    Resto da Divisão: <%= request.getAttribute("resto") %><br>
</body>
</html>
