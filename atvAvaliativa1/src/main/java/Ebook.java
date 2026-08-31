public class Ebook extends Livro {
    private double tamanhoArquivo;

    public Ebook(int id, String titulo, String autor, int numeroPaginas, double tamanhoArquivo) {
        super(id, titulo, autor, numeroPaginas);
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(double tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("E-book " + getId() + getTitulo()
                + " | Autor: " + getAutor()
                + " | Paginas: " + getNumeroPaginas()
                + " | Tamanho: " + tamanhoArquivo + "MB"
                + " | Status: " + (isEmprestado() ? "Emprestado" : "Disponivel"));
    }
}
