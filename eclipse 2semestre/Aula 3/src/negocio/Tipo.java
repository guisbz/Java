package negocio;

public class Tipo {
	//Propriedades da classe
	private String descricao= "";
	//Metodos construtores da classe

	public Tipo(String descricao) {
		this.descricao = descricao;
	}
	//
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
