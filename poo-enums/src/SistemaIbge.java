public class SistemaIbge {
    public static void main(String[] args) {
        for(EstadoBrasileiro e: EstadoBrasileiro.values()){
            System.out.println(e.getSigla() + " - " + e.getNome());
        }

        EstadoBrasileiro e = EstadoBrasileiro.PARÁ;
        System.out.println(e.getNome() + " - " + e.getSigla());
        System.out.println(e.getNomeMaiusculo());
        System.out.println(e.getIbge());
    }
}
