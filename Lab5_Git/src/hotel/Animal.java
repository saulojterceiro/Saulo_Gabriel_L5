package hotel;

public class Animal {

	private String nome;
	private String tipo;
	private int idade;
	
	public Animal(String nome, String tipo, int idade){
		this.nome = nome;
		this.tipo = tipo;
		this.idade = idade;
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
