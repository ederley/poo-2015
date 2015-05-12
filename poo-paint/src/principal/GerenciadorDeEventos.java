package principal;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import figuras.Figura;
import figuras.Retangulo;

public class GerenciadorDeEventos extends MouseAdapter {

	private AreaDeDesenho a;    
	
	public GerenciadorDeEventos (AreaDeDesenho a){
		
	this.a = a;
		
		
	}
	
	public void mouseClicked(MouseEvent e){
		Figura f = new Retangulo(e.getX(),e.getY(), 50, 80);
		this.a.adicionaFigura(f);
		this.a.repaint();
	}
}
