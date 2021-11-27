package aplication;

import java.util.Scanner;

public class Program {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Calculo calculo = new Calculo();

		System.out.print("Favor digitar total de eleitor: ");
		int totalEleitor = sc.nextInt();

		System.out.print("favor ditar os votos validos: ");
		int validos = sc.nextInt();

		double percentual = calculo.votosValidos(totalEleitor, validos);

		System.out.print("Favor digitar os votos em branco: ");
		int brancos = sc.nextInt();

		percentual = calculo.branco(totalEleitor, brancos);

		System.out.print("Favor digitar os votos em branco: ");
		int nulos = sc.nextInt();

		percentual = calculo.nulo(totalEleitor, nulos);

		sc.close();
	}

}
