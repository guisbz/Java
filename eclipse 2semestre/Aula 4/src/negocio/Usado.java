package negocio;


public class Usado extends Imovel {
	//Propriedades da classe
	private double depreciacao = 0;
	
	//Metodos construtores da classe
	
	public Usado() {
		super();
	}


	public Usado(String endereco, double metragem, double valor, double depreciacao) {
		super(endereco, metragem, valor);
		this.depreciacao = depreciacao;
		
	}
	//Metodos get/set da classe

	public double getDepreciacao() {
		return depreciacao;
	}


	public void setDepreciacao(double depreciacao) {
		this.depreciacao = depreciacao;
	}
	
	//Métodos sobrescritos da superclasse
	public double getValor() {
		return (super.getValor() - this.getDepreciacao());
	}

}
