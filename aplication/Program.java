package aplication;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BubleSort bolha = new BubleSort();
		int[] dados = new int[] { 5, 3, 2, 4, 7, 1, 0, 6 };

		System.out.print("Deseja ver passo a passo S/N: ");

		char resp = sc.next().charAt(0);

		if ((resp == 'S') || (resp == 's')) {
			System.out.println("Resultado: " + bolha.bolha(dados, true));
		} else if ((resp == 'N') || (resp == 'n')) {
			System.out.println("Resultado: " + bolha.bolha(dados, false));
		}

		sc.close();
	}

}
