
package pkgswitch;

public class Switch {

  
    public static void main(String[] args) {
        char vocal = 'U';
        
        //usando break
        switch(vocal){
            case 'A':
                System.out.println("se encontro la vocal A");
                break;
            case 'E':
                System.out.println("se encontro la vocal E");
                break;
            case 'I':    
                System.out.println("se encontro la vocal I");
                break;
            case 'O':
                System.out.println("se encontro la vocal O");
                break;
            case 'U':
                System.out.println("se encontro la vocal U");
                break;
            default:
                System.out.println("no se encontro vocal");
                break;
        }
        
        int mes = 5;
        String nombre_mes = "";
        
        //usando nueva forma sin breack
        switch(mes){
            case 1 -> nombre_mes = "Enero";
            case 2-> nombre_mes = "Febrero";
            case 3-> nombre_mes = "Marzo";
            case 4-> nombre_mes = "Abril";
            case 5-> nombre_mes = "Mayo";
        }
        System.out.println("el mes es: " + nombre_mes);
    }
    
}
