package ex10;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		// nao tem equivalente no C, so decalra uma vez
		Scanner leitura = new Scanner(System.in);

		System.out.println("Informe seu nome:");
		String nomeAluno = leitura.nextLine(); // scanf

		// leituras (scanf)

		System.out.println("Informe sua nota 1:");
		String nota1 = leitura.nextLine();
		System.out.println("Informe sua nota 2:");
		String nota2 = leitura.nextLine();
		System.out.println("Informe sua nota 3:");
		String nota3 = leitura.nextLine();

		// conversao do tipo (string -> Double)
		Double n1 = Double.valueOf(nota1);
		Double n2 = Double.valueOf(nota2);
		Double n3 = Double.valueOf(nota3);

		Double media = calculaMedia(n1,n2,n3)

		System.out.println("Media final: " + media);

		if (media >= 6) {
			System.out.println("Aprovado");
		} else if (media >= 4 && media < 6) {
			System.out.println("Recuperacao");
		} else if (media < 4) {
			System.out.println("Reprovado");
		}
	}

	private static Double calculaMedia(Double n1, Double n2, Double n3) {
		return (n1 + n2 + n3) / 3;
	}
}
