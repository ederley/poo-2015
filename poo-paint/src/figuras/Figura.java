package figuras;

public class Figura {
	protected int x;
	protected int y;

	public Figura(int x, int y) {

		this.x = x;
		this.y = y;

	}

	public String imprime() {
		return "Figura";
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public void setX(int valor) {
		this.x = valor;

	}

	public void setY(int valor) {
		this.y = valor;

	}

}
