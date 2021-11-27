package aplication;

import java.util.Scanner;

public class BubleSort {

	Scanner teclado = new Scanner(System.in);

	public BubleSort() {

	}

	/**
	 * MEDOTO PARA REALIZAR A TROCA DE DOIS ELEMENTOS EM VEOTR
	 * 
	 * @param vet O VETOR
	 * @param p1  PRIMEIRO ELEMENTO
	 * @param p2  SEGUNTO ELEMENTO
	 */
	public void trocar(int[] vet, int p1, int p2) {
		int aux = vet[p1];
		vet[p1] = vet[p2];
		vet[p2] = aux;
	}

	/**
	 * VAI IMPRIMIR UMA SEQUENCIA DESTACANDO DOIS ELEMENTOS QUE VAO MUDAR DE POSIÇÃO
	 * 
	 * @param vet O VETOR
	 * @param posDestaque POSIÇÃO A DESTACAR. ENVIA -1 CASO NAO HAJA POSIÇÃO DESTACAR
	 * @return STRING COM DESTAQUE
	 */
	public String imprimir(int[] vet, int posDestaque) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < vet.length; i++) {
			String dado = String.format("%4d", vet[i]) + " ";
			if (i == posDestaque) {
				dado = "[" + dado + "]";
			}
			sb.append(dado);
		}
		return sb.toString();
	}

	/**
	 * VAI IMPRIMIR O VETOR ORDENADO
	 * @param vet O VETOR
	 * @return STRING SEM DESTAQUE ORDENADO
	 */
	public String imprimir(int[] vet) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < vet.length; i++) {
			String dado = String.format("%4d", vet[i]) + " ";
			sb.append(dado);
		}
		return sb.toString();
	}

	/**
	 * ENCAPSULAMENTO PARA PAUSA VIA LEITURA DECLADO
	 */
	public void pausa() {
		teclado.nextLine();
	}

	/**
	 * ORDENACAO POR BOLHA, COM IMPRESAO PASSO A PASSO OU NAO
	 * @param dados O VETOR A SER ORDENADO
	 * @param descrever TRUE PARA ORDENACAO PASSO A PASSO E FALSE PARA MOSTRA RESULTADO
	 * @return VAI RETURNA VETOR ORDENADO
	 */
	public String bolha(int[] dados, boolean descrever) {
		int[] dadosOrd = dados.clone();

		int tam = dadosOrd.length;
		int posComparacao = 0;

		if (descrever) {
			System.out.println(imprimir(dadosOrd, -1));
		}

		for (int posReferencia = tam - 1; posReferencia > 0; posReferencia--) {
			int trocas = 0;
			for (posComparacao = 0; posComparacao < posReferencia; posComparacao++) {
				if (dadosOrd[posComparacao] > dadosOrd[posComparacao + 1]) {
					trocar(dadosOrd, posComparacao, posComparacao + 1);
					trocas++;
					if (descrever) {
						System.out.print(imprimir(dadosOrd, posComparacao + 1));
						pausa();
					}
				}

			}

		}

		return imprimir(dadosOrd);

	}

}
