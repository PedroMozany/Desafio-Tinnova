package aplication;

public class Fatorial {

	public Fatorial() {

	}

	/**
	 * METODO PARA REALIZAR A FATORIA��O DE UM NUMERO NATURAL
	 * 
	 * @param numero QUE SERA FATORIADO
	 * @return VAI RETURNA O RESULTADO DA OPERA��O FATORIAL
	 */
	public int fatorial(int numero) {

		if (numero == 1) {
			return 1;

		} else if (numero == 0) {
			return 1;

		} else {
			return (numero * fatorial(numero - 1));
		}

	}

}
