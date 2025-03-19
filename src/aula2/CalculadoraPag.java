package aula2;

public class CalculadoraPag {
    
    float resultado = 0; // resultado final
    public CalculadoraPag(String nome, int idade,
            String dataNascimento,float salario){
        Funcionario ff = new Funcionario();
        ff.dataDeNascimento = dataNascimento;
        ff.idade = idade;
        ff.nome = nome;
        ff.salario = salario;    
		
		if(validaFuncionario(ff) == -1){
			System.out.println("errro na validação");
		}else{
			resultado = calcula(ff);
		}
    }
    
	private int validaFuncionario(Funcionario f) {
		if(f.nome.equals("") || f.idade ==0){
			return -1;
		}else{
			return 1;
		}
	}
	
    public float retornaCalculoFuncionario(){
        return resultado;
    }
    // esse metodo calcula o salario do funcionario
    private float calcula(Funcionario f){
		
		
        float r = 0;
        if(f.salario < 1000){
            r = (f.salario * 0.1f) + f.salario;
        }
        if(f.salario > 1000){
            r = (f.salario * 0.2f) + f.salario;
        }
        
        return r;        
    }

	
    
}




       



