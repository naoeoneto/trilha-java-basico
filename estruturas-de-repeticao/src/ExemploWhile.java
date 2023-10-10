public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        while(mesada > 0){
            double valorDoce = 5.0;

            mesada = mesada - valorDoce;
            System.out.println("Mesada: " + mesada);
        }
        System.out.println("Você gastou toda a sua mesada");
    }
}
