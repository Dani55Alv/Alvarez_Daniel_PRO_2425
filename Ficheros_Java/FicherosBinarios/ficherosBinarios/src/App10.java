import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class App10 {
    public static void main(String[] args) throws Exception {
//PROBANDO 

//Grabando objetos
// Creamos la lista de personas
// Los objetos que queramos serializar deben implementar la interfaz "Serializable"
List<ClasePersona> listaDePersonas = new ArrayList<>();
listaDePersonas.add(new ClasePersona("Juan", 18, 1.78));
listaDePersonas.add(new ClasePersona("Ana", 25, 1.90));
listaDePersonas.add(new ClasePersona("Luisa", 21, 1.66));
// Creamos una ruta para guardar el objeto
Path ruta = Paths.get("FicherosBinarios\\ficherosBinarios\\Carpeta_Objeto\\listaDePersonas.bin");

// Creamos un flujo de bits de salida para serialización con ...
try {
    // Asignamos un archivo a un flujo de salida de datos
    OutputStream archivoSalida = Files.newOutputStream(ruta);
    // Especificamos que se trata de un flujo de salida de objetos
    ObjectOutputStream flujoSalida = new ObjectOutputStream(archivoSalida);
    // Escribimos el objeto en el flujo de salida.
    flujoSalida.writeObject(listaDePersonas);
} catch (Exception e) {
    e.printStackTrace();
}



//Creamos la lista de personas para guardar el objeto que leamos el archivo
List <ClasePersona> listaDePersonasRecuperar;

//Creamos una ruta para el leer el archivo
Path rutaRecuperar = Paths.get("FicherosBinarios\\ficherosBinarios\\Carpeta_Objeto\\listaDePersonas.bin");


try {
    //Asignamos el flujo de lectura a un flujo de entrada datos
    InputStream archivoEntrada = Files.newInputStream(rutaRecuperar);

    //Especificamos que se trata de un flujo de entrada de objetos
    ObjectInputStream flujoEntrada = new ObjectInputStream(archivoEntrada);

    //Leemos el flujo de entrada y lo asignamos a la lista, especificando el tipo de objeto que estamos leyendo.
    listaDePersonasRecuperar = (List<ClasePersona>) flujoEntrada.readObject();
   
   //Comprobamos la correcta recuperaciñon del objeto.
    for (ClasePersona p: listaDePersonasRecuperar){
System.out.println(p);
    }
} catch (Exception e) {
e.printStackTrace();}


    }
}
