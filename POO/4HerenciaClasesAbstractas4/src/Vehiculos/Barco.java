
package Vehiculos;

import TipoVehiculos.VehiculoMarino;

public class Barco extends VehiculoMarino{
    
    public String timon;
    public String ancla;
    
    public Barco(String color, String marca, int pasajeros){
        super(color, marca, pasajeros);
    }
    
    @Override
    public void zarpar() {
        System.out.println("El barco esta zarpando");
    }
    
    
     @Override
       public  void detener(){
       
           System.out.println("El barco se esta deteniendo");
       }
    
}
