package br.com.dio.exercicios.arrays;

import java.util.Random;

public class NumerosAleatorios {

	public static void main(String[] args) {

		Random random = new Random();

		int[] numAleatorios = new int[20];

		for (int i = 0; i < numAleatorios.length; i++) {
			int numero = random.nextInt(100);
			numAleatorios[i] = numero;
		}

		System.out.print("Números Aleatórios: ");
		for (int numero : numAleatorios) {
			System.out.print(numero + " ");
		}

		System.out.print("\nAntecessores dos Números Aleatórios: ");
		for (int numero : numAleatorios) {
			System.out.print((numero - 1) + " ");
		}

		System.out.print("\nSucessores dos Números Aleatórios: ");
		for (int numero : numAleatorios) {
			System.out.print((numero + 1) + " ");
		}
	}

}
