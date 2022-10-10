package pratica;

public class ContaCorrenteMain {

	public static void main(String[] args) {
		ContaCorrente c = new ContaCorrente ();
		
		c.numeroConta = 67890567890l;
		c.cpf = 10281170940l;
		c.nomeTitular = "Gabriele";
		c.saldo = 1000.0;
		
		c.mostrarDados ();
		c.depositar(100.0);
		c.Sacar(5.0);
		c.mostrarDados();
		
		

	}

}
