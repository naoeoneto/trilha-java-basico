public class BoletimEscolar {
    public static void main(String[] args) {
        double nota = 4.5;

        if (nota >= 7.0)
            System.out.println("APROVADO");
        else if (nota >= 5.0 && nota < 7.0)
            System.out.println("RECUPERAÇÃO");
        else
            System.out.println("REPROVADO");
    }
}
