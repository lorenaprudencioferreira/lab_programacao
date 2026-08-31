public class LivroFisico extends Livro {
    private double peso;

    public LivroFisico(int id, String titulo, String autor, int numeroPaginas, double peso) {
        super(id, titulo, autor, numeroPaginas);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Livro Fisico " + getId() + getTitulo()
                + " | Autor: " + getAutor()
                + " | Paginas: " + getNumeroPaginas()
                + " | Peso: " + peso + "kg"
                + " | Status: " + (isEmprestado() ? "Emprestado" : "Disponivel"));
    }
}
