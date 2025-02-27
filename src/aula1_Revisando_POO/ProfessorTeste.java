package aula1_Revisando_POO;

import java.util.Scanner;

public class ProfessorTeste {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o nome do professor?");
		String nome = scan.nextLine();
		
		System.out.println("Qual a rua do professor?");
	    String rua = scan.nextLine();
	    
	    System.out.println("Qual o numero onde o prédio/casa do professor está localizado?");
	    int nRua = scan.nextInt();
	    
	    Endereco endereco = new Endereco(rua, nRua);
	    
	    System.out.println("Qual a idade do professor?");
	    int idade = scan.nextInt();
	    
	    System.out.println("Qual o telefone do professor?");
	    int tel = scan.nextInt();
	    
	    System.out.println("Em qual sala o professor dá aula?");
	    int sala = scan.nextInt();
	    
	    Professor professor = new Professor(nome, endereco, idade, tel, sala);
	    
	    System.out.println(professor);

	}

}
