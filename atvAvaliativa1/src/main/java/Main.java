public class Main {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        System.out.println("Cadastro de livros e membros");
        Livro l1 = new LivroFisico(1, "O Senhor dos Aneis", "J.R.R. Tolkien", 1200, 1.5);
        Livro l2 = new Ebook(2, "O Hobbit", "J.R.R. Tolkien", 310, 2.5);

        biblioteca.adicionarLivro(l1);
        biblioteca.adicionarLivro(l2);

        Membro m1 = new Membro(1, "Lorena ferreira", "lorena@gmail.com", "MAT-2024-01");
        Membro m2 = new Membro(2, "Nicolas ferreira", "nicolas@email.com", "MAT-2024-02");

        biblioteca.cadastrarMembro(m1);
        biblioteca.cadastrarMembro(m2);

        System.out.println("\nLivros cadastrados:");
        biblioteca.listarLivros();

        System.out.println("\nMembros cadastrados:");
        biblioteca.listarMembros();

        System.out.println("\nRealizando emprestimo.");
        try {
            //empréstimo do livro 1 para o membro 1
            biblioteca.realizarEmprestimo(1, 1);
            System.out.println("\nemprestar o mesmo livro novamente");
            biblioteca.realizarEmprestimo(1, 2);
        } catch (BibliotecaException e) {
            System.err.println("Error: " + e.getMessage());
        }

        System.out.println("\nEmprestimos atuais:");
        biblioteca.listarEmprestimos();

        System.out.println("\nDevolucaoo e exclusao");
        try {
            biblioteca.encerrarEmprestimo(1);
            biblioteca.removerLivro(2);
            System.out.println("Livro 2 removido com sucesso.");
        } catch (BibliotecaException e) {
            System.err.println("Error: " + e.getMessage());
        }

        System.out.println("\nBiblioteca estado final:");
        biblioteca.listarLivros();
    }
}
