package aplication;

public class Calculo {

	public Calculo() {

	}

	/**
	 * METODO PARA REALIZAR O CALCULO DA PERCENTUAL DOS VOTOS VALIDOS
	 * 
	 * @param totalEleitor
	 * @param validos
	 * @return VAI RETURNA OS RESULTADO DE EM PORCETAGEM DE VOTOS VALIDOS
	 */
	public double votosValidos(int totalEleitor, int validos) {
		double percentual = (validos * 100) / totalEleitor;
		System.out.println("Percentual validos: " + percentual + "%");
		return percentual;
	}

	/**
	 * METODO PARA REALIZAR O CALCULO DA PERCENTUAL DOS VOTOS BRANCOS
	 * 
	 * @param totalEleitor
	 * @param validos
	 * @return VAI RETURNA OS RESULTADO DE EM PORCETAGEM DE VOTOS EM BRANCOS
	 */
	public double branco(int totalEleitor, int brancos) {
		double percentual = (brancos * 100) / totalEleitor;
		System.out.println("Percentual brancos: " + percentual + "%");
		return percentual;
	}

	/**
	 * METODO PARA REALIZAR O CALCULO DA PERCENTUAL DOS VOTOS NULOS
	 * 
	 * @param totalEleitor
	 * @param validos
	 * @return VAI RETURNA OS RESULTADO DE EM PORCETAGEM DE VOTOS NULOS
	 */
	public double nulo(int totalEleitor, int nulos) {
		double percentual = (nulos * 100) / totalEleitor;
		System.out.println("Percentual nulos: " + percentual + "%");
		return percentual;
	}
}
