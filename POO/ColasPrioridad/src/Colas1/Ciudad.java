package Colas1;

public class Ciudad {

    private String nombreCiudad;
    private String pais;
    private long numeroHabitantes;
    private long superficie;

    public Ciudad(String nombreCiudad, long numeroHabitantes, String pais, long superficie) {

        this.nombreCiudad = nombreCiudad;
        this.numeroHabitantes = numeroHabitantes;
        this.pais = pais;
        this.superficie = superficie;

    }

    public String getNomreCiudad() {
        return nombreCiudad;
    }

    public void setNomreCiudad(String nomreCiudad) {
        this.nombreCiudad = nomreCiudad;
    }

    public long getNumeroHabitantes() {
        return numeroHabitantes;
    }

    public void setNumeroHabitantes(long numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public long getSuperficie() {
        return superficie;
    }

    public void setSuperficie(long superficie) {
        this.superficie = superficie;
    }

    @Override
    public String toString() {
        return this.nombreCiudad + " - "
                + "Numero de habitantes: " + this.numeroHabitantes + " - "
                + "  Pais: " + this.pais
                  +" - "+  "  Superficie m^2: " + this.superficie;

    }

}
