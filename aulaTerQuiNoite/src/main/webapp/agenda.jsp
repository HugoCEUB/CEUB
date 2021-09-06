<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>Agenda de contatos</title>
<link rel="icon" href="imagens/phone.png">
<link rel="stylesheet" href="style.css">
</head>
<body>
Agenda JSP
	<form action="ServletPaginaAgenda" method="post">
		Nome:<input type="text" name="nome"/><br>
		Telefone:<input type="text" name="telefone"/><br>
		Data de Nascimento:<input type="text" name="dataNascimento"/><br>
		<input type="submit" name="Enviar"/>
	</form>
</body>
</html>