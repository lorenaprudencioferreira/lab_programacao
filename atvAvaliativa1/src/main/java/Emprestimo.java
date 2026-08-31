import java.time.LocalDate;

public class Emprestimo implements Exibir {
    private int id;
    private Livro livro;
    private Membro membro;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private boolean ativo;

    public Emprestimo(int id, Livro livro, Membro membro) {
        this.id = id;
        this.livro = livro;
        this.membro = membro;
        this.dataEmprestimo = LocalDate.now();
        this.ativo = true;
        this.livro.setEmprestado(true);
    }

    public int getId() {
        return id;
    }

    public Livro getLivro() {
        return livro;
    }

    public Membro getMembro() {
        return membro;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void encerrarEmprestimo() {
        this.ativo = false;
        this.dataDevolucao = LocalDate.now();
        this.livro.setEmprestado(false);
    }

    @Override
    public void exibirDetalhes() {
        String status = ativo ? "Ativo (Em aberto)" : "Devolvido em " + dataDevolucao;
        System.out.println("Emprestimo " + id + " Livro: '" + livro.getTitulo()
                + "' | Membro: " + membro.getNome()
                + " | Data: " + dataEmprestimo
                + " | Status: " + status);
    }
}
