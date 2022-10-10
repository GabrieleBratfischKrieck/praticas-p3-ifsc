package ex8;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		ArrayList listaAnimais = new ArrayList<>();

		Scanner leitura = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("insira um animal");
			String animal = leitura.nextLine();
			if (!animal.isEmpty()) {
				listaAnimais.add(animal);
			}
		}

		for (Object coisa : listaAnimais) {
			System.out.println(coisa);
			System.out.println("Tamanho da lista:" + listaAnimais.size());
			System.out.println("Último elemento:" + listaAnimais.get(listaAnimais.size() - 1));
		}
	}

}
