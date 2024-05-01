import java.util.Scanner;

public class Paralelogramo {
    public static void main(String[] args) {
        boolean executarPelaABitOfGeometry4 = false;
        if (args.length > 0 && args[0].equals("ABitOfGeometry4")) {
            executarPelaABitOfGeometry4 = true;
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base do paralelogramo: ");
        double base = scanner.nextDouble();

        System.out.print("Digite a altura do paralelogramo: ");
        double altura = scanner.nextDouble();

        double area = base * altura;

        System.out.println("A área do paralelogramo é: " + area);

        if (!executarPelaABitOfGeometry4) {
            scanner.close();
        }
    }
}
