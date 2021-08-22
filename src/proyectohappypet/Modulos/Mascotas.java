package proyectohappypet.Modulos;

public class Mascotas {

    private String nombre;
    private String fechaNac;
    private String estadom;
    private String especie;
    private String propietario;

    public Mascotas() {
    }

    public Mascotas(String nombre, String fechaNac, String estado, String especie, String propietario) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.especie = especie;
        this.propietario = propietario;
        this.estadom = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public String estadom() {
        return estadom;
    }

    public String getEspecie() {
        return especie;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public void setEstadom(String estadom) {
        this.estadom = estadom;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", fechaNac=" + fechaNac + ", especie=" + especie + ", propietario=" + propietario + ", Estado=" + estadom + '}';
    }

}
