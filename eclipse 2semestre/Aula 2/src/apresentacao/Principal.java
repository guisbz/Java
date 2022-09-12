package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Estante;
import negocio.Produto;

public class Principal {
	public static void main(String[] args) {
		
			//Declara��o de vari�veis
		 BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
			 
			 Produto objProduto = new Produto();
			 
			 //Entrada de dados
			 try {
			 System.out.print("Digite o nome do produto: ");
			 objProduto.setNome(leitor.readLine());
			 
			 System.out.print("Digite o n�mero da estante: ");
			 objProduto.setObjEstante(new Estante(Integer.parseInt(leitor.readLine())));
			 
			 System.out.print("Digite a quantidade do produto: ");
			 objProduto.setQuantidade(Integer.parseInt(leitor.readLine()));
			 
			 } catch (Exception erro) {
				 System.out.println(erro);
				 
			 }
			
			 
			 //Sa�da de dados
			 System.out.println("Nome do produto: " + objProduto.getNome());
			 System.out.println("Estante: " + objProduto.getObjEstante().getNumero());
			 System.out.println("Quantidade: " + objProduto.getQuantidade());
			 
		}
	
}

