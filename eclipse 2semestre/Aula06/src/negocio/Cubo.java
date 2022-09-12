package negocio;

public class Cubo implements Solido {
	//Propriedades da classe
	private double aresta = 0;

	public Cubo() {
		super();
	}

	public Cubo(double aresta) {
		super();
		this.aresta = aresta;
	}
	//metodos get/set da classe

	public double getAresta() {
		return aresta;
	}

	public void setAresta(double aresta) {
		this.aresta = aresta;
	}
	//Metodos implementados da classe
	public double calcularArea() {
		return (6 * Math.pow(aresta, 2));
	}

	public double calcularVolume() {
		return (Math.pow(aresta, 3));
	}
	
}
