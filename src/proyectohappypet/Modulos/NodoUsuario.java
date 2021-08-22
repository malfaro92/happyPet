package proyectohappypet.Modulos;

public class NodoUsuario {

    private Usuarios dato;
    private NodoUsuario siguiente;

    public NodoUsuario(Usuarios dato) {
        this.dato = dato;
    }

    public NodoUsuario() {
    }

    public Usuarios getDato() {
        return dato;
    }

    public NodoUsuario getSiguiente() {
        return siguiente;
    }

    public void setDato(Usuarios dato) {
        this.dato = dato;
    }

    public void setSiguiente(NodoUsuario siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "{" + dato + '}';
    }

}
