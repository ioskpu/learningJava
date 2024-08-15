
package excepciones;


public class Excepciones {

    
    public static void main(String[] args) {
        // Try catch
        try{
            System.out.println("Ejejcutar instrucciones");
            System.out.println("Intstrucción 1");
            System.out.println("Instruccion 2");
        }catch(Exception e){
            //si encuentra un error, capturar y mostrar
            System.out.println("El error es: " + e);
        }finally{
            System.out.println("Instrucciones finalizadas");
        }
        
        //Try catch con error forzado
        try{
            System.out.println("Ejecutar instrucciones");
            
            int n = Integer.parseInt("N");
            
            System.out.println("Linea despues del error");
        }catch(Exception e){
            System.out.println("El error es: " + e);
        }finally{
            System.out.println("Fin de la ejecución");
        }
    }
    
}
