package aula1_Revisando_POO;

public class Aluno extends Pessoa{
     private int serie;

	public int getSerie() {
		return serie;
	}

	public void setSerie(int serie) {
		this.serie = serie;
	}

	public Aluno(int serie) {
		super();
		this.serie = serie;
	}

	public Aluno(String nome, Endereco endereco, int idade, int telefone, int serie) {
		super(nome, endereco, idade, telefone);
		this.serie = serie;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", endereco=" + endereco + ", idade=" + idade + ", telefone=" + telefone + ", serie="+serie+"]";
	}

	
}
