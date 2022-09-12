package Negocio;

public class Leopardo extends Mamifero {
	
	//propriedades da classe
	
	private double velocidade = 0;
	
	//Métodos construtores da classe

	public Leopardo() {
		super();
	}

	public Leopardo(double peso, double altura, String nome, double litrosLeite, double velocidade) {
		super(peso, altura, nome, litrosLeite);
		this.velocidade = velocidade;
	}
	
	//Getters and Setters

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	//Métodos da classe
	
	public void correr() {
		System.out.println("Run Forest !!!!" + getVelocidade());
	}
	
	

}
