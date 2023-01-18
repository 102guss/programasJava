
package TipoVehiculos;


public abstract class VehiculoAereo extends Vehiculo{
    public int pasajeros;
    
    public VehiculoAereo(String color, String marca, int pasajeros){
    super(color, marca);
        this.pasajeros = pasajeros;
    
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "color: " + color + ", marca: " + marca + ", pasajeros = " + pasajeros +'}';
    }
    public abstract void despegar();
     public abstract void aterrizar();
    
}
