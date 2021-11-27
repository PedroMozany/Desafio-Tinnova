package aplication;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Multiplos multiplos = new Multiplos();
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor: ");
		int numero = sc.nextInt();
		System.out.println("resultado: " + multiplos.somaMultiplos(numero));
		
		
		
		sc.close();
	}

}
