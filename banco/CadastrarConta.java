package banco;

import java.util.Scanner;

public class CadastrarConta {

	private Conta[] contas = new Conta[4];
	private int a = 0;
	
	
	public void adicionarConta(Conta add) {

			this.contas[a] = add;
			a++;
			
	}
	
	public void listarConta() {
		
		
		
		System.out.println("lista:");
		
	 for(int i = 0; i < 4; i++)	{
		 
		 System.out.println("   " + this.contas[i].getNome() +"  "+ this.contas[i].getValor());
		 
		 
	 }
		
	}
	
	public void procurarConta() {
		
		int b=0;
		
		Scanner p = new Scanner(System.in);
	
		System.out.println("\n Digite um numero de 1 ao 4 para exibir uma das quatro contas:");
		
		
		b = p.nextInt();
		b = b - 1;
		
		System.out.println("  " + this.contas[b].getNome() +"  "+ this.contas[b].getValor() + "\n");
		
		
	}
	public void buscarNome() {
		
		String nome;
		
        System.out.println(" Digite o nome que busca: ");
        
		Scanner B = new Scanner(System.in);
		
		nome = B.nextLine();
				
		
        for (int i = 0; i < 4; i++) {
        	
            if (this.contas[i].getNome().equals(nome)) {
            	    
                System.out.println("	Nome: " + this.contas[i].getNome() + "\n	Valor: R$ " + this.contas[i].getValor() + "\n");
            }
        }
    }
	
}   

