package Estudo.Matheus.Operadores;

public class operadores {
    public static void main(String[] args) {
        boolean condicao1 = true;

        boolean condicao2 = false;

        if(condicao1 && (7 > 4)){  // Verificando as duas condições para vê se são verdadeiras
            System.out.println("As duas condições são verdadeiras");
        }
        if(condicao1 || condicao2){ // Verificando se há alguma condição verdadeira
            System.out.println("Uma das condições é verdadeiras");
        }
             System.out.println("Fim!");
    }
    
}

