package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Colaborador;
import negocio.Gerente;

public class PrincipalEmpresa {
 public static void main(String[] args) {
	//Declara��o de vari�veis
	 BufferedReader leitor = new BufferedReader(
				new InputStreamReader
				(System.in));
	 
	 Colaborador objColaborador = null;
	 String opcao = "";
	 
	 //Entrada de dados
	 try {
		 System.out.println("Digite <C> para colaborador ou "
				 			+ "qualquer coisa para gerente: ");
		 opcao = leitor.readLine();
		 
		 if (opcao.equalsIgnoreCase("C")) {
			 objColaborador = new Colaborador();
		 } else {
			 objColaborador = new Gerente();
		 }
		 
		 System.out.println("Digite a matr�cula: ");
		 objColaborador.setMatricula(Integer.parseInt(leitor.readLine()));
		 
		 System.out.println("Digite o nome: ");
		 objColaborador.setNome(leitor.readLine());
		 
		 System.out.println("Digite o sal�rio: ");
		 objColaborador.setSalario(Double.parseDouble(leitor.readLine()));
		 
		 if (! opcao.equalsIgnoreCase("C")) {
			 System.out.println("Digite o b�nus: ");
			 ((Gerente) objColaborador).setBonus(
					 	Double.parseDouble(leitor.readLine()));
		 }
		 
		 
		 
	 } catch (Exception erro) {
		 System.out.println(erro);
	 }
	 
	 //Sa�da de dados
	 System.out.println("Matr�cula: " + objColaborador.getMatricula());
	 System.out.println("Nome: " + objColaborador.getNome());
	 System.out.println("Salario: " + objColaborador.getSalario());
}
}
