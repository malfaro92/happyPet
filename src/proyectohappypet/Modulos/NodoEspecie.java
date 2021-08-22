package proyectohappypet.Modulos;

public class NodoEspecie {

    private Especie dato;
    private NodoEspecie next;
    private NodoEspecie back;

    public NodoEspecie(Especie dato) {
        this.dato = dato;
    }

    public NodoEspecie() {
    }

    public Especie getDato() {
        return dato;
    }

    public NodoEspecie getNext() {
        return next;
    }

    public NodoEspecie getBack() {
        return back;
    }

    public void setDato(Especie dato) {
        this.dato = dato;
    }

    public void setNext(NodoEspecie next) {
        this.next = next;
    }

    public void setBack(NodoEspecie back) {
        this.back = back;
    }

    @Override
    public String toString() {
        return "NodoEspecie{" + "dato=" + dato + '}';
    }

}
