public class Main {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        imprimirCabecalho("1. CADASTRO DE LIVROS E MEMBROS");
        Livro l1 = new LivroFisico(1, "O Senhor dos Aneis", "J.R.R. Tolkien", 1200, 1.5);
        Livro l2 = new Ebook(2, "O Hobbit", "J.R.R. Tolkien", 310, 2.5);

        biblioteca.adicionarLivro(l1);
        biblioteca.adicionarLivro(l2);

        Membro m1 = new Membro(1, " Lorena Ferreira", "lorena@gmail.com", "MAT-2024-01");
        Membro m2 = new Membro(2, " Nicolas Ferreira", "nicolas@email.com", "MAT-2024-02");

        biblioteca.cadastrarMembro(m1);
        biblioteca.cadastrarMembro(m2);

        System.out.println("\nAcervo Cadastrado:");
        biblioteca.listarLivros();

        System.out.println("\n-> Membros Cadastrados:");
        biblioteca.listarMembros();

        imprimirCabecalho("\n2. FLUXO DE EMPRESTIMOS E TESTE DE EXCECAO");
        try {
            System.out.println("[Tentativa 1] Emprestando Livro 1 para Lorena...");
            biblioteca.realizarEmprestimo(1, 1);

            System.out.println("\n[Tentativa 2] Tentando emprestar Livro 1 novamente para Nicolas...");
            biblioteca.realizarEmprestimo(1, 2);
        } catch (BibliotecaException e) {
            System.out.println(">> Error:  " + e.getMessage());
        }

        System.out.println("\n-> Relatorio de Emprestimos:");
        biblioteca.listarEmprestimos();

        imprimirCabecalho("\n3. DEVOLUCAO E REMOCAO");
        try {
            System.out.println("[Devolucao] Encerrando Emprestimo 1...");
            biblioteca.encerrarEmprestimo(1);

            System.out.println("\n[Remocao] Excluindo Livro 2 do acervo...");
            biblioteca.removerLivro(2);
            System.out.println("Livro 2 removido com sucesso.");
        } catch (BibliotecaException e) {
            System.out.println(">> [ERRO] " + e.getMessage());
        }

        imprimirCabecalho("\n4. ESTADO ATUALIZADO DO ACERVO");
        biblioteca.listarLivros();
    }

    private static void imprimirCabecalho(String titulo) {
        System.out.println("  " + titulo);
    }
}
