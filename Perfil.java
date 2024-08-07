import java.util.Scanner;

public class Perfil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String meuNome = scanner.nextLine();

        System.out.println("Olá, " + meuNome + "!");
        System.out.println("Tudo bem?");
    }
}