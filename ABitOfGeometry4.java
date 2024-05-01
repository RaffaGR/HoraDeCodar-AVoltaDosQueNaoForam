import java.util.Scanner;

public class ABitOfGeometry4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha uma forma geométrica:");
            System.out.println("1 - Retângulo");
            System.out.println("2 - Quadrado");
            System.out.println("3 - Losango");
            System.out.println("4 - Trapézio");
            System.out.println("5 - Paralelogramo");
            System.out.println("6 - Triângulo");
            System.out.println("7 - Círculo");
            System.out.println("0 - Sair");

            System.out.print("Opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("--- Cálculo da área do Retângulo ---");
                    Retangulo.main(new String[]{"ABitOfGeometry4"});
                    break;
                case 2:
                    System.out.println("--- Cálculo da área do Quadrado ---");
                    Quadrado.main(new String[]{"ABitOfGeometry4"});
                    break;
                case 3:
                    System.out.println("--- Cálculo da área do Losango ---");
                    Losango.main(new String[]{"ABitOfGeometry4"});
                    break;
                case 4:
                    System.out.println("--- Cálculo da área do Trapézio ---");
                    Trapezio.main(new String[]{"ABitOfGeometry4"});
                    break;
                case 5:
                    System.out.println("--- Cálculo da área do Paralelogramo ---");
                    Paralelogramo.main(new String[]{"ABitOfGeometry4"});
                    break;
                case 6:
                    System.out.println("--- Cálculo da área do Triângulo ---");
                    Triangulo.main(new String[]{"ABitOfGeometry4"});
                    break;
                case 7:
                    System.out.println("--- Cálculo da área do Círculo ---");
                    Circulo.main(new String[]{"ABitOfGeometry4"});
                    break;
                case 0:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
            System.out.println();
        }

        scanner.close();
    }
}
