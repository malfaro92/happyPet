package proyectohappypet.Modulos;

public class Usuarios {

    private String nombre;
    private String apellidos;
    private String contrasena;
    private String estado;
    private String usuario;

    public Usuarios(String nombre, String apellidos, String contrasena, String estado, String user) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.contrasena = contrasena;
        this.estado = estado;
        this.usuario = user;
    }

    public Usuarios() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String isEstado() {
        return estado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", contrasena=" + contrasena + ", estado=" + estado + ", usuario=" + usuario + '}';
    }

}
