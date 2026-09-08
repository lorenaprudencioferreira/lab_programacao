package exBanco;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;

        Banco c1 = new Banco(1, 100, "Sede", 1);

        try {
            while (op != 4 && op != 5) {
                System.out.println("\n");
                System.out.println("            SISTEMA BANCÁRIO             ");
                System.out.println("\n");
                System.out.println("1 - Creditar");
                System.out.println("2 - Debitar");
                System.out.println("3 - Consultar Saldo");
                System.out.println("4 - Encerrar Conta");
                System.out.println("5 - Sair");
                System.out.print("Escolha uma opção: ");

                try {
                    op = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println(">> Erro: Por favor, digite apenas números inteiros.");
                    sc.nextLine(); // limpa o buffer do scanner
                    continue;
                }
                
                if (op < 1 || op > 5) {
                    System.out.println(">> Opção inválida! Escolha um número entre 1 e 5.");
                    continue;
                }

                if (op == 1 || op == 2) {
                    if (c1.getTipo() == 4) {
                        System.out.println(">> Erro: A conta está encerrada! Operação não permitida.");
                        continue;
                    }
                }

                switch (op) {
                    case 1:
                        System.out.print("Digite o valor a creditar: R$ ");
                        double valorCredito = sc.nextDouble();
                        if (valorCredito > 0) {
                            c1.creditar(valorCredito);
                            System.out.println(">> Sucesso! Novo Saldo: R$ " + String.format("%.2f", c1.getSaldo()));
                        } else {
                            System.out.println(">> Valor deve ser maior que zero.");
                        }
                        break;

                    case 2:
                        System.out.print("Digite o valor a debitar: R$ ");
                        double valorDebito = sc.nextDouble();
                        if (valorDebito > 0) {
                            c1.debitar(valorDebito);
                            System.out.println(">> Sucesso! Novo Saldo: R$ " + String.format("%.2f", c1.getSaldo()));
                        } else {
                            System.out.println(">> Valor deve ser maior que zero.");
                        }
                        break;

                    case 3:
                        System.out.println(c1.consultarSaldo(c1.getNumero()));
                        break;

                    case 4:
                        if (c1.getSaldo() < 0) {
                            System.out.println(">> Erro: Não é possível encerrar a conta com saldo negativo!");
                            op = 0; // atualiza op para não encerrar o laço while
                        } else {
                            c1.encerrarConta();
                            c1.textoEncerrar();
                        }
                        break;

                    case 5:
                        System.out.println(">> Encerrando o sistema. Obrigado por utilizar nossos serviços!");
                        break;
                }
            }

        } catch (Exception e) {
            System.out.println(">> Ocorreu um erro inesperado: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
