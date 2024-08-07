import java.util.Scanner;
import java.util.InputMismatchException;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Sarah G. ";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println("***********************");
        System.out.println("\nNome do cliente: " + nome + " (｡◕‿◕｡)");
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo + " 💰");
        System.out.println("\n***********************");

        String menu = """
                ** Digite sua opção ** (•◡•) /
                1 - Consultar saldo
                2 - Transferir valor
                3 - Realizar depósito 
                4 - Sair
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);

            try {
                opcao = leitura.nextInt();

                if (opcao == 1) {
                    System.out.println("O saldo disponível é: " + saldo + " 💵");
                } else if (opcao == 2) {
                    System.out.println("Qual valor deseja transferir? (¬‿¬)");
                    double valor = leitura.nextDouble();

                    if (valor > saldo) {
                        System.out.println("Não há saldo suficiente para realizar a transferência (︶︹︺)");
                    } else {
                        saldo -= valor;
                        System.out.println("Transferência realizada! Novo saldo: " + saldo + " 💸");
                    }
                } else if (opcao == 3) {
                    System.out.println("Quanto deseja depositar? (∩^o^)⊃━☆ ");
                    double valor = leitura.nextDouble();
                    System.out.println("Realizando depósito: " +  saldo + " + " + valor);
                    saldo += valor;
                    System.out.println("Valor depositado: " + valor);
                    System.out.println("Novo saldo: " + saldo + " ✨");
                } else if (opcao != 4) {
                    System.out.println("Opção Inválida! (•ˋ _ ˊ•)");
                }

            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, digite apenas números. (╯︵╰,)");
                leitura.next();
            }
        }
        System.out.println("Saindo... Até logo! (づ｡◕‿‿◕｡)づ");
    }
}
