package proyectohappypet.Modulos;

public class Especie {

    private String nombre;
    private String caract;
    private String estado;
    private int codigo;

    public Especie() {
    }

    public Especie(int codigo,String nombre, String caract, String estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.caract = caract;
        this.estado = estado;

    }

    public String getNombre() {
        return nombre;
    }

    public String getCaract() {
        return caract;
    }

    public String isEstado() {
        return estado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCaract(String caract) {
        this.caract = caract;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Especie{" + "Codigo=" + codigo + ", nombre=" + nombre + ", caract=" + caract + ", estado=" + estado + '}';
    }

}