package banco;

public class Conta {

	private String Nome;
	private double Valor;
	 
	
	public Conta(String nome, double valor) {
		
		Nome = nome;
		Valor = valor;
		
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public double getValor() {
		return Valor;
	}
	public void setValor(double valor) {
		Valor = valor;
	}	
}
