package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Carro;
import negocio.Fabricante;
import negocio.Moto;
import negocio.Veiculo;

public class Principal {
	public static void main(String[] args) {
		
		//Declaração de variaveis
		
		BufferedReader leitor = new BufferedReader(
								new InputStreamReader(
								System.in));
		
		Veiculo objVeiculo = null;
		int opcao = 0;
		
		//Entrada de dados
		
		try {
			do {
				System.out.print("Digite <1> para carro ou <2> para moto: ");
				opcao = Integer.parseInt(leitor.readLine());
				
				switch (opcao) {
				case 1:
					objVeiculo = new Carro();
					break;
				
				
				case 2:
					objVeiculo = new Moto();
					break;
				
				default:
					System.out.println("Digite <1> ou <2>");
				}	
				
			}while((opcao != 1) && (opcao != 2));
			
			System.out.print("Digite o modelo: ");
			objVeiculo.setModelo(leitor.readLine());
			
			System.out.println("Digite o fabricante: ");
			objVeiculo.setObjFabricante(new Fabricante(leitor.readLine()));
			
			System.out.print("Digite a cor: ");
			objVeiculo.setCor(leitor.readLine());
			
			if (opcao == 1) {
				System.out.println("Digite <T> para teto solar: ");
				((Carro) objVeiculo).setTetoSolar(leitor.readLine().equalsIgnoreCase("T"));
			}else {
				System.out.print("Digite a cilindrada: ");
				((Moto) objVeiculo).setCilindrada(Integer.parseInt(leitor.readLine()));
			}
			
			
		} catch (Exception erro) {
			System.out.print(erro);
		}
		
		//Saida de dados
		System.out.println("Modelo: " + objVeiculo.getModelo());
		System.out.println("Fabricante: " + objVeiculo.getObjFabricante().getNome());
		System.out.println("Cor: " + objVeiculo.getCor());
		if (opcao == 1) {
			System.out.println("Teto solar: " + ((((Carro) objVeiculo).isTetoSolar()) ? "SIM" : "NAO"));
		}else {
			System.out.println("Cilindrada: " + ((Moto) objVeiculo).getCilindrada());
		}
		
	}

}

