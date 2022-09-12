package apresentacao;

import java.util.Scanner;

import negocio.Autor;
import negocio.Livro;

public class Visao {
 public static void main(String[] args) {
	//Declaração de variáveis
	 Scanner leitor = new Scanner(System.in);
	 
	 Livro objLivro = new Livro();
	 
	 //Entrada de dados
	 System.out.print("Digite o título do livro: ");
	 objLivro.setTitulo(leitor.nextLine());
	 
	 System.out.print("Digite o nome do autor: ");
	 objLivro.setObjAutor(new Autor(leitor.nextLine()));
	 
	 System.out.print("Digite o genero do livro: ");
	 objLivro.setGenero(leitor.nextLine());
	 
	 leitor.close();
	 
	 //Saída de dados
	 System.out.println("Título: " + objLivro.getTitulo());
	 System.out.println("Autor: " + objLivro.getObjAutor().getName());
	 System.out.println("Gênero: " + objLivro.getGenero());
	 
}

}
