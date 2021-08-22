
package proyectohappypet.Modulos;


public class NodoCitas {
    
    private Citas cita;
    private NodoCitas hijoizq;
    private NodoCitas hijoder;

    public NodoCitas() {
    }

    public NodoCitas(Citas cita) {
        this.cita = cita;
    }

    public Citas getCita() {
        return cita;
    }

    public NodoCitas getHijoizq() {
        return hijoizq;
    }

    public NodoCitas getHijoder() {
        return hijoder;
    }

    public void setCita(Citas cita) {
        this.cita = cita;
    }

    public void setHijoizq(NodoCitas hijoizq) {
        this.hijoizq = hijoizq;
    }

    public void setHijoder(NodoCitas hijoder) {
        this.hijoder = hijoder;
    }

    @Override
    public String toString() {
        return "{" +cita + '}';
    }
    
    
    
}
