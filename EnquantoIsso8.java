import java.util.Scanner;

public class EnquantoIsso8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        while (valor2 <= 0) {
            System.out.println("Valor inválido! O segundo valor deve ser positivo.");
            System.out.print("Digite um novo valor para o segundo número: ");
            valor2 = scanner.nextDouble();
        }

        double resultado = valor1 / valor2;

        System.out.println("O resultado da divisão é: " + resultado);

        scanner.close();
    }
}
