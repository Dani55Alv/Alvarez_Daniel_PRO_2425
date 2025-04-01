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
        int cantidadLetras = 0;
        int cantidadNumeros = 0;
        Path rutaDef = Paths.get(ruta, archivo);

        List<String> archivoTexto;

        try {
            if (Files.notExists(rutaDef)) {
                System.out.println("El archivo no existe");
            } else {

                
                archivoTexto = Files.readAllLines(rutaDef);
                System.out.println("Reproduciendo por linea el texto");

                for (String linea : archivoTexto) {

                    String[] porLinea = linea.split("[ ,]+");

                    for (int i = 0; i < porLinea.length; i++) {

                        String valor = porLinea[i];

                        for (int j = 0; j < valor.length(); j++) {
                            if (Character.isDigit(valor.charAt(j))) {
                                System.out.println(valor.charAt(j) + " es un número.");
                                cantidadNumeros++;
                            } else if (Character.isLetter(valor.charAt(j))) {
                                System.out.println(valor.charAt(j) + " es una letra.");

                                cantidadLetras++;

                            } else {
                                System.out.println("Otro caraceter");
                            }
                        }

                    }

                }

                System.out.println("Fin de reproduccion por linea del texto");

                System.out.println("Cantidad de letras " + cantidadLetras);

                System.out.println("Cantidad de numeros " + cantidadNumeros);

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

        String frase = "";
        List<String> arrayarchivoTextoConsonantes = new ArrayList<>();
        List<String> arrayarchivoTextoVocales = new ArrayList<>();

        try {
            if (Files.notExists(rutaDef)) {
                System.out.println("El archivo no existe");
            } else {

                archivoTexto = Files.readAllLines(rutaDef);
                System.out.println("Reproduciendo por linea el texto");

                for (String linea : archivoTexto) {
                    System.out.println(linea);

                    for (char c : linea.toCharArray()) {
                        frase = "";

                        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                            // System.out.println(c + " es unaa vocal.");
                            frase += (Character.toString(c));
                        } else if (Character.isDigit(c)) {
                            // System.out.println(c + " es un numerico.");

                        } else {
                            // System.out.println(c + " es otro carácter.");
                            // frase.add(Character.toString(c));

                        }

                        // archivoTexto.size();

                        arrayarchivoTextoVocales.add(frase);

                    }
                    for (char c : linea.toCharArray()) {
                        frase = "";

                        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                            // System.out.println(c + " es una vocal.");
                        } else if (Character.isDigit(c)) {
                            // System.out.println(c + " es un numerico.");

                        } else {
                            // System.out.println(c + " es otro carácter.");
                            frase += (Character.toString(c));

                        }

                        // archivoTexto.size();

                        arrayarchivoTextoConsonantes.add(frase);

                    }

                }

                System.out.println("Fin de reproduccion por linea del texto");
                System.out.println();
                System.out.println("Reproduciendo vocales");

                for (String frases : arrayarchivoTextoVocales) {

                    System.out.print(frases + " ");

                }
                System.out.println();
                System.out.println("Reproduciendo consonantes");

                for (String frases : arrayarchivoTextoConsonantes) {

                    System.out.print(frases + " ");

                }

                String consonantesFicheroNombre = "consonantes.txt";
                String vocalesFicheroNombre = "vocales.txt";

                crearFichero(consonantesFicheroNombre);

                crearFichero(vocalesFicheroNombre);

                escribirFichero(vocalesFicheroNombre, arrayarchivoTextoVocales);

                escribirFichero(consonantesFicheroNombre, arrayarchivoTextoConsonantes);

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
