
package TipoVehiculos;


public class Vehiculo {
    
    /*nota: Las clases abstractas las declase como publicas  y no como protected ya que en estos
    ejemplos no utilizaremos los metodos Set y Get*/
    
   public String color;
   public String marca;
   
   Motor objmotor = new Motor(); //creamos el objeto motor a partir de la clase motor
   
   public Vehiculo(String color, String marca){
       
       this.color = color;
       this.marca = marca;
   
   }

    @Override
    public String toString() {
        return "Vehiculo{" + "color: " + color + ", marca: " + marca + '}';
    }
   
   
   public void encender(){
       objmotor.funcionando();
       System.out.println("Vehiculo encendido con el motor ensamblado ");
   }
   
   public void apagar(){
       objmotor.apagado();
       System.out.println(" vehiculo apagado");
   }
    
}
