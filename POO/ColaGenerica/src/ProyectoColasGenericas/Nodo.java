
package ProyectoColasGenericas;


public class Nodo<T> {

    private T posicion;
    private Nodo elemento;

    public Nodo(T posicion) {
        this.posicion = posicion;
        elemento = null;
    }

    public Nodo(T posicion, Nodo<T> elemento) {
        this.posicion= posicion;
        this.elemento = elemento;
    }

    public T getPosicion() {
        return posicion;
    }

    public void setPosicion(T posicion) {
        this.posicion = posicion;
    }

    public Nodo getElemento() {
        return elemento;
    }

    public void setElemento(Nodo<T> elemento) {
        this.elemento = elemento;
    }
}



