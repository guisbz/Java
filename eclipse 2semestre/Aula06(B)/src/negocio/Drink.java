package negocio;

public class Drink {
	//Propriedades da classe
	Ingrediente[] colecao = new Ingrediente[10];
	private int qtdIngredientes = 0;
	
	//Metodos construtores da classe
	public void adicionar(Ingrediente objIngrediente) {
		if (qtdIngredientes < colecao.length) {
			colecao[qtdIngredientes] = objIngrediente;
			qtdIngredientes++;
			
		}
	}

	
	public String beber() {
		String retorno = "";
		
		for (int i = 0 ; i < qtdIngredientes ; i++) {
			retorno += colecao[i].getQuantidade() + " " +
						colecao[i].getUnidade() + " de " +
						colecao[i].getNome() + "\n";
 		}
		return retorno;
	}
}
