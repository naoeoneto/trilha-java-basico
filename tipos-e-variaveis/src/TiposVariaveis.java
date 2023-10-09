public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        double salarioMinimo = 2500; // MILHAR
        double salarioMinimo2 = 2.500; // DECIMAL

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        // short numeroCurto2 = numeroNormal; ERRADO
        short numeroCurto2 = (short) numeroNormal; // CORRETO

        int numero = 5;
        numero = 10;
        System.out.println(numero);

        final double VALOR_DE_PI = 3.14;
        // VALOR_DE_PI = 10.75;
        System.out.println(VALOR_DE_PI);
    }
}
