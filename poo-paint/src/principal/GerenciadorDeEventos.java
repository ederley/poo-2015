package principal;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JToggleButton;

import figuras.Circulo;
import figuras.Figura;
import figuras.Retangulo;

public class GerenciadorDeEventos extends MouseAdapter {

	private AreaDeDesenho a;
	private JToggleButton retangulo;
	private JToggleButton circulo;
	
	public GerenciadorDeEventos(AreaDeDesenho a, JToggleButton retangulo, JToggleButton circulo) {

		this.a = a;
		this.retangulo = retangulo;
		this.circulo = circulo;

	}

	public void mouseClicked(MouseEvent e) {
		boolean retanguloPressionado = this.retangulo.getModel().isPressed();
		if( retanguloPressionado == true){
			Figura f = new Retangulo(e.getX(), e.getY(), 50, 80);
			this.a.adicionaFigura(f);
			this.a.repaint();
			
		}
		else{
			Figura f = new Circulo(e.getX(), e.getY(), 20);
			this.a.adicionaFigura(f);
			this.a.repaint();
		}
	
	}
}
