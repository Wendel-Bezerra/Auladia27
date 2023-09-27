<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Formulário</title>
</head>
<body>
    <form action="ConcatenaDadosServlet" method="post">
        Nome: <input type="text" name="nome"><br>
        Estado Civil: 
        <select name="estadoCivil">
            <option value="solteiro">Solteiro(a)</option>
            <option value="casado">Casado(a)</option>
            <option value="divorciado">Divorciado(a)</option>
            <option value="viuvo">Viúvo(a)</option>
        </select><br>
        Faixa Etária: 
        <select name="faixaEtaria">
            <option value="3-10">3 a 10 anos</option>
            <option value="11-25">11 a 25 anos</option>
            <option value="36-55">36 a 55 anos</option>
            <option value="56-100">56 a 100 anos</option>
        </select><br>
        <input type="submit" value="Enviar">
    </form>
</body>
</html>
