package proyectohappypet.Modulos;

public class NodoMascota {

    private Mascotas dato;
    private NodoMascota siguiente;

    public NodoMascota(Mascotas dato) {
        this.dato = dato;
    }

    public NodoMascota() {
    }

    public Mascotas getDato() {
        return dato;
    }

    public NodoMascota getSiguiente() {
        return siguiente;
    }

    public void setDato(Mascotas dato) {
        this.dato = dato;
    }

    public void setSiguiente(NodoMascota siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "{" + "dato=" + dato + '}';
    }

}
