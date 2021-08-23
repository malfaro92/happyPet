/*Lista Simple*/


package proyectohappypet.Modulos;


public class ListaPropietarios {
    
    private NodoPropietario cabeza;

    public ListaPropietarios() {
    }

    public NodoPropietario getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoPropietario cabeza) {
        this.cabeza = cabeza;
    }
    
    public boolean existe (String a1){
            
            NodoPropietario aux = cabeza; 
            boolean e = false;
            
            while(aux != null){
                String b= aux.getDato().getApellidos();

                if(a1.equals(b)){
                    e= true;
                    return e;
                }
                aux = aux.getSiguiente();
            }
        return e;
    }
    
    public boolean existep(Propietarios p){
        NodoPropietario aux = cabeza; 
            boolean e = false;
            
            while(aux != null){
                if(aux.getDato()==p){
                    e= true;
                }
                aux = aux.getSiguiente();
            }
        return e;
    }
    
    public String insertaRecursivo(Propietarios p, NodoPropietario aux){
        String s= "";   
        if(existe(p.getApellidos())){
            s="El propietario ya existe";
            return s;
        }
        
        else{
                if(aux == null){
                    aux = new NodoPropietario(p);
                    cabeza = aux;
                    s = "Se agrego satisfactoriamente el Propietario";
                    return s;
                } 
                else{
                    String a1= p.getApellidos();
                    String a2= aux.getDato().getApellidos();
                    
                    if(a1.equals(a2)){
                        if(aux==cabeza){
                        cabeza=new NodoPropietario(p);
                        cabeza.setSiguiente(aux);
                        } else{
                        aux.setSiguiente(aux);
                        aux=new NodoPropietario(p);   
                        }
                    }
                    else  if(!a1.equals(a2) && aux.getSiguiente()== null){
                        NodoPropietario aux2 = new NodoPropietario(p);
                        aux.setSiguiente(aux2);
                    } else{
                        if(aux != null){
                            insertaRecursivo(p, aux.getSiguiente());
                        }
                        }
                    s = "Se agrego satisfactoriamente el Propietario";
                    }
                }
        return s;
     }
    
    public void InactivaRecursivo(String p, NodoPropietario aux, ArbolCitas c, NodoCitas raiz){
        if (existe(p)){
                
                String a1 = p;
                String a2 = aux.getDato().getApellidos();
                
                if(a1.equals(a2)){
                    if(c.existePropietarioa(p, raiz)==false){
                    aux.getDato().setEstado("Inactivo");
                    System.out.println("Se desactivo el propietario: " + p);
                    }else
                        System.out.println("El propietario tiene una cita pendiente");
                }
                else {
                InactivaRecursivo(p, aux.getSiguiente(), c, raiz);
                }
        } 
        else{
        System.out.println("El Propietario no existe");
        }
        
    }
    
    public void ModificaRecursivo(Propietarios p, NodoPropietario aux){
                
        if(existe(p.getApellidos())){        
                String a1 = p.getApellidos();
                String a2 = aux.getDato().getApellidos();
                
                if(a1.equals(a2)){
                    aux.setDato(p);
                    }
                else {
                ModificaRecursivo(p, aux.getSiguiente());
                }
        }
                  
    }
    
        @Override
    public String toString() {

        NodoPropietario aux = cabeza;
        String s = "Lista: \n";
        while (aux != null) {
            s += aux + "\n";
            aux = aux.getSiguiente();
        }
        return s;
    }
    
        
}
