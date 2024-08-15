
package clasesyobjetos;


public class Persona {
    //Atributos
    String nombre;
    double estatura;
    int edad;
    
    //metodo constructor
    public Persona(String _nombre, double _estatura, int _edad){
        this.nombre = _nombre;
        this.estatura = _estatura;
        this.edad = _edad;
    }
    
    public void imprimirDatos(){
        System.out.println("El nombre de la persona es: " + nombre);
        System.out.println("La estatura de la persona es: " + estatura);
        System.out.println("La edad de la persona es: " + edad);
    }
}
