package Negocio;

public abstract class Mamifero extends Animal{
	
	// propriedades da classe
	
	private double litrosLeite = 0;
	
	//Métodos construtores da classe

	public Mamifero() {
		super();
	}

	public Mamifero(double peso, double altura, String nome, double litrosLeite) {
		super(peso, altura, nome);
		this.litrosLeite = litrosLeite;
	}

	//Getters and Setters
	
	public double getLitrosLeite() {
		return litrosLeite;
	}

	public void setLitrosLeite(double litrosLeite) {
		this.litrosLeite = litrosLeite;
	}
	
	

	
	
	
	
	

}
