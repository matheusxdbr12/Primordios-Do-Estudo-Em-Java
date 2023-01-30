# Tipificação de Operações em Java

## Operador de Atribuição "=";
    Ex: String nome = "Eusebio";
    Ex: int idade = 20; 
    Ex: double peso = 98.5; (Ps: numeros com virgula em java, se utilizam o Ponto ["."], baseando em conversão Americana);
    Ex: char sexo : "M";
    Ex: Boolean doadorDeOrgao = true;
    Ex Date dataNascimento = new Date();

## Operações Atitiméticas

    Ex: double soma = 25.5 + 17.5;
    Ex: double subtracao = 15.9 - 10.9;
    Ex: int multiplicacao = 25 * 100;
    Ex: int divisao = 50 / 5;
    Ex: int modulo = 15 % 3;
    Ex: double resultado = (10 + 9) * (25 / 5);

## Utilização de Operador de Adição, em Texto

### Ele unifica os textos para formação de uma palavra

    Ex: string nomeCompleto = "Linguagem " + "Java"; 
    Ex: string nomeDaLoja = "Big " + "Bom " + "Preço";

     public static void main(String[] args) {
         String nomeCompleto = "Linguaguem " + "Java";
         System.out.print(nomeCompleto);

### Concatenação

    public class operadores {
    
         public static void main(String[] args) {
           
             String concatenacao ="?";

                 concatenacao = 1+1+1+"1";

             System.out.println(concatenacao);

                 concatenacao = 1+"1"+1+1;

             System.out.println(concatenacao);

                 concatenacao = 1+"1"+1+"1";

             System.out.println(concatenacao);

                 concatenacao = "1"+(1+1+1);

             System.out.println(concatenacao);

### Operadores Unários

(+) Operador unário de valor positivos - Números são positivos ou expressão aritmética;

(-) Operador unário de valor Negativo -  Nega um número ou expressão aritmética;

(++) Operador unário de incremento de valor - Incrementa o valor em 1 unidade ("x+1");

(--) Operador unário de decremento de valor - Decrementa o valor em uma unidade ("y-1");

(!) Operador unário lógico de negação - Nega o valor de uma expressão booleana; 

        int numero = 5;
        
        numero = - numero;
               
        System.out.println(numero);

        numero = numero * -1;

        System.out.println(numero);

        numero = ++ numero;

        System.out.println(numero);

### Incremento aritmético

    int numero = 5;
     
        numero ++;
        // (numero = numero +1)

        System.out.println(++ numero);

### Incremento booleano
    
    boolean variavel = true;

        variavel = !variavel;

        System.out.println(variavel);

### Operador Ternario

     Representada pelos símbolos "?:", utilizados no exemplo a baixo;

         <expressão condicional> ? <Caso condição seja true> : <caso condição seja false>
EX:
    int a, b;

             a = 6;
             b = 6;
 
             String resultado = a==b ?"verdadeiro":"falso";
                 /*if(a==b)
                  resultado = "verdadeiro";
                 else
                 resultado = "falso";
                  */
     System.out.println(resultado); 

### Relacionais

"==" -> Quando desejamos verificar se uma variável é "IGUAL A" outra;

"!=" -> Quando desejamos verificar se uma variável é "DIFERENTE" da Outra; 

">" ->  Quando desejamos verificar se uma variável é "MAIOR QUE" a outra;

">=" -> Quando desejamos verificar se uma variável é "MAIOR OU IGUAL" a outra;

"<" -> Quando desejamos verificar se uma variável é "MENOR QUE" a outra;

"<=" -> Quando desejamos verificar se uma variável é "MENOR OU IGUAL" a outra;

Ex:
 
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

### Lógicos

"&&" -> Operador lógico "E";

"||" -> Operador Lógico "Ou";

Ex: 

boolean condicao1 = true;

boolean condicao2 = false;

    if(condicao1 && (7 > 4)){  // Verificando as duas condições para vê se são verdadeiras
        System.out.println("As duas condições são verdadeiras");
        }
    if(condicao1 || condicao2){ // Verificando se há alguma condição verdadeira
        System.out.println("Uma das condições é verdadeiras");
        }
        System.out.println("Fim!");

