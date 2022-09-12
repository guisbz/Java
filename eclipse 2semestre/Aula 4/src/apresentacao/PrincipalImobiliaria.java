package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Imovel;
import negocio.Novo;
import negocio.Usado;

public class PrincipalImobiliaria {
	public static void main(String[] args) {
		//Declaração de variáveis
					BufferedReader leitor = new BufferedReader(
											new InputStreamReader
													(System.in));
					
					
			Imovel objImovel = null;
			String opcao = "";
			
			//Entrada de dados
			try {
				System.out.print("Digite <N> para novo: ");
				opcao = leitor.readLine();
				
				if (opcao.equalsIgnoreCase("N")) {
					objImovel = new Novo();
				} else {
					objImovel = new Usado();
				}
				
				System.out.println("Digite o endereço: ");
				objImovel.setEndereco(leitor.readLine());
				
				System.out.println("Digite a metragem: ");
				objImovel.setMetragem(Double.parseDouble(leitor.readLine()));
			
				System.out.println("Digite o valor: ");
				objImovel.setValor(Double.parseDouble(leitor.readLine()));
				
				
				if (opcao.equalsIgnoreCase("N")) {
					System.out.println("Digite o adicional: ");
					((Novo) objImovel).setAdicional(
							Double.parseDouble(leitor.readLine()));
				} else {
					System.out.println("Digite a depreciação: ");
					((Usado) objImovel).setDepreciacao(
							Double.parseDouble(leitor.readLine()));
				}
					
					
					
					
					
			} catch (Exception erro) {
				System.out.println(erro);
			}
			
			//Saida de dados
			System.out.println("Endereço: " + objImovel.getEndereco());
			System.out.println("Metragem: " + objImovel.getMetragem());
			System.out.println("Valor: R$" + objImovel.getValor());
	}

}
