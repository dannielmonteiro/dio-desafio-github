package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class MaiorEMedia {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double numero;
		double maior = 0;
		double media = 0;
		double contador = 0;
		
		do {
			System.out.print("Número: ");
			numero = sc.nextInt();
			media = media + numero;
			
			if (numero > maior) maior = numero;
			
			contador++;
		} while (contador < 5);
		
		System.out.println("Maior = " + maior);
		System.out.println("Média = " + (media/contador));
	}

}
