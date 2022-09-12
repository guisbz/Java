package negocio;

public class Cilindro implements Solido {
	//Propriedades da classe
	private double raio = 0;
	private double altura = 0;
	
	//Métodos construtores da classe
	public Cilindro() {
		super();
	}

	public Cilindro(double raio, double altura) {
		super();
		this.raio = raio;
		this.altura = altura;
	}

	//Gets and Sets

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	//Metodos implementados da interface
	public double calcularArea() {
		double areaBase = (Math.PI * Math.pow(raio, 2));
		double areaTopo = areaBase;
		double areaLateral = (2 * Math.PI * raio * altura);
		
		return (areaBase + areaLateral + areaTopo);
	}
	
	public double calcularVolume() {
		
		return (Math.PI * Math.pow(raio, 2) * altura);
	}

}
