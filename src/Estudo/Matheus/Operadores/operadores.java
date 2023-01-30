package Estudo.Matheus.Operadores;

public class operadores {
    public static void main(String[] args) {
        String nome1 = "Matheus";
        String nome2 = new String("Matheus");

        System.out.println(nome1.equals(nome2));
             
        int numero1 = 1;                   
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2){
            System.out.println("A nossa condição é verdadeira!");
        }
        
        System.out.println("Número 1 é igual ao número 2? " + simNao);

        simNao = numero1 != numero2;
        
        System.out.println("Número 1 é diferente ao número 2? " + simNao);

        simNao = numero1 > numero2;
        
        System.out.println("Número 1 é maior que número 2? " + simNao);

        simNao = numero1 < numero2;
        
        System.out.println("Número 1 é menor que número 2? " + simNao);

        simNao = numero1 >= numero2;
        
        System.out.println("Número 1 é maior ou igual ao número 2? " + simNao);

        simNao = numero1 <= numero2;
        
        System.out.println("Número 1 é menor ou igual ao número 2? " + simNao);
    }
    
}

