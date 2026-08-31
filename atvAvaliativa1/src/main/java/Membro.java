public class Membro extends Pessoa {
    private String matricula;

    public Membro(int id, String nome, String email, String matricula) {
        super(id, nome, email);
        this.matricula = matricula;
    }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    @Override
    public void exibirDetalhes() {
        System.out.println("Membro " + getId() + getNome() + 
                           " | Matricula: " + matricula + 
                           " | E-mail: " + getEmail());
    }
}