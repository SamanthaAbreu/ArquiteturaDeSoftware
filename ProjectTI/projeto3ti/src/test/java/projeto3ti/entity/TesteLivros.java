package projeto3ti.entity;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import projeto3ti.entity.Genero;
import projeto3ti.entity.Livro;

 
public class TesteLivros {
	
	@Test
	public void testeLivrosPreço () {
		
		Livro livro = new Livro ("A Cabana", "William Pyoung", "Arqueiro",2017,new Genero ("Ficção Religiosa"));
		
	
		assertEquals ("A Cabana", livro.getTitulo());
		assertEquals("William Pyoung", livro.getAutor());
		assertEquals("Arqueiro", livro.getEditora());
		//assertEquals(2017, livro.getAno());
		
		
		
	}

}
