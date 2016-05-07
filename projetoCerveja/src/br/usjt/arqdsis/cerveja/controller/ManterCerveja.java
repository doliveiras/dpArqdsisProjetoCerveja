package br.usjt.arqdsis.cerveja.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.usjt.arqdsis.cerveja.dao.CervejasDAO;
import br.usjt.arqdsis.cerveja.factory.ConnectionFactory;
import br.usjt.arqdsis.cerveja.model.Cervejas;

/**
 * Servlet implementation class ManterCerveja
 */
@WebServlet("/ManterCerveja.do")
public class ManterCerveja extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ManterCerveja() {
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
		if("inserir".equalsIgnoreCase(acao)) {
			response.sendRedirect("inserircerveja.jsp");
		}else if("Inserir Cerveja".equalsIgnoreCase(acao)){
			String nome = request.getParameter("nome");
			String tipo = request.getParameter("email");
			String fabricante = request.getParameter("fabricante");
			Double preco = Double.parseDouble(request.getParameter("preco")); 
			
			Cervejas cerveja = new Cervejas();
			cerveja.setAll(0, nome, tipo, fabricante, preco);
			
			try{
				Connection conn = ConnectionFactory.obtemConexao();
				CervejasDAO cervejasDao = new CervejasDAO();
				cervejasDao.create(conn, cerveja);
			} catch(SQLException e){
				e.printStackTrace();
			}
		}else if("Listar".equalsIgnoreCase(acao)){
			response.sendRedirect("listarcliente.jsp");
		}else if("Voltar".equalsIgnoreCase(acao)){
			response.sendRedirect("index.html");
		}
	}

}
