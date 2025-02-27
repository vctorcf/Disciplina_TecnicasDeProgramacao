package aula1_Revisando_POO;

public class Professor extends Pessoa{
    private int salaQueDaAula;

    public Professor() {}
    
	public Professor(int salaQueDaAula) {
		super();
		this.salaQueDaAula = salaQueDaAula;
	}

	public int getSalaQueDaAula() {
		return salaQueDaAula;
	}

	public Professor(String nome, Endereco endereco, int idade, int telefone, int sala) {
		super(nome, endereco, idade, telefone);
		this.salaQueDaAula = sala;
	}

	public void setSalaQueDaAula(int salaQueDaAula) {
		this.salaQueDaAula = salaQueDaAula;
	}
    
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", endereco=" + endereco + ", idade=" + idade + ", telefone=" + telefone + ", sala="+salaQueDaAula+"]";
	}
}
