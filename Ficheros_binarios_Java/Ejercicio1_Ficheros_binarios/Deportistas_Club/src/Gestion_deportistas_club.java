import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
        //Grabando objetos
// Creamos la lista de personas
// Los objetos que queramos serializar deben implementar la interfaz "Serializable"

// Creamos una ruta para guardar el objeto
Path ruta = Paths.get(
        "C:\\Users\\daniy\\OneDrive\\Escritorio\\visualStudioClases\\gitHub\\RepositorioClase\\Alvarez_Daniel_PRO_2425\\Ficheros_binarios_Java\\Ejercicio1_Ficheros_binarios\\Carpeta_Achivos_binario\\club.bin");
;
// Creamos un flujo de bits de salida para serialización con ...
try {
    // Asignamos un archivo a un flujo de salida de datos
    OutputStream archivoSalida = Files.newOutputStream(ruta);
    // Especificamos que se trata de un flujo de salida de objetos
    ObjectOutputStream flujoSalida = new ObjectOutputStream(archivoSalida);
    // Escribimos el objeto en el flujo de salida.
    flujoSalida.writeObject(listaclub);
} catch (Exception e) {
    e.printStackTrace();
    System.out.println("No existe ruta");
}


    }

    public void recuperarListaDeportistas() {

//Creamos una ruta para el leer el archivo
Path rutaRecuperar = Paths.get(
        "C:\\Users\\daniy\\OneDrive\\Escritorio\\visualStudioClases\\gitHub\\RepositorioClase\\Alvarez_Daniel_PRO_2425\\Ficheros_binarios_Java\\Ejercicio1_Ficheros_binarios\\Carpeta_Achivos_binario\\club.bin");

try {
    //Asignamos el flujo de lectura a un flujo de entrada datos
    InputStream archivoEntrada = Files.newInputStream(rutaRecuperar);

    //Especificamos que se trata de un flujo de entrada de objetos
    ObjectInputStream flujoEntrada = new ObjectInputStream(archivoEntrada);

    //Leemos el flujo de entrada y lo asignamos a la lista, especificando el tipo de objeto que estamos leyendo.
    listaclub = (List<Deportista>) flujoEntrada.readObject();
   
   //Comprobamos la correcta recuperaciñon del objeto.
    for (Deportista p: listaclub){
System.out.println(p);
    }
} catch (Exception e) {
e.printStackTrace();
System.out.println("No existe ruta");
}
    }

}
