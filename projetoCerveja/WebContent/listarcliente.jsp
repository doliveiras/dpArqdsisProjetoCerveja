<%@page import="java.sql.Connection"%>
<%@page import="java.sql.SQLException"%>
<%@page import="br.usjt.arqdsis.cerveja.dao.ConnectionFactory"%>
<%@page import="br.usjt.arqdsis.cerveja.dao.ClienteDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista cliente</title>
</head>
<body>
	<form method="post" action="ManterCliente.do">
		<h1>Lista de cliente</h1>

		<%
		Connection conn = ConnectionFactory.obtemConexao();
		ClienteDao clienteDao = new ClienteDao(); 
		try{
			out.println(clienteDao.loadAll(conn));
		} catch(SQLException e){
			e.printStackTrace();
		}
		%>

		<input type="submit" value="voltar" name="acao">
	</form>
</body>
</html>