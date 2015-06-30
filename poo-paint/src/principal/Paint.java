package principal;

import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;

import figuras.Circulo;
import figuras.Figura;
import figuras.Retangulo;

public class Paint extends JFrame {

	public static void main(String[] args) {
		Paint aplicacao = new Paint();
	}
	
	

	public Paint() {
	
		
		JPanel painelPrincipal = new JPanel();
		painelPrincipal.setLayout(new BorderLayout());
		JToolBar barraDeFerramentas = new JToolBar("Barra de Ferramentas");
		barraDeFerramentas.setFloatable(true);
		painelPrincipal.add(barraDeFerramentas, BorderLayout.PAGE_START);
		ButtonGroup grupoDeBotoes = new ButtonGroup();
		JToggleButton botaoRetangulo = new JToggleButton("Retângulo");
		
		
		
		
		//botaoRetangulo.addActionListener(/* Aqui vem um ActionListener */);
		botaoRetangulo.getModel().setPressed(true);
		grupoDeBotoes.add(botaoRetangulo);
		barraDeFerramentas.add(botaoRetangulo);
		
		JToggleButton botaoCirculo = new JToggleButton("Circulo");
		grupoDeBotoes.add(botaoCirculo);
		barraDeFerramentas.add(botaoCirculo);
		
		
		AreaDeDesenho areaDeDesenho = new AreaDeDesenho();
		painelPrincipal.add(areaDeDesenho, BorderLayout.CENTER);
		
		GerenciadorDeEventos g = new GerenciadorDeEventos(areaDeDesenho, botaoRetangulo, botaoCirculo);
		areaDeDesenho.addMouseListener(g);
		areaDeDesenho.addMouseMotionListener(g);
		
		this.setContentPane(painelPrincipal);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}
}
