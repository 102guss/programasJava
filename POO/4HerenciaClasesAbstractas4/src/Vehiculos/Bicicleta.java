
package Vehiculos;

import TipoVehiculos.VehiculoTerrestre;

public class Bicicleta extends VehiculoTerrestre{
     public int manobrio;
    public int cadena;

    public Bicicleta (String color, String marca, int conductor) {
        super(color, marca, conductor);
    }

    @Override
    public void avanzar() {
        System.out.println("La Bicicleta esta avanzando");
    }

    @Override
    public void frenar() {

        System.out.println("La bicicleta se esta deteniendo");
    }
}
