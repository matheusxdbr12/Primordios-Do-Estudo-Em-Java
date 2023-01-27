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