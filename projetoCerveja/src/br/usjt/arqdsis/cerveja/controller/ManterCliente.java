package br.usjt.arqdsis.cerveja.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.usjt.arqdsis.cerveja.dao.ClienteDao;
import br.usjt.arqdsis.cerveja.dao.ConnectionFactory;
import br.usjt.arqdsis.cerveja.model.Cliente;

/**
 * Servlet implementation class ManterCliente
 */
@WebServlet("/ManterCliente.do")
public class ManterCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ManterCliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String acao = request.getParameter("acao");
		if ("inserir".equalsIgnoreCase(acao)){
			response.sendRedirect("inserircliente.jsp");
		}else if("Inserir Cliente".equalsIgnoreCase(acao)){
			String nome = request.getParameter("nome");
			String email = request.getParameter("email");
			String fone = request.getParameter("fone");

			Cliente cliente = new Cliente();
			cliente.setAll(0, nome, fone, email);

			try{
				Connection conn = ConnectionFactory.obtemConexao();
				ClienteDao clienteDao = new ClienteDao();
				clienteDao.create(conn, cliente);
				
			} catch (SQLException e){
				e.printStackTrace();
			}
			response.sendRedirect("index.html");
		}
	}

}
