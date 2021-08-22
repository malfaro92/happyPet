package proyectohappypet.Modulos;

import javax.swing.JOptionPane;

public class ColaUsuarios {

    public NodoUsuario raiz;
    public NodoUsuario fondo;

    public boolean vacia() {
        return raiz == null;
    }

    public void insertar(Usuarios info) {
        NodoUsuario nuevo = new NodoUsuario(info);
        if (vacia()) {
            raiz = nuevo;
            fondo = nuevo;
        } else {
            fondo.setSiguiente(nuevo);
            fondo = nuevo;
        }
    }

    public void inactivarUsuario(String user) {
        NodoUsuario aux = raiz;
        while (aux != null) {
            if (aux.getDato().getUsuario().equals(user)) {
                //falta agregar modulo citas y validar citas antes de desactivar.
                aux.getDato().setEstado("Inactivo");
                System.out.println("Se desactivo el usuario: " + user);
            }
            aux = aux.getSiguiente();
        }
    }

    public void imprimir() {
        NodoUsuario reco = raiz;
        System.out.println("Listado de todos los usuarios.");
        while (reco != null) {
            System.out.print(reco + "\n");
            reco = reco.getSiguiente();
        }
        System.out.println();
    }

}
