package aula1_Revisando_POO;

import java.util.Scanner;

public class AlunoTeste {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    
	    System.out.println("Qual o nome do aluno?");
	    String nome = scan.nextLine();
	    
	    System.out.println("Qual a rua do aluno?");
	    String rua = scan.nextLine();
	    
	    System.out.println("Qual o numero onde o prédio/casa do aluno está localizado?");
	    int nRua = scan.nextInt();
	    
	    Endereco endereco = new Endereco(rua, nRua);
	    
	    System.out.println("Qual a idade do aluno?");
	    int idade = scan.nextInt();
	    
	    System.out.println("Qual o telefone do aluno?");
	    int tel = scan.nextInt();
	    
	    System.out.println("Qual a serie do aluno (escreva apenas o número, para primeiro, segundo e terceiro ano escreva respectivamente 10, 11 e 12)?");
	    int serie = scan.nextInt();
	    
	    Aluno estudante = new Aluno(nome, endereco, idade, tel, serie);
	    
	    System.out.println(estudante);
	    
	    scan.close();

	}

}
