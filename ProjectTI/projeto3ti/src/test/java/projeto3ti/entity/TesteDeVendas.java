package projeto3ti.entity;

import org.junit.Test;

import projeto3ti.entity.Genero;
import projeto3ti.entity.Livro;

public class TesteDeVendas {
	
	@Test
	public void testaTotalDeVendas () {
		Livro livro  = new Livro ("Desaparecido Para Sempre","Harlan Coben","Arqueiro",2012, new Genero ("Suspense"));
		new Item (livro,2);
		Venda venda = new Venda();
	}

}
