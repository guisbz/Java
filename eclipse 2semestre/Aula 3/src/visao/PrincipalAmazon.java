package visao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Compra;
import negocio.Produto;
import negocio.Tipo;

public class PrincipalAmazon {
	public static void main(String[] args) {
		
	
	//Declaração de variáveis
		BufferedReader leitor = new BufferedReader(
								new InputStreamReader(
								System.in));
		
		Produto objProduto = new Produto();
		Compra objCompra = new Compra();

	
	//Entrada de dados
		try {
		System.out.println("Digite o nome do produto: ");
		objProduto.setNome(leitor.readLine());
		
		System.out.println("Digite o tipo do produto: ");
		objProduto.setObjTipo(new Tipo(leitor.readLine()));
		
		System.out.println("Digite o preço do produto: ");
		objProduto.setPreco(Double.parseDouble(leitor.readLine()));
		
		objCompra.setObjProduto(objProduto);
		
		System.out.println("Digite a quantidade: ");
		objCompra.setQuantidade(Integer.parseInt(leitor.readLine()));
		
		System.out.println("Digite a data: ");
		objCompra.setDataTela(leitor.readLine());
		
		System.out.println("Digite o cartão: ");
		objCompra.setCartao(leitor.readLine());
		
		} catch (Exception erro) {
			System.out.println(erro);
		}
		//Saida de dados
		System.out.println("Produto: " + objCompra.getObjProduto().getNome());
		
		System.out.println("Tipo: " + objCompra.getObjProduto().getObjTipo().getDescricao());
		
		System.out.println("Preço: " + objCompra.getObjProduto().getPreco());
		
		System.out.println("Data: " + objCompra.getDataTela());
		
		System.out.println("Cartão: " + objCompra.getCartao());
		
		System.out.println("Valor total da compra: " + (objCompra.getQuantidade() * objCompra.getObjProduto().getPreco()));
		
		
		
	}
}
