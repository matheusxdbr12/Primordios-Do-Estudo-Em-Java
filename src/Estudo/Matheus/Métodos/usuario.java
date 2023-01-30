package Estudo.Matheus.Métodos;

public class usuario {

    public static void main(String[] args) throws Exception {
        
        smartTv smartTv = new smartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume Atual : " + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Canal Atual : " + smartTv.canal);

        System.out.println("Tv Ligada ? " + smartTv.ligada);
        System.out.println("Canal atual ? " + smartTv.canal);
        System.out.println("Volume Atual ? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status - Tv Ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status - Tv Ligada ? " + smartTv.ligada);

    }
    
}
