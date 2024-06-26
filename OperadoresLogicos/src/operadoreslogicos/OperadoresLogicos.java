
package operadoreslogicos;


public class OperadoresLogicos {

   
    public static void main(String[] args) {
       //primera variable
       boolean valor1 = true;
       
       //segunda variable
       boolean valor2 = true;
       
       //tercera variable
       boolean valor3 = true;
       
       //cuarta variable
       boolean valor4 = false;
       
       //operador logico &&
        System.out.println("primer resultado: " + (valor1 && valor2));
        System.out.println("segundo resultador: " + (valor3 && valor4));
        
        //operador logico ||
        System.out.println("tercer resultado: " + (valor1 || valor2));
        System.out.println("cuarto resultado: " + (valor1 ||  valor4));
        
        //operador logico !
        System.out.println("quinto resultador: " + (!valor1));
        System.out.println("sexto resultado: " + (!valor4));
    }
    
}
