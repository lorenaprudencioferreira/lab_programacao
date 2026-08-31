public class Funcionario extends Pessoa {

    private String cargo;

    public Funcionario(int id, String nome, String email, String cargo) {
        super(id, nome, email);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Funcionario " + getId() + getNome()
                + " | Cargo: " + cargo
                + " | E-mail: " + getEmail());
    }
}
