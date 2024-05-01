import java.util.Scanner;

public class Trapezio {
    public static void main(String[] args) {
        boolean executarPelaABitOfGeometry4 = false;
        if (args.length > 0 && args[0].equals("ABitOfGeometry4")) {
            executarPelaABitOfGeometry4 = true;
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base maior do trapézio: ");
        double baseMaior = scanner.nextDouble();

        System.out.print("Digite a base menor do trapézio: ");
        double baseMenor = scanner.nextDouble();

        System.out.print("Digite a altura do trapézio: ");
        double altura = scanner.nextDouble();

        double area = ((baseMaior + baseMenor) * altura) / 2;

        System.out.println("A área do trapézio é: " + area);

        if (!executarPelaABitOfGeometry4) {
            scanner.close();
        }
    }
}
