
package condicionaleselseif;

public class CondicionalesElseIf {

    
    public static void main(String[] args) {
        // declaramos variable hora
        int hora = 5;
        
        if(hora >= 1 && hora <= 12){
            System.out.println("Buenos dias");
        }else if(hora >= 13 && hora <= 18){
            System.out.println("Bunas tardes");
        }else if(hora >= 19 && hora <= 24){
            System.out.println("Buenas noches");
        }else{
            System.out.println("Fuera de rango");
        }
    }
    
}
