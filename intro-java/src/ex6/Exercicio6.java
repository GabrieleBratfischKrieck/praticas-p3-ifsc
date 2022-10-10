package ex6;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Integer[]vetor = new Integer[10];
		Integer menornumero = 999999999;
		Integer maiornumero = 0;
		
		Scanner leitura= new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			Integer numero = Integer.valueOf(leitura.nextLine());
			vetor[i]= numero;
			if (numero<menornumero) {
				menornumero = numero;
			}
			if (numero>maiornumero) {
				maiornumero = numero;
			}
		}
		System.out.println("Menor número:");
		System.out.println(menornumero);
		System.out.println("Maior número:");
		System.out.println(maiornumero);


	}

}
