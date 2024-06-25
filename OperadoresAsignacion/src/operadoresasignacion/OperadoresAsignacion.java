
package operadoresasignacion;


public class OperadoresAsignacion {

    public static void main(String[] args) {
        //operaciones de asignacion simple
        int a = 5, b = 10, c = 12, d = 8;
        
        /*a = a + 3;
        b = b * 2;
        c = c / 2;
        d = d - 4;
        
        System.out.println("a es = " + a);
        System.out.println("b es = " + b);
        System.out.println("c es = " + c);
        System.out.println("d es = " + d);*/
        
        //operaciones de asignacion compuesta
        a += 3;
        b *= 2;
        c /= 2;
        d -= 4;
        
        System.out.println("a es = " + a);
        System.out.println("b es = " + b);
        System.out.println("c es = " + c);
        System.out.println("d es = " + d);
    }
    
}
