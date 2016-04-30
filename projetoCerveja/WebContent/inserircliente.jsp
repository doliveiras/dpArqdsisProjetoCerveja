<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inserir Cliente</title>
</head>
<body>
	<h1>Inserir Cliente</h1>
	<form method="post" action="ManterCliente.do">
		<h3>Entre com dados do cliente</h3>
		
		Nome:<input type="text" name="nome"><br> 
		E-mail:<input type="text" name="email"><br> 
		Telefone:<input type="text" name="fone"><br> 
		
		<input type="submit" value="Inserir Cliente" name="acao">
	</form>
</body>
</html>