
package herenciaypolimorfismo;


public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        
        empleado.setNombre("Luis");
        empleado.setEdad(50);
        empleado.setSexo('M');
        
        empleado.setNumeroEmpleado(1451);
        empleado.setPuesto("Vendedor");
        empleado.setDepartamento("Ventas");
        
        System.out.println("Nombre del empleado: " + empleado.getNombre());
        System.out.println("Puesto del empleado: " + empleado.getPuesto());
    }
}
