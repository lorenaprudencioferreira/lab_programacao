package exBanco;

public class Banco {

    private int numero;
    private int ag_numero;
    private String ag_nome;
    private int tipo; 
    private double saldo;

    public Banco() {
    }

    // construtor com saldo inicial igual a 0
    public Banco(int numero, int ag_numero, String ag_nome, int tipo) {
        this.numero = numero;
        this.ag_numero = ag_numero;
        this.ag_nome = ag_nome;
        this.tipo = tipo;
        this.saldo = 0.0;
    }

    public int getNumero() {
        return numero;
    }

    public int getAg_numero() {
        return ag_numero;
    }

    public String getAg_nome() {
        return ag_nome;
    }

    public int getTipo() {
        return tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void creditar(double valor) {
        if (this.tipo != 4) {
            this.saldo += valor;
        }
    }

    public void debitar(double valor) {
        if (this.tipo != 4) {
            this.saldo -= valor;
        }
    }

    public String consultarSaldo(int numConta) {
        return "Conta: " + numConta + " | Saldo Atual: R$ " + String.format("%.2f", this.saldo);
    }

    public int encerrarConta() {
        this.tipo = 4;
        return this.tipo;
    }

    public void textoEncerrar() {
        System.out.println("\n");
        System.out.println("  CONTA ENCERRADA COM SUCESSO");
        System.out.println("\n");
        System.out.println("Número da Conta: " + this.numero);
        System.out.println("Tipo Final: " + this.tipo + " (Encerrada)");
        System.out.println("Saldo de Encerramento: R$ " + String.format("%.2f", this.saldo));
        this.saldo = 0.0; // zera o saldo após o resgate/encerramento
    }
}
