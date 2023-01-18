
package prioridadvocales;


public class Cadena {
    
   private String palabra;

    public Cadena(String palabra) {
        this.palabra = palabra;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public String toString() {
        return  ("Cadena: " + this.palabra );
    }
   
  
}
