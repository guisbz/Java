package negocio;

public class Turma {
	//Propriedades da classe
	private Cadeira objCadeira = null;
	private Professor objProfessor = null;
	private String letra = "";
	private Aluno[] colecaoAlunos = new Aluno[50];
	private int qtdAlunos = 0;
	
	
	//Metodos construtores da classe
	public Turma() {
	}


	public Turma(Cadeira objCadeira, Professor objProfessor, String letra, Aluno[] colecaoAlunos) {
		super();
		this.objCadeira = objCadeira;
		this.objProfessor = objProfessor;
		this.letra = letra;
		this.colecaoAlunos = colecaoAlunos;
	}

	//Metodos get/set da classe
	public Cadeira getObjCadeira() {
		return objCadeira;
	}


	public void setObjCadeira(Cadeira objCadeira) {
		this.objCadeira = objCadeira;
	}


	public Professor getObjProfessor() {
		return objProfessor;
	}


	public void setObjProfessor(Professor objProfessor) {
		this.objProfessor = objProfessor;
	}


	public String getLetra() {
		return letra;
	}


	public void setLetra(String letra) {
		this.letra = letra;
	}


	public Aluno[] getColecaoAlunos() {
		return colecaoAlunos;
	}


	public void setColecaoAlunos(Aluno[] colecaoAlunos) {
		this.colecaoAlunos = colecaoAlunos;
	}
	//Metodos da classe
	//Esse if ? s? uma prote??o para que ningu?m insira
	//mais alunos do que a quantidade m?xima permitida
	public void adicionarAluno(Aluno objAluno) {
		if (qtdAlunos < colecaoAlunos.length) {
			colecaoAlunos[qtdAlunos] = objAluno;
			qtdAlunos++;
		}
	}
	


		public String listarAlunos() {
			String retorno = "Matr?cula \t Nome\n";
			
			for (int i = 0; i < qtdAlunos ; i++) {
				retorno += colecaoAlunos[i].getMatricula() + "\t" +
				colecaoAlunos[i].getNome() + "\n";
				
			}
			return retorno;
}
}