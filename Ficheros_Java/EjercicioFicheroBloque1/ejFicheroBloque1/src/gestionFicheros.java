import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class gestionFicheros {

    // C:\Users\daniy\OneDrive\Escritorio\visualStudioClases\gitHub\RepositorioClase\Alvarez_Daniel_PRO_2425\Ficheros_Java\EjercicioFicheroBloque1\ejFicheroBloque1
    private String nombreGestion;

    public gestionFicheros(String nombreGestion) {
        this.nombreGestion = nombreGestion;
    }

    public void leerFichero1(String ruta, String archivo) {

        Path rutaDef = Paths.get(ruta, archivo);

        List<String> archivoTexto;

        try {
            if (Files.notExists(rutaDef)) {
                System.out.println("El archivo no existe");
            } else {

                int totalLetras = 0;
                int totalDigitos = 0;
                archivoTexto = Files.readAllLines(rutaDef);
                System.out.println("Reproduciendo por linea el texto");
                for (String linea : archivoTexto) {
                    System.out.println(linea);

                    for (char c : linea.toCharArray()) {
                        if (Character.isLetter(c)) {
                            // System.out.println(c + " es una letra.");
                            totalLetras++;

                        } else if (Character.isDigit(c)) {
                            // System.out.println(c + " es un número.");
                            totalDigitos++;

                        } else {
                            // System.out.println(c + " es otro carácter.");
                        }

                    }

                }
                System.out.println("Fin de reproduccion por linea del texto");

                System.out.println("Total lineas: " + archivoTexto.size());

                System.out.println("Numero letras: " + totalLetras);

                System.out.println("Numero de dígitos numéricos " + totalDigitos);
            }
        } catch (Exception e) {
            System.err.println("Error");
            e.printStackTrace();
        }

    }

    public void leerFichero2(String ruta, String archivo) {

        Path rutaDef = Paths.get(ruta, archivo);

        List<String> archivoTexto;

        try {
            if (Files.notExists(rutaDef)) {
                System.out.println("El archivo no existe");
            } else {

                archivoTexto = Files.readAllLines(rutaDef);
                System.out.println("Reproduciendo por linea el texto");

                for (String linea : archivoTexto) {
                    System.out.println(linea);

                    String[] nLetras = linea.split(linea);

                    System.out.println("Cantidad de letras " + nLetras.length);

                }

                System.out.println("Fin de reproduccion por linea del texto");

            }
        } catch (Exception e) {
            System.err.println("Error");
            e.printStackTrace();
        }

    }

    /*
     * 2 Escriba un programa que, a partir de un fichero de texto, genere dos
     * ficheros: uno
     * que contenga las vocales y otro que contenga las consonantes del fichero
     * original.
     */

    public void textoParaVocalesSeparadoConsonante(String ruta, String archivo) {
        Path rutaDef = Paths.get(ruta, archivo);

        List<String> archivoTexto;

        List<String> frase = new ArrayList<>();
        ;
        List<List<String>> arrayarchivoTexto = new ArrayList<>();
        List<List<String>> arrayarchivoTextoConsonantes = new ArrayList<>();

        try {
            if (Files.notExists(rutaDef)) {
                System.out.println("El archivo no existe");
            } else {

                archivoTexto = Files.readAllLines(rutaDef);
                System.out.println("Reproduciendo por linea el texto");

                for (String linea : archivoTexto) {
                    System.out.println(linea);

                    for (char c : linea.toCharArray()) {
                        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                            // System.out.println(c + " es unaa vocal.");
                            frase.add(Character.toString(c));
                        } else if (Character.isDigit(c)) {
                            // System.out.println(c + " es un numerico.");

                        } else {
                            // System.out.println(c + " es otro carácter.");
                            // frase.add(Character.toString(c));

                        }

                        // archivoTexto.size();

                        arrayarchivoTexto.add(new ArrayList<>(frase)); // Clona la lista antes de limpiarla
                        frase.clear();

                    }

                    for (char c : linea.toCharArray()) {
                        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                            // System.out.println(c + " es unaa vocal.");
                        } else if (Character.isDigit(c)) {
                            // System.out.println(c + " es un numerico.");

                        } else {
                            // System.out.println(c + " es otro carácter.");
                            frase.add(Character.toString(c));

                        }

                        // archivoTexto.size();

                        arrayarchivoTextoConsonantes.add(new ArrayList<>(frase)); // Clona la lista antes de limpiarla
                        frase.clear();

                    }

                }

                System.out.println("Fin de reproduccion por linea del texto");
                System.out.println();
                System.out.println("Reproduciendo vocales");

                for (List<String> list : arrayarchivoTexto) {

                    for (String frases : list) {
                        System.out.print(frases + " ");

                    }

                }
                System.out.println();
                System.out.println("Reproduciendo consonantes");

                for (List<String> list : arrayarchivoTextoConsonantes) {

                    for (String frases : list) {
                        System.out.print(frases + " ");

                    }

                }

                String consonantesFicheroNombre = "consonantes.txt";
                String vocalesFicheroNombre = "vocales.txt";

                crearFichero(consonantesFicheroNombre);

                crearFichero(vocalesFicheroNombre);

                for (List<String> list : arrayarchivoTexto) {

                    escribirFichero(vocalesFicheroNombre, list);

                }

                for (List<String> list : arrayarchivoTextoConsonantes) {

                    escribirFichero(consonantesFicheroNombre, list);

                }

                // escribirFichero(consonantes, contenidoConsonantes);
                // escribirFichero(vocales, contenidoVocales);

            }
        } catch (Exception e) {
            System.err.println("Error");
            e.printStackTrace();
        }

    }

    public void crearFichero(String nombreFichero) {
        Path ruta = Paths.get(
                "C:/Users/daniy/OneDrive/Escritorio/visualStudioClases/gitHub/RepositorioClase/Alvarez_Daniel_PRO_2425/Ficheros_Java/EjercicioFicheroBloque1/ejFicheroBloque1/archivosDeTexto/",
                nombreFichero);

        try {
            if (Files.exists(ruta)) {
                System.out.println("Ya existe el fichero");
            } else {
                Files.createFile(ruta);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void escribirFichero(String nombreFichero, List<String> contenidoPorLinea) {

        Path ruta = Paths.get(
                "C:/Users/daniy/OneDrive/Escritorio/visualStudioClases/gitHub/RepositorioClase/Alvarez_Daniel_PRO_2425/Ficheros_Java/EjercicioFicheroBloque1/ejFicheroBloque1/archivosDeTexto/",
                nombreFichero);

        try {
            if (Files.exists(ruta)) {
                Files.write(ruta, contenidoPorLinea, StandardOpenOption.APPEND);

            } else {
                // List string
                System.out.println("No existe el fichero a escribir");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
