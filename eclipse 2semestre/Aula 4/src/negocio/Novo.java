package negocio;

public class Novo extends Imovel {
	//Propriedades da classe
	private double adicional = 0;
	
	//Metodos construtores da classe
	
	public Novo() {
		super();
	}


	public Novo(String endereco, double metragem, double valor, double adicional) {
		super(endereco, metragem, valor);
		this.adicional = adicional;
		
	}
	//Metodos get/set da classe

	public double getAdicional() {
		return adicional;
	}


	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	//Métodos sobrescritos da superclasse
	public double getValor() {
		return (super.getValor() + this.getAdicional());
	}

}
