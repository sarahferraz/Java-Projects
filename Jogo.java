import java.util.Random;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int numeroDeTentativas = 0;

        while (numeroDeTentativas < 5) {
            System.out.println("Insira um valor entre 0 e 100: ");
            int valorDigitado = sc.nextInt();
            numeroDeTentativas++;

            if (valorDigitado == numeroGerado) {
                System.out.println("Parabéns, você adivinhou o valor gerado! " + valorDigitado +
                        " em " + numeroDeTentativas + " tentativas!");
                break;
            } else if (valorDigitado > numeroGerado) {
                System.out.println("Valor digitado é maior que o valor gerado automaticamente!");
            } else {
                System.out.println("Valor digitado é menor que o valor gerado automaticamente!");
            }

            if (numeroDeTentativas < 5) {
                System.out.println("Não foi desta vez! Tente novamente!");
                System.out.println("Essa foi sua: " + numeroDeTentativas + "ª tentativa");
            }
        }

        if (numeroDeTentativas == 5) {
            System.out.println("Estamos encerrando o desafio! O número gerado era: " + numeroGerado);
        }

        sc.close();
    }
}