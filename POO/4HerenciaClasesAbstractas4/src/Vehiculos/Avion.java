
package Vehiculos;

import TipoVehiculos.VehiculoAereo;


public class Avion extends VehiculoAereo{
    
    public int alas;
    public int turbinas;
    
    public Avion(String color, String marca, int pasajeros){
        super(color, marca, pasajeros);
    }
    
    @Override
    public void despegar() {
        System.out.println("El avion esta despegando");
    }
    
    
     @Override
       public  void aterrizar(){
       
           System.out.println("El avion esta aterrizando");
       }
    
    
    
}
