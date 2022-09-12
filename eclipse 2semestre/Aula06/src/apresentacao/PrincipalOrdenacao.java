package apresentacao;

import negocio.BubbleSort;
import negocio.Direta;
import negocio.Inversa;
import negocio.Ordenacao;

public class PrincipalOrdenacao {
	private static void mostrarVetor(int [] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + "\t");
		}
		System.out.println();
	}
	
public static void main(String[] args) {
	//Declara��o de vari�veis
	int[] vetor = new int[5];
	Ordenacao objOrdenacao = null;
	
	//Entrada de dados
	for (int i = 0; i < vetor.length ; i++) {
		vetor[i] = ((int) (50 * Math.random()));
	}
	
	//Processamento
	mostrarVetor(vetor);
	
	objOrdenacao = new Direta();
	objOrdenacao.ordenar(vetor);
	mostrarVetor(vetor);
	
	objOrdenacao = new Inversa();
	objOrdenacao.ordenar(vetor);
	mostrarVetor(vetor);
	
	objOrdenacao = new BubbleSort();
	objOrdenacao.ordenar(vetor);
	mostrarVetor(vetor);
}
}
