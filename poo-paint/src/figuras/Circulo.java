package figuras;

public class Circulo extends Figura{
	
	private int diametro;

	public Circulo(int x, int y, int diametro) {
		super(x, y);
		this.diametro = diametro;
	}

	public String imprime() {
		return "Circulo [x:" + this.x + " y:" + this.y + " diametro:" + this.diametro + "]";
	}

	public int getdiametro() {
		return diametro;
	}

	public void setdiametro() {

	}

}