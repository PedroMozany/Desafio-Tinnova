package aplication;

public class Multiplos {

	/**
	 * METODO RECUSRIVO PARA VERIFICAR QUAIS NUMERO SAO MULTIPLOS DE 3 OU 5 E
	 * REALIZAR A SOMA.
	 * @param numero QUALQUER COMO PARAMENTRO. 
	 * @return VAI RETURNO O RESULTADO DA SOMA COM BASE DA VERIFICAÇÃO 
	 */
	public int somaMultiplos(int numero) {

		if (numero == 0) {
			return 0;
		} else if (numero % 3 == 0 || numero % 5 == 0) {
			return (numero + somaMultiplos(numero - 1));
		}
		return (somaMultiplos(numero - 1));
	}

}
