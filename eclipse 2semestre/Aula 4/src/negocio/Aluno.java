package negocio;

public class Aluno {
	//Propriedades da classe
	private int matricula = 0;
	private String nome = "";
	
	//Metodos construtores da classe
	
	public Aluno() {
	}

	public Aluno(int matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}

	//Metodos get/set da classe
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
	

}
