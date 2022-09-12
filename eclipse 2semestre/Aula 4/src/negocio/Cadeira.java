package negocio;

public class Cadeira {
	//Propriedades da classe
 private String nome = "";

//Metodos construtores da classe
public Cadeira() {
}

public Cadeira(String nome) {
	super();
	this.nome = nome;
}

//Metodos get/set da classe
public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}
 
}
