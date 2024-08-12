
package areglos.dinamicos;

import java.util.ArrayList;
import java.util.List;


public class AreglosDinamicos {

    
    public static void main(String[] args) {
        // 
        List<String> lengProg = new ArrayList<>();
        
        lengProg.add("C#");
        lengProg.add("Java");
        lengProg.add("Python");
        lengProg.add("c++");
        lengProg.add("Ruby");
        
        System.out.println("Arrelglo 1: " + lengProg);
        
        //borrar indice
        lengProg.remove(2);
        
        System.out.println("Arreglo sin indice 2: " + lengProg);
        
        //agregar elemento al indice 3
        
        lengProg.add(3, "FoxPro");
        System.out.println("Arreglo adicionando elemento en el indice 3: " + lengProg);
        
        lengProg.add("VB"); lengProg.add("PHP");
        
        System.out.println("Arreglo 4: " + lengProg);
    }
    
}
