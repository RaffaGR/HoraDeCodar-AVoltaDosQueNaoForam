import java.util.Scanner;

public class PassouNoTeste14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int alunosAprovados = 0;
        String resposta;

        do {
            double somaNotas = 0;

            for (int i = 1; i <= 6; i++) {
                System.out.print("Informe a nota " + i + ": ");
                double nota = scanner.nextDouble();
                somaNotas += nota;
            }

            double media = somaNotas / 6;

            System.out.println("Média Final: " + media);

            if (media >= 6.5) {
                alunosAprovados++;
            }

            System.out.print("Calcular a média de outro aluno? (S/N): ");
            resposta = scanner.next();

        } while (resposta.equalsIgnoreCase("S"));

        System.out.println("Quantidade de alunos aprovados: " + alunosAprovados);

        scanner.close();
    }
}
