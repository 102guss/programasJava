package TipoVehiculos;

public abstract class VehiculoTerrestre extends Vehiculo {

    public int conductor;

    public VehiculoTerrestre(String color, String marca, int conductor) {
        super(color, marca);
        this.conductor = conductor;

    }

    @Override
    public String toString() {
        return "Vehiculo{" + "color: " + color + ", marca: " + marca + ", conductores = " + conductor + '}';
    }

    public abstract void avanzar();

    public abstract void frenar();

}
