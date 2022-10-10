package pratica;

public class ContaCorrente {

	public String nomeTitular;
	public Long cpf;
	public Long numeroConta;
	public Double saldo;
	
	public  Double Sacar (Double valorSaque) {
		
		double retornoSaque = 0;
		if(valorSaque > saldo) {
			System.out.println("Saldo insuficiente");
		}
		else {
			saldo = saldo - valorSaque;
			retornoSaque = valorSaque;
		}
		return retornoSaque;
		
	}
	
	public void  depositar (Double valorDeposito) {
		saldo = saldo + valorDeposito;
		
		
	}
	
	public void mostrarDados ( ) {
		System.out.println("Titular:"+ nomeTitular);
		System.out.println("Cpf:"+ cpf);
		System.out.println("Conta:"+ numeroConta);
		System.out.println("Saldo da conta:"+ saldo);
	}
}
