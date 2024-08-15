
package metodos;


public class Operaciones {
    //Atributos
    int numero1 = 2;
    int numero2 = 4;
    int suma, resta;
    
    //metodo bienvenida
    public void bienvenida(){
        System.out.println("BIENVENIDOS");  
    }
    
    //metodo suma
    public void sumar(){
        suma = numero1 + numero2;
    }
    
    //metodo resta
    public void restar(){
        resta = numero1 - numero2;
    }
    
    //metodo resultado
    public void resultado(){
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
    }
    
}
