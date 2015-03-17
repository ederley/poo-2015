package figuras;

public class Retangulo {
	private int x;
	private int y;
	private int altura;
	private int largura;
	
	public Retangulo(int x,int y,int altura,int largura){
		
		this.x = x;
		this.y = y;
		this.altura = altura;
		this.largura = largura;
		String s = "hello";
		String s2 = s + "ederley";
		
	}
	
	public String imprime(){
		return "Retangulo [x:" + this.x + " y:" + this.y + " largura:" + this.largura + " altura:" + this.altura + "]";
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getAltura() {
		return altura;
	}

	public int getLargura() {
		return largura;
	}

	public void setX(int x) {
		this.x = x;
	}	
	
  }


