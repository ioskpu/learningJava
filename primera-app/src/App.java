import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {

        //uso de scanner y switch
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un número del 1 al 3: ");
        int numero = scanner.nextInt();
        scanner.close();

        System.out.println("El número ingresado es: " + numero);
        
        switch (numero) {
            case 1:
            System.out.println("hoy es: ");
            System.out.println("Lunes");
                break;
            case 2:
            System.out.println("hoy es: ");
                System.out.println("Martes");
                break;
            case 3:
            System.out.println("hoy es: ");
                System.out.println("Miércoles");
                break;
            default:
                if (numero > 3) {
                System.out.println("Número inválido");
                break;
                }
        }
    }
}
