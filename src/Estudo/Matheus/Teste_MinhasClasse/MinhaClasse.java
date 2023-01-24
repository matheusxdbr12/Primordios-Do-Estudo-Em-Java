package Estudo.Matheus.Teste_MinhasClasse;
public class MinhaClasse {

    //Oi
    public static void main(String[] args) {
        String primeiroNome = "Mathues";
        String segundoNome = " De Souza";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }
        public static String nomeCompleto (String primeiroNome, String segundoNome){
            return "Resultado do Método " + primeiroNome.concat("").concat(segundoNome);

        }
        
       
             
        // String meuNome = "Matheus";

        // int anoDeFabricacao = 2001;
        
        // boolean verdadeira = true;

        // boolean falsa = false;
           
        //System.out.print ("The WORLDOOOOOOOOOOOOOOOOOO!");
    
    
}
