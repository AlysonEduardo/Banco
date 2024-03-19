package banco;

public class Principal {
	
	public static void main(String[] args) {
		
		
		Conta a = new Conta("alyson", 2500);
		Conta b = new Conta("camila", 1000);
		Conta c = new Conta("mist", 1500);
		Conta d = new Conta("guilherme", 2000);
		
		CadastrarConta add = new CadastrarConta();
		
		add.adicionarConta(a);
		add.adicionarConta(b);
		add.adicionarConta(c);
		add.adicionarConta(d);
		
		add.listarConta();
		
		add.procurarConta();
		
		add.buscarNome();
	}
}
