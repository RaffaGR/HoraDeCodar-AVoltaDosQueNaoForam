import java.util.Scanner;

public class QualOQue7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite três valores diferentes:");
        System.out.print("Valor 1: ");
        int valor1 = scanner.nextInt();

        System.out.print("Valor 2: ");
        int valor2 = scanner.nextInt();

        System.out.print("Valor 3: ");
        int valor3 = scanner.nextInt();

        int somaDosMaiores = 0;

        if (valor1 > valor2 && valor1 > valor3) {
            somaDosMaiores = valor1;

            if (valor2 > valor3) {
                somaDosMaiores += valor2;
            } else {
                somaDosMaiores += valor3;
            }
        } else if (valor2 > valor1 && valor2 > valor3) {
            somaDosMaiores = valor2;

            if (valor1 > valor3) {
                somaDosMaiores += valor1;
            } else {
                somaDosMaiores += valor3;
            }
        } else {
            somaDosMaiores = valor3;

            if (valor1 > valor2) {
                somaDosMaiores += valor1;
            } else {
                somaDosMaiores += valor2;
            }
        }

        System.out.println("A soma dos dois maiores valores é: " + somaDosMaiores);

        scanner.close();
    }
}
