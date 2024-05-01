import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {
        boolean executarPelaABitOfGeometry4 = false;
        if (args.length > 0 && args[0].equals("ABitOfGeometry4")) {
            executarPelaABitOfGeometry4 = true;
        }
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base do retângulo: ");
        double base = scanner.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();

        double area = base * altura;

        System.out.println("A área do retângulo é: " + area);

        if (!executarPelaABitOfGeometry4) {
            scanner.close();
        }
    }
}
