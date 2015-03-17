package testes;


import org.junit.Assert;
import org.junit.Test;

import figuras.Retangulo;


public class TesteRetangulo {
	@Test
	public void testaRetangulo(){
		
		Retangulo retangulo1 = new Retangulo(23, 14, 30, 20);
		
		Assert.assertEquals(14, retangulo1.getY());
		
		
		String saida = retangulo1.imprime();
		Assert.assertEquals("Retangulo [x:23 y:14 largura:20 altura:30]", saida);
		
	}

	@Test
	public void testaVisibilidade(){
		
		Retangulo retangulo1 = new Retangulo(23, 14, 30, 20);
		Assert.assertEquals(23, retangulo1.getX());
		
		Assert.assertEquals(14, retangulo1.getY());
		
		Assert.assertEquals(20, retangulo1.getLargura());
		
		
		Assert.assertEquals(30, retangulo1.getAltura());
		
		retangulo1.setX(42);
		Assert.assertEquals(42, retangulo1.getX());
		
		retangulo1.setY(15);
		Assert.assertEquals(15, retangulo1.getY());
	}
	
}
