package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Cilindro;
import negocio.Cubo;
import negocio.Solido;

public class PrincipalGeometriaEspacial {
	
	public static void main(String[] args) {
		//Declaração de variáveis
		BufferedReader leitor = new BufferedReader(
								new InputStreamReader(
								System.in));
		
		Solido objSolido = null;
		int opcao = 0;
		
		//Entrada de dados
		try {
			System.out.print("Digite 1 para cubo ou" + "2 para cilindro: ");
			opcao = Integer.parseInt(leitor.readLine());
			
			if (opcao == 1) {
				objSolido = new Cubo();
				
				System.out.println("Digite a aresta: ");
				((Cubo) objSolido).setAresta(Double.parseDouble(leitor.readLine()));
			} else {
				objSolido = new Cilindro();
				System.out.println("Digite o raio: ");
				((Cilindro) objSolido).setRaio(Double.parseDouble(leitor.readLine()));
				System.out.println("Digite a altura: ");
				((Cilindro) objSolido).setAltura(Double.parseDouble(leitor.readLine()));
			}
		
		
		} catch (Exception erro) {
			System.out.println(erro);
			
		}
		
		//Saida de dados
		System.out.println("Area: " + objSolido.calcularArea());
		
		System.out.println("Volume: " + objSolido.calcularVolume());
	}

}
