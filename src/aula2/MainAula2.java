package aula2;

public class MainAula2 {

	public static void main(String[] args) {
		CalculadoraPag calculadora = new CalculadoraPag("maria",
                        30, "26/06/1990", 500);
                float ret = calculadora.retornaCalculoFuncionario();
                System.out.println("salario: " + ret);
	}

}
