package Colas1;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class ColaCiudad {

    public static void main(String[] args) {

        Comparator<Ciudad> comparadorHabitantes = new Comparator<Ciudad>() {

            public int compare(Ciudad c1, Ciudad c2) {
                if (c1.getNumeroHabitantes() > c2.getNumeroHabitantes()) {
                    return -1;
                } else {
                    return 1;
                }
            }
        };

        PriorityQueue<Ciudad> colaciudades = new PriorityQueue<Ciudad>(comparadorHabitantes);
        colaciudades.add(new Ciudad("Argentina", 3800000, "Buenos Aires",2287));
        colaciudades.add(new Ciudad("Bolivia", 3700000,"La Paz", 2387));
        colaciudades.add(new Ciudad("Chile", 3900000,"Santiago", 2487));
        colaciudades.add(new Ciudad("Mexico", 3600000, "CDMX",2687));
        colaciudades.add(new Ciudad("China", 3500000,"Beijing", 2887));

        //para imprimir la cola usando la Clase "Iterator", con su metodo "iterator".
        Iterator<Ciudad> iteradorCiudades = colaciudades.iterator();

        while (iteradorCiudades.hasNext()) {
            System.out.println(iteradorCiudades.next());

        }

        System.out.println("\n");
        System.out.println("El numero con mayor prioridad es " + colaciudades.peek());//metodo ver
        //podemos desencolar usando "remove();"
        //System.out.println("\n");
        //colaciudades.remove();//removera el mas prioritario  y al imprimirlo mostrara el que le sigue de prioridad
       // System.out.println("El numero con mayor prioridad es " + colaciudades.peek());
        //podemos encolar usando "add();
    }

}
