public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        // System.out.println("A Tv está ligada? " + smartTv.ligada);
        System.out.println("Qual o canal? " + smartTv.canal);
        // System.out.println("Qual o volume? " + smartTv.volume);
        
        // smartTv.ligar();
        // System.out.println("A Tv está ligada? " + smartTv.ligada);
        
        // smartTv.desligar();
        // System.out.println("A Tv está ligada? " + smartTv.ligada);
        
        // smartTv.aumentarVolume();
        // smartTv.aumentarVolume();
        // smartTv.aumentarVolume();
        // System.out.println("Qual o volume? " + smartTv.volume);
        
        // smartTv.diminuirVolume();
        // System.out.println("Qual o volume? " + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Qual o canal? " + smartTv.canal);
        smartTv.mudarCanal(25);
        System.out.println("Qual o canal? " + smartTv.canal);
        
        smartTv.aumentarCanal();
        System.out.println("Qual o canal? " + smartTv.canal);
        
        smartTv.diminuirCanal();
        System.out.println("Qual o canal? " + smartTv.canal);


    }
}
