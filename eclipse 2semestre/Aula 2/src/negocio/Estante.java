package negocio;

public class Estante {
	//Propriedades da classe
	private int numero = 0;
	
	//M�todos construtores da classe
	public Estante(){}
	public Estante(int numero){ this.numero = numero;}
	
	//M�todos get/set
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

}
