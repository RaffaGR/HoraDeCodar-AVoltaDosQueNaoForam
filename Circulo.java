import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {
        boolean executarPelaABitOfGeometry4 = false;
        if (args.length > 0 && args[0].equals("ABitOfGeometry4")) {
            executarPelaABitOfGeometry4 = true;
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        double area = Math.PI * raio * raio;

        System.out.println("A área do círculo é: " + area);

        if (!executarPelaABitOfGeometry4) {
            scanner.close();
        }
    }
}
