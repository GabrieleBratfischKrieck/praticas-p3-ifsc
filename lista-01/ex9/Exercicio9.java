package ex9;

public class Exercicio9 {

	public Double calculaAbastecimento(Double qtdLitros, Double precolitro) {
		Double valorTotal = 0.0;
		if (qtdLitros == null || precolitro == null) {
			System.out.println("Valor total:" + valorTotal);
		}

		return qtdLitros * precolitro;

	}

}
