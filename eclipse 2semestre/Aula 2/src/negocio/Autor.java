package negocio;

public class Autor { 
	
	//Propriedades da classe
	private String name = "";
	
	//M�todos construtores da classe
	public Autor(){}
	public Autor(String name){ this.name = name;}
	
	//M�todos get/set
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
