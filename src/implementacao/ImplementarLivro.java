package implementacao;

import beans.Livro;

public class ImplementarLivro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//control + shift + o importa a classe
		//Criado o objeto exemplar1
		Livro exemplar1 = new Livro();
		
		exemplar1.titulo = "Programacao Java";
		exemplar1.editora = "Probeo Atlas editora";
		
		System.out.println("Exemplar1:" + exemplar1.titulo );
		System.out.println("Editora:" + exemplar1.editora );
		
		Livro exemplar2 = new Livro();
		
		exemplar2.titulo = "SQL";
		exemplar2.editora = "Book";
		
		System.out.println("Exemplar2:" + exemplar2.titulo );
		System.out.println("Editora:" + exemplar2.editora );
		
		

	}

}
