package figuras;

public class Retangulo extends Figura  {
	private int altura;
	private int largura;
	
	public Retangulo(int x,int y,int altura,int largura){
		super(x,y);
		this.altura = altura;
		this.largura = largura;
		
	}
	
	public String imprime(){
		return "Retangulo [x:" + this.x + " y:" + this.y + " largura:" + this.largura + " altura:" + this.altura + "]";
	}

	public int getAltura() {
		return altura;
	}

	public int getLargura() {
		return largura;
	}

  }


