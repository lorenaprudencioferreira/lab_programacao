/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Principal {
    public static void main(String[] args) {
       
        Biblioteca biblioteca = new Biblioteca();
        
        LivroFisico livro1 = new LivroFisico("O Senhor dos Aneis", "J.R.R. Tolkien", 1200, 1.5);
        Ebook livro2 = new Ebook("O Hobbit", "J.R.R. Tolkien", 310, 2.5);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

     
        System.out.println("Lista de Livros:");
        biblioteca.listarLivros();

  
        System.out.println("\nTESTE");
        biblioteca.buscarLivroPorTitulo("O Hobbit");
        biblioteca.buscarLivroPorTitulo("Harry Potter");
    }
}