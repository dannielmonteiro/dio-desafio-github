package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {
		
		int nota;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Nota: ");
		nota = sc.nextInt();
		
		while (nota < 0 || nota > 10) {
			System.out.print("Nota Inválida! Favor digitar Nota entre 0 e 10. Nota: ");
			nota = sc.nextInt();
		}
	}

}
