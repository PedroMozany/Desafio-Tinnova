package aplication;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Fatorial fatorial = new Fatorial();
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		int numeroNatural = sc.nextInt();

		System.out.println("Resultado: " + fatorial.fatorial(numeroNatural));

		sc.close();
	}

}
