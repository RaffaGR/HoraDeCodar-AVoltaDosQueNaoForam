import java.util.Scanner;

public class Vezes5QO7Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite cinco valores diferentes:");
        System.out.print("Valor 1: ");
        int valor1 = scanner.nextInt();

        System.out.print("Valor 2: ");
        int valor2 = scanner.nextInt();

        System.out.print("Valor 3: ");
        int valor3 = scanner.nextInt();

        System.out.print("Valor 4: ");
        int valor4 = scanner.nextInt();

        System.out.print("Valor 5: ");
        int valor5 = scanner.nextInt();

        int somaDosMaiores = 0;

        if (valor1 > valor2 && valor1 > valor3 && valor1 > valor4 && valor1 > valor5) {
            somaDosMaiores = valor1;

            if (valor2 > valor3 && valor2 > valor4 && valor2 > valor5) {
                somaDosMaiores += valor2;
            } else if (valor3 > valor4 && valor3 > valor5) {
                somaDosMaiores += valor3;
            } else if (valor4 > valor5) {
                somaDosMaiores += valor4;
            } else {
                somaDosMaiores += valor5;
            }
        } else if (valor2 > valor1 && valor2 > valor3 && valor2 > valor4 && valor2 > valor5) {
            somaDosMaiores = valor2;

            if (valor1 > valor3 && valor1 > valor4 && valor1 > valor5) {
                somaDosMaiores += valor1;
            } else if (valor3 > valor4 && valor3 > valor5) {
                somaDosMaiores += valor3;
            } else if (valor4 > valor5) {
                somaDosMaiores += valor4;
            } else {
                somaDosMaiores += valor5;
            }
        } else if (valor3 > valor1 && valor3 > valor2 && valor3 > valor4 && valor3 > valor5) {
            somaDosMaiores = valor3;

            if (valor1 > valor2 && valor1 > valor4 && valor1 > valor5) {
                somaDosMaiores += valor1;
            } else if (valor2 > valor4 && valor2 > valor5) {
                somaDosMaiores += valor2;
            } else if (valor4 > valor5) {
                somaDosMaiores += valor4;
            } else {
                somaDosMaiores += valor5;
            }
        } else if (valor4 > valor1 && valor4 > valor2 && valor4 > valor3 && valor4 > valor5) {
            somaDosMaiores = valor4;

            if (valor1 > valor2 && valor1 > valor3 && valor1 > valor5) {
                somaDosMaiores += valor1;
            } else if (valor2 > valor3 && valor2 > valor5) {
                somaDosMaiores += valor2;
            } else if (valor3 > valor5) {
                somaDosMaiores += valor3;
            } else {
                somaDosMaiores += valor5;
            }
        } else {
            somaDosMaiores = valor5;

            if (valor1 > valor2 && valor1 > valor3 && valor1 > valor4) {
                somaDosMaiores += valor1;
            } else if (valor2 > valor3 && valor2 > valor4) {
                somaDosMaiores += valor2;
            } else if (valor3 > valor4) {
                somaDosMaiores += valor3;
            } else {
                somaDosMaiores += valor4;
            }
        }

        System.out.println("A soma dos dois maiores valores é: " + somaDosMaiores);

        scanner.close();
    }
}
