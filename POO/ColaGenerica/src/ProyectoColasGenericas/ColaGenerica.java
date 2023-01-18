package ProyectoColasGenericas;

import java.util.Scanner;

public class ColaGenerica {

    public static void main(String[] args) {
      
        Cola<Integer> cola = new Cola();

        cola.encolar(3);
        cola.encolar(4);
        cola.encolar(5);
        cola.encolar(6);
        cola.encolar(7);
        cola.mostrar();
        cola.desencolar();
        System.out.println("\n");
        cola.mostrar();
        
    }

}
