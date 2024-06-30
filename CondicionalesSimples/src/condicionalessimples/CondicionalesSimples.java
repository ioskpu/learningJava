
package condicionalessimples;


public class CondicionalesSimples {

    
    public static void main(String[] args) {
        // declaramos la variable edad
        int edad = 21;
        
        //condicion 1
        System.out.println("Condicion 1");
        if(edad >= 18){
            System.out.println("eres mayor de edad");            
        }else{
            System.out.println("eres menor de edad");
        }
        
        //condicion 2
        System.out.println("Condicion 2");
        if(edad >= 8 && edad <= 18){
            System.out.println("Tu salon es el 1a");
        }else{
            System.out.println("Tu salon es el 1b");
        }
    }
    
}
