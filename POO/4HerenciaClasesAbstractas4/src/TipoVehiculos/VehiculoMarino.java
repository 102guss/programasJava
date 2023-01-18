
package TipoVehiculos;


public abstract class VehiculoMarino extends Vehiculo{
    public int pasajeros;
    
    public VehiculoMarino(String color, String marca, int pasajeros){
    super(color, marca);
        this.pasajeros = pasajeros;
    
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "color: " + color + ", marca: " + marca + ", pasajeros = " + pasajeros +'}';
    }
    public abstract void zarpar();
     public abstract void detener();
    
    
}
