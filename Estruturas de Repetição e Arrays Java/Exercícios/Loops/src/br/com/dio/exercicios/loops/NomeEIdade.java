package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class NomeEIdade {

	public static void main(String[] args) {
		
		String nome;
		int idade;
		
		Scanner sc = new Scanner(System.in);
		
		while (true){
			System.out.print("Nome: ");
			nome = sc.next();
			if (nome.equals("0")) break;
			
			System.out.print("Idade: ");
			idade = sc.nextInt();
		}
		
				
	}

}
