import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidaIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;

        try {
            System.out.print("Digite sua idade: ");
            idade = scanner.nextInt();

            if (idade <= 0) {
                System.out.println("Erro: A idade deve ser maior que zero.");
            } else {
                System.out.println("Idade cadastrada com sucesso: " + idade);
            }
        } catch (InputMismatchException e) {
            System.err.println("Erro: Entrada inválida. Digite um número inteiro.");
        } finally {
            System.out.println("Programa finalizado.");
            scanner.close();
        }
    }
}
