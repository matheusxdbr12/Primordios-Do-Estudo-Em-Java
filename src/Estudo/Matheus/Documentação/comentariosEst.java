package Estudo.Matheus.Documentação;

public class comentariosEst {
    public static void main(String[] args) {   
   }
/* 
 * Este método foi elaborado as pressas
 * por isso eu abrevei o nome das variáveis 
 * mas olha, ele tem a finalidade somar ou multiplicar
 * dois numeros. (Obj de Estudo)
 */
        public int somaMultiplicacao (int n, int x, String m) {
            int r = 0; // r é igual ao resultado
            if (m == "M") { // M=Multiplicação
                r = n * x;
                } else {
                    // se não soma mesmo
                    r = n + x;
                }
                return r;

   }
}