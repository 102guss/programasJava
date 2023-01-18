package Test;

import TipoVehiculos.VehiculoAereo;
import TipoVehiculos.VehiculoMarino;
import TipoVehiculos.VehiculoTerrestre;
import Vehiculos.Automovil;
import Vehiculos.Avion;
import Vehiculos.Barco;
import Vehiculos.Bicicleta;
import Vehiculos.Helicoptero;
import Vehiculos.Lancha;

public class Prueba {

    public static void main(String[] args) {

        //Vehiculo vehiculo = new Vehiculo("Rojo", "Mercury");// instanciando
        VehiculoMarino barco = new Barco("Verde", "Mercury", 30);
        System.out.println(barco);
        //para el Barco
        barco.encender();//manda a llamar al metodo del padre
        barco.zarpar();//manda a llamar al metodo de la clase hija
        barco.apagar();
        barco.detener();

        //para la lancha
        System.out.println("");
        VehiculoMarino lancha = new Lancha("blanco", "Marine", 4);
        System.out.println(lancha);
        lancha.encender();
        lancha.zarpar();
        lancha.apagar();
        lancha.detener();

        //para el vehiculo Terrestre
        //Automovil
        System.out.println("");
        VehiculoTerrestre automovil = new Automovil("Rojo", "Kia", 1);
        System.out.println(automovil);
        automovil.encender();
        automovil.avanzar();
        automovil.apagar();
        automovil.frenar();
        //para la bicicleta se queda pendiente
        System.out.println("");
        VehiculoTerrestre bicicleta = new Bicicleta("Negro", "Benotto", 1);
         System.out.println(bicicleta);
        bicicleta.avanzar();
        bicicleta.frenar();

        //Para los vehiculos Aereos
        //para el Avion
        System.out.println("");
        VehiculoAereo avion = new Avion("Blanco", "volaris", 30);
        avion.encender();
        avion.despegar();
        avion.aterrizar();
        avion.apagar();
        //para el elicoptero
        System.out.println("");
        VehiculoAereo helicoptero = new Helicoptero("Verde", "Marine", 30);
        helicoptero.encender();
        helicoptero.despegar();
        helicoptero.aterrizar();
        helicoptero.apagar();
    }
}
