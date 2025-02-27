package aula1_Revisando_POO;

public class Pessoa {
	protected String nome;
	protected Endereco endereco;
	protected int idade;
	protected int telefone;
	
	public Pessoa() {}
	
	public Pessoa(String nome, Endereco endereco, int idade, int telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.idade = idade;
		this.telefone = telefone;
	}

	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", endereco=" + endereco + ", idade=" + idade + ", telefone=" + telefone + "]";
	}
	

}
