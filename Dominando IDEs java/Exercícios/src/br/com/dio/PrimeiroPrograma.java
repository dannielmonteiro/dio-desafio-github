package br.com.dio;

import br.com.dio.model.Curso;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Curso curso = new Curso();
		Livro livro = new Livro();
		
		System.out.println(curso);
		System.out.println(livro);
		
		/*int a = 2;
		int b = 3;
		
		System.out.println("Hello, World! " + (a + b));*/
	}

}

class Livro {
	private String nome;
	private String npag;
}