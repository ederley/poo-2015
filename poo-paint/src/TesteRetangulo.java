

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

}
