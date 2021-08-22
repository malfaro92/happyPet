package proyectohappypet.Modulos;

public class NodoPropietario {

    private NodoPropietario siguiente;
    private Propietarios dato;

    public NodoPropietario(Propietarios dato) {
        this.dato = dato;
    }

    public NodoPropietario() {
    }

    public NodoPropietario getSiguiente() {
        return siguiente;
    }

    public Propietarios getDato() {
        return dato;
    }

    public void setSiguiente(NodoPropietario siguiente) {
        this.siguiente = siguiente;
    }

    public void setDato(Propietarios dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return " dato=" + dato;
    }

}
