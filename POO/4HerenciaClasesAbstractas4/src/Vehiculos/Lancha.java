
package Vehiculos;

import TipoVehiculos.VehiculoMarino;


public class Lancha extends VehiculoMarino {
    
    public String remos;
    public String cubierta;
    
    public Lancha(String color, String marca, int pasajeros){
        super(color, marca, pasajeros);
    }
    
    @Override
    public void zarpar() {
        System.out.println("La lancha esta avnzando");
    }
    
    
     @Override
       public  void detener(){
       
           System.out.println("La lancha se esta deteniendo");
       }
    
    
}
