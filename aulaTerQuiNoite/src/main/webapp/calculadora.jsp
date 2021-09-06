<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculadora</title>
</head>
<body>
	<h1>Calculadora</h1>
	<form action="calcularora" method="get">
	<label>Valor A:</label>
	<input type="text" name="valorA"><br>
	<label>Valor B:</label>
	<input type="text" name="valorB"><br>
	<p>Operação:</p>
	<select name="opcao">
		<option value="+">(+)</option>
		<option value="-">(-)</option>
		<option value="*">(*)</option>
		<option value="/">(/)</option>
	</select>
	<input type="submit" value="Calcular">
	</form>
</body>
</html>