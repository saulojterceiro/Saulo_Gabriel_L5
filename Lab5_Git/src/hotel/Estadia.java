package hotel;

public class Estadia {

	private Animal animal;
	private double valor;
	private int dias;
	
	public Estadia(String nome, String tipo, int idade, int dias, double valor){
		
		animal.setIdade(idade);
		animal.setNome(nome);
		animal.setTipo(tipo);
		this.valor = valor;
		this.dias = dias;
		
	}

	public double getValor() {
		return valor;
	}
	
	public int getDias() {
		return dias;
	}

	public String getNome(){
		return animal.getNome();	
	}
	
    public String getTipo(){
		return animal.getTipo();	
	}
    
    public int getIdade(){
	 return animal.getIdade();
    }

	@Override
	public String toString() {
		return getNome() + ", " + getTipo() + ", " + getDias() +  "dias com o preço de R$" + getValor();
	}
    
    
}
