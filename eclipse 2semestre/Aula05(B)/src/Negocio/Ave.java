package Negocio;

public abstract class Ave extends Animal {
	
	//Propriedades da classe
	
	private int quantidadeOvos = 0;
	
	//Métodos construtores da classe

	public Ave() {
		super();
	}

	public Ave(double peso, double altura, String nome, int quantidadeOvos) {
		super(peso, altura, nome);
		this.quantidadeOvos = quantidadeOvos;
	}
	
	//Getters and Setters

	public int getQuantidadeOvos() {
		return quantidadeOvos;
	}

	public void setQuantidadeOvos(int quantidadeOvos) {
		this.quantidadeOvos = quantidadeOvos;
	}
	
	

	
	
	

}
