
package proyectohappypet.Modulos;
import java.util.Date;


public class Citas {
    public Date fecha;
    public Mascotas masc;
    public int precio;
    public String nombreUsua;
    boolean citaActiva;

    public Citas(Date fecha, Mascotas nombreMasc, int precio, String nombreUsua) {
        this.fecha = fecha;
        this.masc = nombreMasc;
        this.precio = precio;
        this.nombreUsua = nombreUsua;
        this.citaActiva = true;
    }

    public Citas() {
    }

    public Date getFecha() {
        return fecha;
    }
    
    public boolean getcitaActiva(){
        return citaActiva;
    }
    
    public void setcitaActiva(boolean c){
        this.citaActiva=c;
    }
    
    public Mascotas getNombreMasc() {
        return masc;
    }

    public int getPrecio() {
        return precio;
    }

    public String getNombreUsua() {
        return nombreUsua;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }


    public void setNombreMasc(Mascotas nombreMasc) {
        this.masc = nombreMasc;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setNombreUsua(String nombreUsua) {
        this.nombreUsua = nombreUsua;
    }

    @Override
    public String toString() {
        return "Citas{" + "fecha=" + fecha + ", Propietario=" + masc.getPropietario() + ", Mascota=" + masc + ", precio=" + precio + ", nombreUsua=" + nombreUsua + '}';
    }
    
    
    
}
