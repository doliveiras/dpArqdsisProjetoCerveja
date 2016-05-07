package br.usjt.arqdsis.cerveja.test;

import static org.junit.Assert.assertEquals;
import java.sql.Connection;
import java.sql.SQLException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.usjt.arqdsis.cerveja.dao.ClienteDao;
import br.usjt.arqdsis.cerveja.dao.NotFoundException;
import br.usjt.arqdsis.cerveja.factory.ConnectionFactory;
import br.usjt.arqdsis.cerveja.model.Cliente;

public class ClienteTest {
	
	private int idTest;
	
	@Before
	public void preparaBanco(){
		
		Cliente cliente = new Cliente();
		cliente.setAll(0, "Leandro", "11975297226", "reverso10@gmail.com");

		ConnectionFactory connFactory = new ConnectionFactory();
		
		Connection conn =null;
		ClienteDao clienteDao = new ClienteDao();
		
		try {
			conn = connFactory.obtemConexao();
			clienteDao.create(conn, cliente);
			idTest = cliente.getId();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	@Test
	public void testaCriacaoRegistro(){
		
		Cliente cliente = new Cliente();
		cliente.setNome("Leandro");
		ConnectionFactory connFactory = new ConnectionFactory();
		
		Connection conn =null;
		ClienteDao clienteDao = new ClienteDao();
		
		try {
			conn = connFactory.obtemConexao();
			
			assertEquals("Verificação de criação",clienteDao.getObject(conn,idTest).getNome(),"Leandro");

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
		
		Cliente cliente = new Cliente();
		cliente.setId(idTest);
		
		ConnectionFactory connFactory = new ConnectionFactory();
		
		Connection conn =null;
		ClienteDao clienteDao = new ClienteDao();
		
		try {
			conn = connFactory.obtemConexao();
			clienteDao.delete(conn,cliente);
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






