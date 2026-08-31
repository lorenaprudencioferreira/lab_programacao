import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros = new ArrayList<>();
    private ArrayList<Membro> membros = new ArrayList<>();
    private ArrayList<Emprestimo> emprestimos = new ArrayList<>();
    private int proximoIdEmprestimo = 1;

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void removerLivro(int id) throws BibliotecaException {
        Livro l = buscarLivroPorId(id);
        if (l.isEmprestado()) {
            throw new BibliotecaException("Nao e possivel remover um livro que esta emprestado!");
        }
        livros.remove(l);
    }

    public Livro buscarLivroPorId(int id) throws BibliotecaException {
        for (Livro l : livros) {
            if (l.getId() == id) {
                return l;
            }
        }
        throw new BibliotecaException("Livro com ID " + id + " nao encontrado.");
    }

    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }
        for (Livro l : livros) {
            l.exibirDetalhes(); // Polimorfismo
        }
    }

    public void cadastrarMembro(Membro membro) {
        membros.add(membro);
    }

    public Membro buscarMembroPorId(int id) throws BibliotecaException {
        for (Membro m : membros) {
            if (m.getId() == id) {
                return m;
            }
        }
        throw new BibliotecaException("Membro com ID " + id + " nao encontrado.");
    }

    public void listarMembros() {
        if (membros.isEmpty()) {
            System.out.println("Nenhum membro cadastrado.");
            return;
        }
        for (Membro m : membros) {
            m.exibirDetalhes();
        }
    }

    public void realizarEmprestimo(int idLivro, int idMembro) throws BibliotecaException {
        Livro livro = buscarLivroPorId(idLivro);
        Membro membro = buscarMembroPorId(idMembro);

        if (livro.isEmprestado()) {
            throw new BibliotecaException("O livro '" + livro.getTitulo() + "' ja esta emprestado!");
        }

        Emprestimo emprestimo = new Emprestimo(proximoIdEmprestimo++, livro, membro);
        emprestimos.add(emprestimo);
        System.out.println("Emprestimo realizado com sucesso!");
    }

    public void encerrarEmprestimo(int idEmprestimo) throws BibliotecaException {
        for (Emprestimo e : emprestimos) {
            if (e.getId() == idEmprestimo && e.isAtivo()) {
                e.encerrarEmprestimo();
                System.out.println("Emprestimo " + idEmprestimo + " finalizado com sucesso!");
                return;
            }
        }
        throw new BibliotecaException("Emprestimo ativo com ID " + idEmprestimo + " nao encontrado.");
    }

    public void listarEmprestimos() {
        if (emprestimos.isEmpty()) {
            System.out.println("Nenhum emprestimo registrado.");
            return;
        }
        for (Emprestimo e : emprestimos) {
            e.exibirDetalhes();
        }
    }
}
