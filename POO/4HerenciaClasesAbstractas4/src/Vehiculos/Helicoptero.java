
package Vehiculos;

import TipoVehiculos.VehiculoAereo;


public class Helicoptero extends VehiculoAereo{
    public int elices;
    public int cola;
    
    public Helicoptero(String color, String marca, int pasajeros){
        super(color, marca, pasajeros);
    }
    
    @Override
    public void despegar() {
        System.out.println("El Helicoptero esta despegando");
    }
    
    
     @Override
       public  void aterrizar(){
       
           System.out.println("El Helicoptero esta aterrizando");
       }
}
