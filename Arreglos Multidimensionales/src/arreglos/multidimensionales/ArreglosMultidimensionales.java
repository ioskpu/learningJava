
package arreglos.multidimensionales;


public class ArreglosMultidimensionales {

    
    public static void main(String[] args) {
        // 
        /*int [] [] matriz = new int [3] [4];
        int i, j;
        
        for (i = 0; i < matriz.length; i++) {
            System.out.println("");
            
            for (j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }*/
        
        //ejemplo con valores
        int [][] numeros = new int [3][3];
        numeros[0][0] = 2;
        numeros[0][1] = 3;
        numeros[0][2] = 5;
        numeros[1][0] = 7;
        numeros[1][1] = 1;
        numeros[1][2] = 6;
        numeros[2][0] = 8;
        numeros[2][1] = 9;
        numeros[2][2] = 4;
        
        int i, j;
        
        for (i = 0; i < numeros.length; i++) {
            System.out.println(" ");
            
            for (j = 0; j < numeros.length; j++) {
                System.out.print(numeros[i][j] + " ");
            }
        }
    }
    
}
