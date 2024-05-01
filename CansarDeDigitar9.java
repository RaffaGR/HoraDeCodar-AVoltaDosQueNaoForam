import java.util.Scanner;

public class CansarDeDigitar9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeValores = 10;
        int soma = 0;

        System.out.println("Digite " + quantidadeValores + " valores:");

        for (int i = 1; i <= quantidadeValores; i++) {
            System.out.print("Valor " + i + ": ");
            int valor = scanner.nextInt();
            soma += valor;
        }

        double media = (double) soma / quantidadeValores;

        System.out.println("\nValores informados:");

        for (int i = 1; i <= quantidadeValores; i++) {
            System.out.print(i + ": ");
            System.out.println(i);
        }

        System.out.println("\nMédia aritmética: " + media);

        scanner.close();
    }
}
