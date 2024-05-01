import java.util.Scanner;

public class DeQuantoAteQuanto13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Informe o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        int soma = 0;
        int quantidade = 0;

        for (int i = numero1 + 1; i < numero2; i++) {
            System.out.println(i);
            soma += i;
            quantidade++;
        }

        double media = (double) soma / quantidade;

        System.out.println("Média Aritmética: " + media);

        scanner.close();
    }
}
