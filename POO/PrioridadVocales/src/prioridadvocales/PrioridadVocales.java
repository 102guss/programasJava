package prioridadvocales;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PrioridadVocales {

    public static void main(String[] args) {

        Comparator<Cadena> comparadorCadenas = new Comparator<Cadena>() {

            public int compare(Cadena c1, Cadena c2) {

                if (c1.getPalabra().compareTo(c2.getPalabra()) < 0) {

                    return -1;
                } else {

                    return 1;
                }

            }

        };

        PriorityQueue<Cadena> colaCadenas = new PriorityQueue<Cadena>(comparadorCadenas);

        colaCadenas.add(new Cadena("aeix"));
        colaCadenas.add(new Cadena("aeioux"));
        colaCadenas.add(new Cadena("aex"));
        colaCadenas.add(new Cadena("aeiox"));
        colaCadenas.add(new Cadena("ax"));

        System.out.println("cola: " + colaCadenas);
        System.out.println("Siguiente: " + colaCadenas.peek());

        colaCadenas.remove();
        System.out.println("Siguiente: " + colaCadenas.peek());
        colaCadenas.remove();
        System.out.println("Siguiente: " + colaCadenas.peek());
        colaCadenas.remove();
        System.out.println("Siguiente: " + colaCadenas.peek());
        colaCadenas.remove();
        System.out.println("Siguiente: " + colaCadenas.peek());

    }

}
