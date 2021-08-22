package proyectohappypet.Modulos;

public class ProyectoHappyPet {

    public static void main(String[] args) {

        //Prueba de citas
        
        ArbolCitas ac = new ArbolCitas();
        
        NodoCitas raizc = ac.getRaiz();
        //Pruebas de Cola de usuarios
        ColaUsuarios cu = new ColaUsuarios();
        cu.insertar(new Usuarios("Wendy", "Badilla", "contrasena1", "Activo", "wendyb"));
        cu.insertar(new Usuarios("Manuel", "Lopez", "contrasena1", "Activo", "manuell"));
        cu.insertar(new Usuarios("Miguel", "Aguero", "contrasena1", "Activo", "miguela"));
        cu.insertar(new Usuarios("Daniel", "Alvarado", "contrasena1", "Activo", "daniela"));
        cu.insertar(new Usuarios("Joshua", "Oviedo", "contrasena1", "Activo", "joshuao"));
        
        cu.imprimir();
        
        //Prueba de inactivar usuario en cola
        cu.inactivarUsuario("wendyb");
        
        cu.imprimir();
        
        //Pruebas de Lista de propietarios
        ListaPropietarios lp = new ListaPropietarios();
        NodoPropietario aux = new NodoPropietario();
        aux=lp.getCabeza();
        System.out.println(lp.insertaRecursivo(new Propietarios("Jose", "Rojas", "San Joaquin", "casa 2b", "123456789", "josemoya@hotmail.com", "Activo"), aux));
        aux=lp.getCabeza();
        System.out.println(lp.insertaRecursivo(new Propietarios("Maria", "Nunez", "Alajuela", "casa 245", "123456789", "mariagomez@hotmail.com", "Activo"), aux));
        aux=lp.getCabeza();
        System.out.println(lp.insertaRecursivo(new Propietarios("Steven", "Moya", "Tibas", "Residencial los colegios", "123456789", "stevenrodri@hotmail.com", "Activo"), aux));
        aux=lp.getCabeza();
        System.out.println(lp.insertaRecursivo(new Propietarios("Susana", "Gomez", "San Francisco", "frente Oxigeno", "123456789", "susyrojas@hotmail.com", "Activo"), aux));
        aux=lp.getCabeza();
        System.out.println(lp.insertaRecursivo(new Propietarios("Josefa", "Wo", "Escazu", "casa 245", "123456789", "pablomunoz@hotmail.com", "Activo"), aux));
        aux=lp.getCabeza();
        System.out.println(lp.insertaRecursivo(new Propietarios("Pablo", "Barquero", "Escazu", "casa 245", "123456789", "pablomunoz@hotmail.com", "Activo"), aux));
        aux=lp.getCabeza();
        System.out.println(lp.insertaRecursivo(new Propietarios("Josefa", "Wo", "Escazu", "casa 245", "123456789", "pablomunoz@hotmail.com", "Activo"), aux));
        
        
        System.out.println(lp.toString());
        
        //Prueba de inactivar propietario
        aux=lp.getCabeza();
        lp.InactivaRecursivo("Wo", aux, ac, raizc);
        
        System.out.println(lp.toString());
        
        //Prueba de Lista de Especies
        ListaEspecies le = new ListaEspecies();
        NodoEspecie aux2 = new NodoEspecie();
        aux2=le.getCabeza();
        System.out.println(le.insertaRecursivo(new Especie("gato", "4 patas","Activo"), aux2));
        aux2=le.getCabeza();
        System.out.println(le.insertaRecursivo(new Especie("renacuajo", "piel babosa","Activo"), aux2));
        aux2=le.getCabeza();
        System.out.println(le.insertaRecursivo(new Especie("ave", "plumas","Activo"), aux2));
        aux2=le.getCabeza();
        System.out.println(le.insertaRecursivo(new Especie("perro", "4 patas","Activo"), aux2));
        aux2=le.getCabeza();
        System.out.println(le.insertaRecursivo(new Especie("burro", "orejas largas","Activo"), aux2));
        aux2=le.getCabeza();
        System.out.println(le.insertaRecursivo(new Especie("zorro", "cola larga","Activo"), aux2));
        aux2=le.getCabeza();
        System.out.println(le.insertaRecursivo(new Especie("aveja", "negra y amarillo","Activo"), aux2));
        
        System.out.println(le.toString());
        
        //Prueba de inactivar especie
        le.inactivaRecursivo("aveja", aux2,ac, raizc);
        System.out.println(le.toString());
        
        //Prueba de Lista de mascotas
        ListaMascotas lm = new ListaMascotas();
        NodoMascota aux3 = new NodoMascota();
        
        aux3=lm.getCabezam();
        System.out.println(lm.insertaRecursivo(new Mascotas("Susy", "31 diciembre", "Activo", "perro", "Nunez"), aux3, le, lp));
        aux3=lm.getCabezam();
        System.out.println(lm.insertaRecursivo(new Mascotas("Newton", "2 enero", "Activo", "renacuajo", "Barquero"), aux3, le, lp));
        aux3=lm.getCabezam();
        System.out.println(lm.insertaRecursivo(new Mascotas("Clifford", "12 junio", "Activo", "gato", "Wo"), aux3, le, lp));
        aux3=lm.getCabezam();
        System.out.println(lm.insertaRecursivo(new Mascotas("Ziggy", "20 abril", "Activo", "zorro", "Moya"), aux3, le, lp));
        System.out.println(lm.toString());



    }

}
