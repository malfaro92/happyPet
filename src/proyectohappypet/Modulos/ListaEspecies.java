/*lista doble circular */
package proyectohappypet.Modulos;

public class ListaEspecies {

    private NodoEspecie cabeza;
    private NodoEspecie ultimo;

    public ListaEspecies() {
    }

    public NodoEspecie getCabeza() {
        return cabeza;
    }

    public NodoEspecie getUltimo() {
        return ultimo;
    }

    public void setCabeza(NodoEspecie cabeza) {
        this.cabeza = cabeza;
    }

    public void setUltimo(NodoEspecie ultimo) {
        this.ultimo = ultimo;
    }

    public boolean existeCodigo(int codigo) {
        boolean d = false;
        NodoEspecie aux = cabeza;
        if (aux != null) {
            int n2 = aux.getDato().getCodigo();
            
            if (n2 == codigo) {
                d = true;
                return d;
            }
            aux = aux.getNext();
            while (aux != cabeza) {
                n2 = aux.getDato().getCodigo();

                if (n2 == codigo) {
                    d = true;
                    return d;
                }
                aux = aux.getNext();
            }
        }
        return d;
    }

    public boolean existe(String nombre) {
        boolean d = false;
        NodoEspecie aux = cabeza;

        if (aux != null) {
            String n2 = aux.getDato().getNombre();

            if (n2.equals(nombre)) {
                d = true;
                return d;
            }
            aux = aux.getNext();
            while (aux != cabeza) {
                n2 = aux.getDato().getNombre();

                if (n2.equals(nombre)) {
                    d = true;
                    return d;
                }
                aux = aux.getNext();
            }
        }
        return d;
    }
    
    public boolean existe2(Especie e) {
        boolean d = false;
        NodoEspecie aux = cabeza;
        if (aux != null) {
            if (aux.getDato() == e) {
                d = true;
                return d;
            }
            aux = aux.getNext();
            while (aux != cabeza) {
                if (aux.getDato() == e) {
                    d = true;
                    return d;
                }
                aux = aux.getNext();
            }
        }
        System.out.println("La especie no existe: " + e.getNombre());
        return d;
    }

    public String insertaRecursivo(Especie e, NodoEspecie aux) {
        String s = "";
        if (existe(e.getNombre())) {
            s = "La especie ya existe";
            return s;
        } else {
            if (aux == null) {
                aux = new NodoEspecie(e);
                cabeza = aux;
                ultimo = cabeza;
                ultimo.setNext(cabeza);
                cabeza.setBack(ultimo);
                s = "La especie se agrego satisfactoriamente";
                return s;
            } else {
                String a1 = e.getNombre();
                String a2 = aux.getDato().getNombre();

                if (a1.equals(a2)) {
                    if (aux == cabeza) {
                        NodoEspecie aux2 = new NodoEspecie(e);
                        aux2.setNext(cabeza);
                        cabeza.setBack(aux2);
                        cabeza = aux2;
                        ultimo.setNext(cabeza);
                        cabeza.setBack(ultimo);
                    } else {
                        NodoEspecie temp = new NodoEspecie(e);
                        temp.setNext(aux);
                        aux.getBack().setNext(temp);
                        temp.setBack(aux.getBack());
                        aux.setBack(temp);
                    }
                } else if (!a1.equals(a2) && aux == ultimo) {
                    NodoEspecie aux2 = new NodoEspecie(e);
                    ultimo.setNext(aux2);
                    ultimo = aux2;
                    ultimo.setNext(cabeza);
                    cabeza.setBack(ultimo);
                    aux2.setBack(aux);
                } else {
                    if (aux.getNext() != cabeza) {
                        insertaRecursivo(e, aux.getNext());
                    }
                }
                s = "La especie se agrego satisfactoriamente";
                return s;
            }
        }
    }

    public void inactivaRecursivo(String e, NodoEspecie aux, ArbolCitas ac, NodoCitas raiz) {
        if (existe(e)) {
            String a1 = e;
            String a2 = aux.getDato().getNombre();

            if (a1.equals(a2)) {
                if (ac.existeEspeciea(e, raiz) == false) {
                    aux.getDato().setEstado("Inactivo");
                    System.out.println("Se desactivo la especie: " + e);
                } else {
                    System.out.println("La especie tiene una cita activa");
                }
            } else {
                inactivaRecursivo(e, aux.getNext(), ac, raiz);
            }
        } else {
            System.out.println("La especie no existe");
        }
    }

    public void ModificaRecursivo(Especie e, NodoEspecie aux) {
        if (existeCodigo(e.getCodigo())) {
            int a1 = e.getCodigo();
            int a2 = aux.getDato().getCodigo();

            if (a1 == a2) {
                aux.setDato(e);
            } else {
                ModificaRecursivo(e, aux.getNext());
            }
        } else {
            System.out.println("El codigo para esa especie no existe");
        }
    }

    @Override
    public String toString() {

        NodoEspecie aux = cabeza;
        String s = "Lista: \n";
        if (aux != null) {
            s += aux + "\n";
            aux = aux.getNext();
            while (aux != cabeza) {
                s += aux + "\n";
                aux = aux.getNext();
            }
        } else {
            s += "vacia";
        }
        return s;
    }

}
