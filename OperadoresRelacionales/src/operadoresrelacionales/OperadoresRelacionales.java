
package operadoresrelacionales;


public class OperadoresRelacionales {

    public static void main(String[] args) {
        //variables
        int a = 10;
        int b = 12;
        
        //operadores relacionales
        System.out.println("a == b: " + (a == b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a >= b: " +(a >= b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a != b: " + (a != b));
        
        //prueba con condicionales
        if(a >= b){
            System.out.println("si es");
        }
        else{
            System.out.println("no es");
        }
    }
    
}
