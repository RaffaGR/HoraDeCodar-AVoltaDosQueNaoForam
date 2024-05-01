import java.util.Scanner;

public class Parabens10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeNotas = 4;
        double soma = 0.0;

        System.out.println("Digite as notas das " + quantidadeNotas + " avaliações:");

        for (int i = 1; i <= quantidadeNotas; i++) {
            System.out.print("Nota " + i + ": ");
            double nota = scanner.nextDouble();
            soma += nota;
        }

        double media = soma / quantidadeNotas;

        System.out.println("\nMédia do semestre: " + media);

        if (media >= 6.0) {
            System.out.println("PARABÉNS! Você foi aprovado!");
        }

        scanner.close();
    }
}
