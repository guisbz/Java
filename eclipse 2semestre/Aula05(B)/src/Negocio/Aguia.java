package Negocio;

public class Aguia extends Ave {
	
	//Propriedades da classe
	
	private double autonomia = 0;
	
	//M�todos construtores da classe

	public Aguia() {
		super();
	}

	public Aguia(double peso, double altura, String nome, int quantidadeOvos, double autonomia) {
		super(peso, altura, nome, quantidadeOvos);
		this.autonomia = autonomia;
	}

	//Getters and Setters
	
	public double getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(double autonomia) {
		this.autonomia = autonomia;
	}
	
	//M�todos da classe
	
	public void voar() {
		System.out.println("Fly like an eagle into the future" + getAutonomia());
	}
	

}
