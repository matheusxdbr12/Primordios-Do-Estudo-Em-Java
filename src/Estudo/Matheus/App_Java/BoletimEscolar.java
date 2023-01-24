package Estudo.Matheus.App_Java;

public class BoletimEscolar {
    public static void main (String [] args){
        int mediaFinal = 8;
        if (mediaFinal <6)
            System.out.println("Reprovado!"); 
        else if (mediaFinal == 6)
            System.out.println("Prova Final!");
        else 
            System.out.println("Aprovado!");

        }
}
