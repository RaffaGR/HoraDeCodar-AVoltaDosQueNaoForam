import java.util.Scanner;

public class Vezes4MaisDificilQualO1Maior6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite quatro valores diferentes:");
        System.out.print("Valor 1: ");
        int valor1 = scanner.nextInt();

        System.out.print("Valor 2: ");
        int valor2 = scanner.nextInt();

        System.out.print("Valor 3: ");
        int valor3 = scanner.nextInt();

        System.out.print("Valor 4: ");
        int valor4 = scanner.nextInt();

        int maior = valor1;

        if (valor2 > maior) {
            maior = valor2;
        }

        if (valor3 > maior) {
            maior = valor3;
        }

        if (valor4 > maior) {
            maior = valor4;
        }

        System.out.println("O maior valor é: " + maior);

        scanner.close();
    }
}
