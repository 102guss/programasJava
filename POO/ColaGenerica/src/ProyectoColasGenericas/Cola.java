 package ProyectoColasGenericas;


public class Cola<T> {

    private Nodo<T> primero;
    private Nodo<T> ultimo;

    public Cola() {
        primero = null;
        ultimo = null;
    }

    public void encolar(T x) {
        Nodo<T> nuevo = new Nodo(x, null);
        if (primero == null) {
            primero = nuevo;
        } else {
            ultimo.setElemento(nuevo);
        }
        ultimo = nuevo;
    }

    public T desencolar() {
        T x;
        Nodo<T> temp;
        x = primero.getPosicion();
        temp = primero;
        primero = primero.getElemento();
        temp = null;
        if (primero == null) {
            ultimo = null;
        }
        return x;
    }

    public void mostrar() {
        Nodo<T> p = primero;
        while (p != null) {
            System.out.println(p.getPosicion());
            p = p.getElemento();
        }
    }

    public boolean esVacia() {
        if (primero == null) {
            return true;
        } else {
            return false;
        }
    }
    
    
    
    

}

