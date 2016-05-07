package br.usjt.arqdsis.cerveja.test;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import br.usjt.arqdsis.cerveja.factory.ConnectionFactory;

public class ConnectionFactoryTest {

	@Test
	public void testObtemConexao() {
		try{
			assertNotNull("testa se a conexao nao e nula", ConnectionFactory.obtemConexao());
		} catch(SQLException e){
			e.printStackTrace();
			fail("Gerou SQLException");
		}
	}

}
