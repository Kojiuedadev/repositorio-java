import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tipoConta = "";
        double valorDeposito, valorSaque = 0;
        int operacaoCliente = 0;
        double saldoInicial = 2500.00;

        System.out.println("Olá seja bem vindo! \n" +
                "Informe seu nome:");
        String nomeUsuario = scanner.nextLine();



        while (tipoConta != "1" && tipoConta != "2") {
            System.out.println("Qual o tipo da sua conta bancaria? \n" +
                    "digite 1 (Corrente) ou 2 (Poupança)");
            tipoConta = scanner.nextLine();

            if (tipoConta.equals("1")) {
                tipoConta = "Corrente";
                break;
            } else if (tipoConta.equals("2")) {
                tipoConta = "Poupança";
                break;
            } else {
                System.out.println("Número invalido, tente novamente.");
            }
        }
        System.out.println("**************************");
        System.out.println("Dados iniciais do Cliente:\n" +
                "Nome: " + nomeUsuario + "\n" +
                "Tipo da conta: " + tipoConta + "\n" +
                "Saldo inicial: " + saldoInicial

        );
        System.out.println("**************************");




        while (operacaoCliente != 4) {
            System.out.println("Escolha a operação desejada:\n" +
                    "1 - Consultar saldo\n" +
                    "2 - Deposito\n" +
                    "3 - Sacar\n" +
                    "4 - Sair");

            operacaoCliente = scanner.nextInt();

            if (operacaoCliente == 1) {
                System.out.println("\nSeu saldo é de R$: " + saldoInicial + "\n");
            } else if (operacaoCliente == 2) {


                System.out.println("insira o valor que deseja depositar:");
                valorDeposito = scanner.nextDouble();

                if (valorDeposito < 0) {
                    System.out.println("\nvalor incorreto, tente novamente.\n");
                } else {
                    saldoInicial += valorDeposito;

                    System.out.println("\nDeposito realizado com sucesso!!!\n" +
                            "Seu saldo atual: R$: " + saldoInicial + "\n");
                }

            } else if (operacaoCliente == 3) {

                System.out.println("insira o valor que deseja Sacar:");
                valorSaque = scanner.nextDouble();

                if (valorSaque < 0) {
                    System.out.println("\nvalor incorreto, tente novamente.\n");
                } else if (valorSaque > saldoInicial) {
                    System.out.println("Não há saldo suficiente para fazer essa transferência.");
                } else {
                    saldoInicial -= valorSaque;

                    System.out.println("\nSaque realizado com sucesso!!!\n" +
                            "Seu saque foi de R$: " + valorSaque + "\n" +
                            "Seu saldo atual: R$: " + saldoInicial + "\n");
                }
            } else if (operacaoCliente == 4) {
                System.out.println("Programa encerrado. Muito obrigado!!!");
            } else {
                System.out.println("opção inválida, tente novamente");
            }
        }
    }
}
