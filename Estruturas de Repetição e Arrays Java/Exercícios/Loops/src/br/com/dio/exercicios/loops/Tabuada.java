package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Tabuada: ");
		int tabuada = sc.nextInt();

		System.out.println("\nTabuada de " + tabuada + "\n");

		for (int i = 1; i <= 10; i++) {
			System.out.println(tabuada + " X " + i + " = " + tabuada * i);
		}

	}

}
