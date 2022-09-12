package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import Negocio.Aguia;
import Negocio.Animal;
import Negocio.Ave;
import Negocio.Cachorro;
import Negocio.Leopardo;
import Negocio.Mamifero;

public class Principal {
	
	public static void main(String[] args) {
		
		//Declaração de variaveis
		
		BufferedReader leitor = new BufferedReader(
								new InputStreamReader(
								System.in));
		
		Animal objAnimal = null;
		String tipoDeAnimal = "";
		
		//Entrada de dados
		
		try {
			
			do {
				
			System.out.print("Digite <C> para cachorro, <L> para leopador, ou <A> águia");
			tipoDeAnimal = leitor.readLine().toUpperCase();
			
			if(tipoDeAnimal.equals("C")) {
				objAnimal = new Cachorro();
				
			} else if(tipoDeAnimal.equals("L")){
				objAnimal = new Leopardo();
				
			} else if(tipoDeAnimal.equals("A")){
				objAnimal = new Aguia();
				
			} else {
				System.out.println("Digite <C>, <L> ou <A>");
			}
			
			} while ("CLA".indexOf(tipoDeAnimal) == -1);
			
			System.out.println("Informe o peso: ");
			objAnimal.setPeso(Double.parseDouble(leitor.readLine()));
			
			System.out.println("Informe a altura: ");
			objAnimal.setAltura(Double.parseDouble(leitor.readLine()));
			
			System.out.println("Informe o nome: ");
			objAnimal.setNome(leitor.readLine());
			
			if(tipoDeAnimal.equals("C")) {
				
				System.out.print("informe os litros de leite: ");
				((Mamifero) objAnimal).setLitrosLeite(Double.parseDouble(leitor.readLine()));
				
				System.out.println("Informe a força da mordida: ");
				((Cachorro) objAnimal).setForcaMordida(Double.parseDouble(leitor.readLine()));
				
			} else if (tipoDeAnimal.equals("L")){
				
				System.out.print("informe os litros de leite: ");
				((Mamifero) objAnimal).setLitrosLeite(Double.parseDouble(leitor.readLine()));
				
				System.out.print("informe o velocidade: ");
				((Leopardo) objAnimal).setVelocidade(Double.parseDouble(leitor.readLine()));
				
			} else if (tipoDeAnimal.equals("A")){
				
				System.out.print("informe a quantidade de ovos: ");
				((Aguia) objAnimal).setQuantidadeOvos(Integer.parseInt(leitor.readLine()));
				
				System.out.println("Informe a autonomia: ");
				((Aguia) objAnimal).setAutonomia(Double.parseDouble(leitor.readLine()));
		
			}
			
		} catch (Exception erro) {
			System.out.println(erro);
		}
		
		//Saida de dados
		
		System.out.println("Nome: " + objAnimal.getNome());
		System.out.println("IMC: " + objAnimal.calcularIMC());
		if (tipoDeAnimal.equals("C")) {
			
			System.out.println("Litros de leite: " + ((Mamifero) objAnimal).getLitrosLeite());
			((Cachorro) objAnimal).morder();
			
		} else if (tipoDeAnimal.equals("L")) {
			
			System.out.println("Litros de leite: " + ((Mamifero) objAnimal).getLitrosLeite());
			((Leopardo) objAnimal).correr();
			
		} else if (tipoDeAnimal.equals("A")) {
			
			System.out.println("Quantidade de ovos: " + ((Ave) objAnimal).getQuantidadeOvos());
			((Aguia) objAnimal).voar();
			
		}
	}
}
