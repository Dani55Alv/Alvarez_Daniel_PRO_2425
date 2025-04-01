import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class gestionFicherosBloque3 {
    public gestionFicherosBloque3() {

    }

    public void escribirFichero(Set<String> contenidoPorLinea) {

        Path rutaYFichero = Paths.get(
                "C:/Users/daniy/OneDrive/Escritorio/visualStudioClases/gitHub/RepositorioClase/Alvarez_Daniel_PRO_2425/Ficheros_Java/EjercicioFicheroBloque3/EjFiblo3/FicherosTextoBLQ3/ficheroblqe3Ej1.txt"

        );

        try {
            if (Files.exists(rutaYFichero)) {
                Files.write(rutaYFichero, contenidoPorLinea, StandardOpenOption.APPEND);

            } else {
                // List string
                System.out.println("No existe el fichero a escribir");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> leerFichero1() {

        Path rutaYFichero = Paths.get(
                "C:/Users/daniy/OneDrive/Escritorio/visualStudioClases/gitHub/RepositorioClase/Alvarez_Daniel_PRO_2425/Ficheros_Java/EjercicioFicheroBloque3/EjFiblo3/FicherosTextoBLQ3/ficheroblqe3Ej1.txt"

        );

        List<String> archivoTexto;
        List<String> textoTotal = new ArrayList<>();

        try {
            if (Files.notExists(rutaYFichero)) {
                System.out.println("El archivo no existe");
            } else {

                archivoTexto = Files.readAllLines(rutaYFichero);
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
        return textoTotal;
    }

    public void escribirFichero2(Set<String> contenidoPorLinea) {

        Path rutaYFichero = Paths.get(
                "C:/Users/daniy/OneDrive/Escritorio/visualStudioClases/gitHub/RepositorioClase/Alvarez_Daniel_PRO_2425/Ficheros_Java/EjercicioFicheroBloque3/EjFiblo3/FicherosTextoBLQ3/ficheroblqe3Ej2.txt"

        );

        try {
            if (Files.exists(rutaYFichero)) {
                Files.write(rutaYFichero, contenidoPorLinea, StandardOpenOption.APPEND);

            } else {
                // List string
                System.out.println("No existe el fichero a escribir");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
