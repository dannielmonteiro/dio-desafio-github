package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Fatorial: ");
		int fatorial = sc.nextInt();
		
		int multiplicacao = 1;
		
		for (int i = fatorial; i >= 1; i--) {
			multiplicacao = multiplicacao * i;
		}
		
		System.out.print("Fatorial: " + fatorial + "! = ");
		System.out.println(multiplicacao);
	}

}
