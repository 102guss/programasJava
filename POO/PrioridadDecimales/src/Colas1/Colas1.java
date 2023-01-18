package Colas1;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Colas1 {

    public static void main(String[] args) {
        
        //hacemos un comparador 
        Comparator<Double> comparadorDecimales = new Comparator<Double>(){
          public int compare(Double n1, Double n2)  {
          
          if(n1 < n2){ // el primero es prioritario, es menor
          return -1;
          }else{
          return 1;  //El segundo es prioritario, es menor
              }
           }
        };
        
        PriorityQueue<Double> colaDecimales = new PriorityQueue<Double>(comparadorDecimales);

        colaDecimales.add(0.45);
        colaDecimales.add(0.8);
        colaDecimales.add(0.34);
        colaDecimales.add(0.81);
        colaDecimales.add(0.4);
        colaDecimales.add(0.09);
        colaDecimales.add(0.1);
        colaDecimales.add(0.08);
        colaDecimales.add(0.811);
       
        System.out.println("El numero con mayor prioridad es "+colaDecimales.peek());//metodo ver
        colaDecimales.remove();
       System.out.println("El numero con mayor prioridad es "+colaDecimales.peek());//metodo ver
        colaDecimales.add(0.07);
        System.out.println("El numero con mayor prioridad es "+colaDecimales.peek());//metodo ver
       
        
      /*
        //para saber cual es el elemento ma prioritario usaremos el metodo peek
        //peek acomoda de menor a mayor
        System.out.println("siguiente tnumero en salir: " + colaDecimales.peek());
        */
        //para imprimir la cola usando la Clase "Iterator", con su metodo "iterator".
        Iterator<Double> iteradorDecimales = colaDecimales.iterator();
        
        while(iteradorDecimales.hasNext() ){
            System.out.println( iteradorDecimales.next());
            
        }
       
    }

}
