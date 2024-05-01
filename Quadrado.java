import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        boolean executarPelaABitOfGeometry4 = false;
        if (args.length > 0 && args[0].equals("ABitOfGeometry4")) {
            executarPelaABitOfGeometry4 = true;
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o lado do quadrado: ");
        double lado = scanner.nextDouble();

        double area = lado * lado;

        System.out.println("A área do quadrado é: " + area);

        if (!executarPelaABitOfGeometry4) {
            scanner.close();
        }
    }
}
