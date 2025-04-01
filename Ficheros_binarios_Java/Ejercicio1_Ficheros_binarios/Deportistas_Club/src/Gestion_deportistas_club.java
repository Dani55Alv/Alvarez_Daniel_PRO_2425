import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Iterator;


public class Gestion_deportistas_club {
    private List<Deportista> listaclub;

    public Gestion_deportistas_club() {
        listaclub = new ArrayList<>();

    }

    public void darAlta(String dni, String nombre, String fechaNac, Deportes deporte) {

        Deportista creandoDeportista = new Deportista(dni, nombre, fechaNac, deporte);
        System.out.println("Dado de alta con exito al usuario " + creandoDeportista);

        listaclub.add(creandoDeportista);
    }

    public void darBaja(String busquedaDni) {
        String usuario = "";
        boolean elimimacionExitosa = false;
       
        Iterator<Deportista> iteradorDeportista = listaclub.iterator();

        while (iteradorDeportista.hasNext()) {
            Deportista deportista = iteradorDeportista.next(); 

            if (deportista.getDni().equals(busquedaDni)) {
                usuario = deportista.toString(); 
                iteradorDeportista.remove(); 
                elimimacionExitosa = true;
            }
        }

        if (elimimacionExitosa == true) {
            System.out.println("Eliminacion del usuario ");
            System.out.println(usuario);
            System.out.println("con exito");
        } else {
            System.out.println("Usuario con dni: " + busquedaDni + " no encontrado");

        }

    }

    public void actualizar(String busquedaDni, String nombre, String fechaNac, Deportes deporte) {
        String usuario = "";
        String usuarioActualizado = "";

        boolean actualizacionExitosa = false;
        for (Deportista deportista : listaclub) {
            if (deportista.getDni().equals(busquedaDni)) {
                usuario = deportista.toString();

                deportista.setNombre(nombre);
                deportista.setFechaNacimiento(fechaNac);
                deportista.setDeporte(deporte);

                usuarioActualizado = deportista.toString();
                actualizacionExitosa = true;

            }
        }
        if (actualizacionExitosa == true) {
            System.out.println("Actualizacion del usuario ");
            System.out.println(usuario);
            System.out.println("a");
            System.out.println(usuarioActualizado);
            System.out.println("con exito");
        } else {
            System.out.println("Usuario con dni: " + busquedaDni + " no encontrado");

        }

    }

    public List<Deportista> getListaclub() {
        return listaclub;
    }

    public void ordenarNombreAlfabeticamente(){
boolean noHayDeportistas=true;
for (Deportista deportista : listaclub) {
    noHayDeportistas=false;
}

if (noHayDeportistas) {
    System.out.println("NO HAY DERPORTISTAS QUE MOSTRAR");
}else{
        Comparator<Deportista> comparadorNombre = Comparator.comparing(Deportista::getNombre);
listaclub.sort(comparadorNombre);

for (Deportista deportistas : getListaclub()) {
    System.out.println(deportistas);
}

}
    }

    public void ordenarEdad() {
        boolean noHayDeportistas = true;
        for (Deportista deportista : listaclub) {
            noHayDeportistas = false;
        }


        if (noHayDeportistas) {
            System.out.println("NO HAY DERPORTISTAS QUE MOSTRAR");
        }else{
        Comparator<Deportista> comparadorEdad = Comparator.comparing(Deportista::getFechaNacimiento);
        listaclub.sort(comparadorEdad);


        for (Deportista deportistas : getListaclub()) {
            System.out.println(deportistas);
        }

    }
    }

    public void grabarListaDeportistas(){

    }

    public void recuperarListaDeportistas() {

    }

}
