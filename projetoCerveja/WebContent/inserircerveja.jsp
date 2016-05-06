<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastrar Cerveja</title>
</head>
<body>
	<form method="post" action="ManterCerveja.do">
		<h1>Entrada de dados Cerveja</h1>
		
		Nome:<input type="text" name="nome"><br>
		Tipo:<input type="text" name="tipo"><br>
		Fabricante:<input type="text" name="fabricante"><br>
		Preço:<input type="text" name="preco"><br>
		
		<input type="submit" value="Inserir Cerveja" name="acao">
	</form>
</body>
</html>