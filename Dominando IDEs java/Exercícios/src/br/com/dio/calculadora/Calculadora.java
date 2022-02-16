package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o primeiro número: ");
		double a = sc.nextDouble();
		System.out.print("Digite o seugundo número: ");
		double b = sc.nextDouble();
		
		
		double soma = soma(a,b);
		double subtracao = subtracao(a,b);
		double multiplicacao = multiplicacao(a,b);
		double divisao = divisao(a,b);
		
		
		System.out.printf("%.0f + %.0f = %.0f%n", a, b, soma);
		System.out.printf("%.0f - %.0f = %.0f%n", a, b, subtracao);
		System.out.printf("%.0f * %.0f = %.0f%n", a, b, multiplicacao);
		System.out.printf("%.0f / %.0f = %.1f%n", a, b, divisao);

	}
	
	
	public static double soma(double a, double b) {
		return a + b;
	}
	
	public static double subtracao(double a, double b) {
		return a - b;
	}
	
	public static double multiplicacao(double a, double b) {
		return a * b;
	}
	
	public static double divisao(double a, double b) {
		return a / b;
	}

}
