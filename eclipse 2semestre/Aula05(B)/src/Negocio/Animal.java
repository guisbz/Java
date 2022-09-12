package Negocio;

public abstract class Animal {
	
		// ao colocar abstract n�o vei se rposs�vel fazer new animal();
	
	//Propriedades da classe
	
	private double peso = 0;
	private double altura = 0;
	private String nome = "";
	
	//M�todos construtores da classe
	
	public Animal() {
		super();
	}
	public Animal(double peso, double altura, String nome) {
		super();
		this.peso = peso;
		this.altura = altura;
		this.nome = nome;
	}
	
	
	//Getters and Setters
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//m�todos da classe
	
	public double calcularIMC() {
		return(getPeso() / Math.pow(getAltura(), 2));
	}
	
	

}
