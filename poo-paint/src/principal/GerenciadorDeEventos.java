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
	private int  inicial_x;
	private int inicial_y;
	
	public GerenciadorDeEventos(AreaDeDesenho a, JToggleButton retangulo, JToggleButton circulo) {

		this.a = a;
		this.retangulo = retangulo;
		this.circulo = circulo;

	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("mouse pressed");
		inicial_x = e.getX();
		inicial_y = e.getY();		
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("mouse released");
		int x = e.getX();
		int y = e.getY();
		int largura = valorAbsoluto(inicial_x - x);
		int altura = valorAbsoluto(inicial_y - y);
	}
	
	private int valorAbsoluto(int numero){
		if (numero < 0)
		return - numero;
		else 
			return numero;		
	}
	
	private int numMenor(int numero1, int numero2){
		if (numero1 < numero2)
			
			return numero1;
		
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("mouse dragged");
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
