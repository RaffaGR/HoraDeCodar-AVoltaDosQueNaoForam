public class UmaBrincadeiraSobreAlturas15 {
    public static void main(String[] args) {
        double alturaAnacleto = 1.50;
        double alturaFelisberto = 1.10;
        int anos = 0;

        while (alturaFelisberto <= alturaAnacleto) {
            alturaAnacleto += 0.02; // Anacleto cresce 2 centímetros por ano
            alturaFelisberto += 0.03; // Felisberto cresce 3 centímetros por ano
            anos++;
        }

        System.out.println("Serão necessários " + anos + " anos para que Felisberto seja maior que Anacleto.");
    }
}
