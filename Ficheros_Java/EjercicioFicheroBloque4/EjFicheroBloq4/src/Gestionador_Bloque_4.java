import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Gestionador_Bloque_4 {
private List <String> lista_constructor;
 public Gestionador_Bloque_4(){
lista_constructor= new ArrayList<>();

 }


 public void escribirFichero(String contenido){
 
 Path rutaCompleta = Paths.get("C:\\Users\\daniy\\OneDrive\\Escritorio\\visualStudioClases\\gitHub\\RepositorioClase\\Alvarez_Daniel_PRO_2425\\Ficheros_Java\\EjercicioFicheroBloque4\\FicherosTexto_bloque4\\intentos.txt");

try {
    if (Files.exists(rutaCompleta)) {
        Files.write(rutaCompleta, contenido.getBytes(), StandardOpenOption.APPEND);
    }else{
        System.out.println("No existe el fichero a escribir");
    }
    
} catch (IOException e) {
    e.printStackTrace();
}



}




public List<String> leerFichero1(String ruta, String archivo) {

    Path rutaDef = Paths.get(ruta, archivo);

    List<String> archivoTexto;
    List<String> textoTotal = new ArrayList<>();

    try {
        if (Files.notExists(rutaDef)) {
            System.out.println("El archivo no existe");
        } else {

            archivoTexto = Files.readAllLines(rutaDef);
            System.out.println("Reproduciendo por linea el texto");
            for (String linea : archivoTexto) {
                System.out.println(linea);
                textoTotal.add(linea);
            }
            System.out.println("Fin");
        }

    } catch (Exception e) {
        System.err.println("Error");
        e.printStackTrace();
    }
    setLista_constructor(textoTotal);

    return textoTotal;
}

 public void setLista_constructor(List<String> lista_constructor) {
    this.lista_constructor = lista_constructor;
 }






}