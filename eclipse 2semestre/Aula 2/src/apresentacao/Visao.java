package apresentacao;

import java.util.Scanner;

import negocio.Autor;
import negocio.Livro;

public class Visao {
 public static void main(String[] args) {
	//Declara��o de vari�veis
	 Scanner leitor = new Scanner(System.in);
	 
	 Livro objLivro = new Livro();
	 
	 //Entrada de dados
	 System.out.print("Digite o t�tulo do livro: ");
	 objLivro.setTitulo(leitor.nextLine());
	 
	 System.out.print("Digite o nome do autor: ");
	 objLivro.setObjAutor(new Autor(leitor.nextLine()));
	 
	 System.out.print("Digite o genero do livro: ");
	 objLivro.setGenero(leitor.nextLine());
	 
	 leitor.close();
	 
	 //Sa�da de dados
	 System.out.println("T�tulo: " + objLivro.getTitulo());
	 System.out.println("Autor: " + objLivro.getObjAutor().getName());
	 System.out.println("G�nero: " + objLivro.getGenero());
	 
}

}
