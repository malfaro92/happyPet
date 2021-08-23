/*Lista circular*/
package proyectohappypet.Modulos;

public class ListaMascotas {

    private NodoMascota cabezam;
    private NodoMascota ultimom;

    public ListaMascotas() {
    }

    public NodoMascota getCabezam() {
        return cabezam;
    }

    public void setCabeza(NodoMascota cabeza) {
        this.cabezam = cabeza;
    }

    public NodoMascota getUltimo() {
        return ultimom;
    }

    public void setUltimo(NodoMascota ultimo) {
        this.ultimom = ultimo;
    }

    public boolean existe(String nombre) {
        boolean d = false;
        NodoMascota aux = cabezam;

        if (aux != null) {
            String n2 = aux.getDato().getNombre();

            if (n2.equals(nombre)) {
                d = true;
                return d;
            }
            aux = aux.getSiguiente();
            while (aux != cabezam) {
                n2 = aux.getDato().getNombre();

                if (n2.equals(nombre)) {
                    d = true;
                    return d;
                }
                aux = aux.getSiguiente();
            }
        }
        return d;
    }

    public String insertaRecursivo(Mascotas m, NodoMascota aux, ListaEspecies l1, ListaPropietarios l2) {
        String s = "";

        if (existe(m.getNombre())) {
            s = "La mascota ya existe";
            return s;
        } else {
            if (aux == null || ultimom == null) {
                if (l2.existe(m.getPropietario()) && l1.existe(m.getEspecie())) {
                    cabezam = new NodoMascota(m);
                    ultimom = cabezam;
                    ultimom.setSiguiente(cabezam);
                } else {
                    System.out.println("El propietario y/o la especie no existen.");
                }
            } else {
                String a1 = m.getNombre();
                String a2 = aux.getDato().getNombre();

                if (a1.equals(a2)) {
                    if (l2.existe(m.getPropietario()) && l1.existe(m.getEspecie())) {
                        if (cabezam == aux) {
                            NodoMascota aux2 = new NodoMascota(m);
                            aux2.setSiguiente(aux);
                            cabezam = aux2;
                        } else {
                            aux.setSiguiente(aux);
                            aux = new NodoMascota(m);
                        }
                    } else {
                        System.out.println("El propietario y/o la especie no existen.");
                    }

                } else if (!a1.equals(a2) && aux == ultimom) {
                    if (l2.existe(m.getPropietario()) && l1.existe(m.getEspecie())) {
                        NodoMascota aux2 = new NodoMascota(m);
                        ultimom.setSiguiente(aux2);
                        ultimom = aux2;
                    } else {
                        System.out.println("El propietario y/o la especie no existen.");
                    }
                } else {
                    if (aux.getSiguiente() != cabezam) {
                        insertaRecursivo(m, aux.getSiguiente(), l1, l2);
                    }
                }
                ultimom.setSiguiente(cabezam);
            }

            s = "Se agrego satisfactoriamente la mascota";
        }
        return s;
    }

    public void inactivaRecursivom(String mascota, NodoMascota aux, ArbolCitas ac, NodoCitas raiz) {
        if (existe(mascota)) {
            String a2 = aux.getDato().getNombre();

            if (mascota.equals(a2)) {
                if (ac.existeMascotaa(mascota, raiz) == false) {
                    aux.getDato().setEstadom("Inactivo");
                    System.out.println("Se desactivo la mascota");
                } else {
                    System.out.println("La mascota tiene una cita pendiente");
                }
            } else {
                inactivaRecursivom(mascota, aux.getSiguiente(), ac, raiz);
            }
        } else {
            System.out.println("La mascota no existe");
        }
    }

    public void ModificaRecursivo(Mascotas m, NodoMascota aux) {
        if (existe(m.getNombre())) {
            String a1 = m.getNombre();
            String a2 = aux.getDato().getNombre();

            if (a1.equals(a2)) {
                aux.setDato(m);
            } else {
                ModificaRecursivo(m, aux.getSiguiente());
            }
        } 

    }

    @Override
    public String toString() {

        NodoMascota aux = cabezam;
        String s = "Lista: \n";
        if (aux != null) {
            s += aux + "\n";
            aux = aux.getSiguiente();
            while (aux != cabezam) {
                s += aux + "\n";
                aux = aux.getSiguiente();
            }
        } else {
            s += "vacia";
        }
        return s;
    }

}
