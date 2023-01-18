package Vehiculos;

import TipoVehiculos.VehiculoTerrestre;

public class Automovil extends VehiculoTerrestre {

    public String retrovisor;
    public String volante;

    public Automovil(String color, String marca, int conductor) {
        super(color, marca, conductor);
    }

    @Override
    public void avanzar() {
        System.out.println("El automovil esta avanzando");
    }

    @Override
    public void frenar() {

        System.out.println("El  automovil se esta deteniendo");
    }

}
