<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Formulário</title>
</head>
<body>
    <form action="CalculaIdadeServlet" method="get">
        Ano de Nascimento: <input type="text" name="anoNascimento"><br>
        Já fez aniversário este ano? 
        <input type="radio" name="fezAniversario" value="sim">Sim
        <input type="radio" name="fezAniversario" value="nao">Não<br>
        <input type="submit" value="Enviar">
    </form>
</body>
</html>
