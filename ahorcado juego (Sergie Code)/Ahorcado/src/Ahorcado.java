import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        //Clase scanner para leer datos
        Scanner scanner = new Scanner(System.in);

        //Declaracioones y asignaciones
        String palabraSecreta = "parangaricutirimicuaro";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        //Arreglos
        char[]letrasAdivinadas = new char[palabraSecreta.length()];

        //Estructura de control: Iterativa (bucle)
        for(int i = 0; i < letrasAdivinadas.length; i++){
            letrasAdivinadas[i] = '_';
        }

        //Estructura de control: Iterativa (bucle)
        while(!palabraAdivinada && intentos < intentosMaximos){
            System.out.println("Palabra a adeivinar: " + String.valueOf(letrasAdivinadas) + "(" + palabraSecreta.length() + " letras)");

            System.out.println("Introduce una letra, por favor");

            //Usamos la clase scanner para leer datos
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

            //Estructura de control: Iterativa (bucle)
            for(int i = 0; i < palabraSecreta.length(); i++){
                //Estructura de control: Condicional (if)
                if(palabraSecreta.charAt(i) == letra){
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }

            if(!letraCorrecta){
                intentos++;
                System.out.println("!Incorrecto te quedan " + (intentosMaximos - intentos) + " intentos");
            }

            if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                palabraAdivinada = true;
                System.out.println("¡Felicidades! Has adivinado la palabra secreta: " + palabraSecreta);
            }
        }
        if(!palabraAdivinada){
            System.out.println("!Lo siento, has agotado tus intentos. Game Over!");
        }
        scanner.close();
    }    
}