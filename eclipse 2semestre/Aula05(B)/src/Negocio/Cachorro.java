package Negocio;

public class Cachorro extends Mamifero {
	
	//Propriedades da classe
	
	private double forcaMordida = 0;

	//Métodos construtores da classe

	public Cachorro() {
		super();
	}

	public Cachorro(double peso, double altura, String nome, double litrosLeite, double forcaMordida) {
		super(peso, altura, nome, litrosLeite);
		this.forcaMordida = forcaMordida;
	}
	
	//Getters and Setters

	public double getForcaMordida() {
		return forcaMordida;
	}

	public void setForcaMordida(double forcaMordida) {
		this.forcaMordida = forcaMordida;
	}
	
	//Métodos da classe
	
	public void morder() {
		System.out.println("WOLF ! WOLF!" + getForcaMordida());
	}
	
	
	
	

}
