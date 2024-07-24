
package ciclofor;

/**
 *
 * @author Luis
 */
public class CicloFor {

    public static void main(String[] args) {
        //imprimir una lista de 100 numeros
        
        /*for(int i = 0; i <= 100; i++ )
        {
            System.out.println("Numero: " + i);
        }*/
        
        //tabla de mult del numero 2
        
        int numero = 2;

        System.out.println("Tabla de multiplicar del " + numero);
        for (int i = 1; i <= 10; i++) {  // El rango va de 1 a 10
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}


