
package proyectohappypet.Modulos;
import java.util.Date;


public class ArbolCitas {
    private NodoCitas raiz;

    public ArbolCitas() {
    }

    public NodoCitas getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoCitas raiz) {
        this.raiz = raiz;
    }
    
    
    public void inserta(Citas x) {

        if (raiz == null) {
            raiz = new NodoCitas(x);
        } else {
            insertaR(raiz, x);
        }

    }

    public void insertaR(NodoCitas n, Citas x) {
        Date date1 = x.getFecha();
        Date date2 = n.getCita().getFecha();
        
        if (date1.before(date2)) {
            if (n.getHijoizq() == null) {
                n.setHijoizq(new NodoCitas(x));
            } else {
                insertaR(n.getHijoizq(), x);
            }
        } else {
            if (n.getHijoder() == null) {
                n.setHijoder(new NodoCitas(x));
            } else {
                insertaR(n.getHijoder(), x);
            }
        }
        System.out.println("Se agrego la cita satisfactoriamente");
    }
    
    public boolean existePropietarioa(String pro, NodoCitas r){
        boolean d = false;
        if(r != null ){
            existePropietarioa(pro, r.getHijoder());
            existePropietarioa(pro, r.getHijoizq());
            String p1 = r.getCita().getNombreMasc().getPropietario();
            int compare= p1.compareTo(pro);
            if(compare == 0 && r.getCita().getcitaActiva() == true)
                d= true;
    }
        return d;
    }
    
    public boolean existeMascotaa(String masc, NodoCitas r){
        boolean d = false;
        if(r != null ){
            existeMascotaa(masc, r.getHijoder());
            existeMascotaa(masc, r.getHijoizq());
            String p1 = r.getCita().getNombreMasc().getNombre();
            //int compare = p1.compareTo(masc);
            
            
            if(p1.equals(masc) && r.getCita().getcitaActiva() == true)
                d= true;
    }
        return d;
    }
    
    public boolean existeEspeciea(String espec, NodoCitas r){
        boolean d = false;
        if(r != null ){
            existeEspeciea(espec, r.getHijoder());
            existeEspeciea(espec, r.getHijoizq());
            String p1 = r.getCita().getNombreMasc().getEspecie();
            int compare = p1.compareTo(espec);
            if(compare == 0 && r.getCita().getcitaActiva() == true)
                d= true;
    }
        return d;
    }
    
    public void modificaCita (Citas c, NodoCitas r){
        if(r != null ){
        modificaCita(c, r.getHijoder());
        modificaCita(c, r.getHijoizq());
        String p1 = r.getCita().getNombreMasc().getNombre();
        String p2 = c.getNombreMasc().getNombre();
        int compare = p1.compareTo(p2);
        if(compare == 0){
            r.setCita(c);
            System.out.println("Se modifico la cita satisfactoriamente");}
    }else{
        System.out.println("No hay citas");
        }
       
    }
    
    public void recorridoPostOrden(NodoCitas r) {
        if(r != null){
            recorridoPostOrden(r.getHijoizq());
            recorridoPostOrden(r.getHijoder());
            System.out.println(r.getCita().toString() + " ");
        }
    }
    
    public void cancelaCita(Mascotas m, NodoCitas r) {
        if (r != null) {
            cancelaCita(m, r.getHijoizq());
            cancelaCita(m, r.getHijoder());
            if(r.getCita().masc.getNombre()== m.getNombre()){
                System.out.println("Se cancelo la cita de la mascota: " + m.getNombre());
                r.getCita().setcitaActiva(false);
            }
            }
    }
        
    }
