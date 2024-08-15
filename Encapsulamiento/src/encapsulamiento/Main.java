
package encapsulamiento;


public class Main {
    public static void main(String[] args) {
        Animal perro = new Animal();
        perro.setNombre("Covid");
        perro.setEdad(3);
        perro.setRaza("Pincher");
        
        System.out.println("el nombre del perro es: " + perro.getNombre()+
                "\n la edad del perro es: " + perro.getEdad() +
                "\n la raza del perro es: " + perro.getRaza());
    }
}
