package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class ParEImpar {

	public static void main(String[] args) {

		int quantNumeros;
		int numero;
		int quantPares = 0;
		int quantImpares = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Quantitade de Números: ");
		quantNumeros = sc.nextInt();

		int contador = 0;
		do {
			System.out.print("Número: ");
			numero = sc.nextInt();

			if (numero % 2 == 0) {
				numero = quantPares++;
			} else {
				numero = quantImpares++;
			}

			contador++;
		} while (contador < quantNumeros);

		System.out.println("Quantidade de Números Pares: " + quantPares);
		System.out.println("Quantidade de Números Impares: " + quantImpares);

	}

}
