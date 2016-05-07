package br.usjt.arqdsis.cerveja.test;

import static org.junit.Assert.assertEquals;
import java.sql.Connection;
import java.sql.SQLException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.usjt.arqdsis.cerveja.dao.CervejasDAO;
import br.usjt.arqdsis.cerveja.dao.NotFoundException;
import br.usjt.arqdsis.cerveja.factory.ConnectionFactory;
import br.usjt.arqdsis.cerveja.model.Cervejas;

public class CervejasTest {
	
	private int idTest;
	
	@Before
	public void preparaBanco(){
		
		Cervejas cervejas = new Cervejas();
		cervejas.setAll(0, "Itaipava", "cevada", "AMBEV",1.55);

		ConnectionFactory connFactory = new ConnectionFactory();
		
		Connection conn =null;
		CervejasDAO cervejasDAO = new CervejasDAO();
		
		try {
			conn = connFactory.obtemConexao();
			cervejasDAO.create(conn, cervejas);
			idTest = cervejas.getId();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	@Test
	public void testaCriacaoRegistro(){
		
		Cervejas cervejas = new Cervejas();
		cervejas.setNomeCerveja("Itaipava");
		ConnectionFactory connFactory = new ConnectionFactory();
		
		Connection conn =null;
		CervejasDAO cervejasDAO = new CervejasDAO();
		
		try {
			conn = connFactory.obtemConexao();
			
			assertEquals("Verificação de criação",cervejasDAO.getObject(conn,idTest).getNomeCerveja(),"Itaipava");

			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	@After
	public void deleteRegistro(){
		
		Cervejas cervejas = new Cervejas();
		cervejas.setId(idTest);
		
		ConnectionFactory connFactory = new ConnectionFactory();
		
		Connection conn =null;
		CervejasDAO cervejasDAO = new CervejasDAO();
		
		try {
			conn = connFactory.obtemConexao();
			cervejasDAO.delete(conn,cervejas);
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}






