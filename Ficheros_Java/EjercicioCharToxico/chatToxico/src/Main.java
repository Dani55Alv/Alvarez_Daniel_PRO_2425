import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestionToxicidad gestionToxicidad = new GestionToxicidad();
        String ruta = "";
        String archivo = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce ruta");
        ruta = sc.nextLine();
        System.out.println("Introduce archivo");
        archivo = sc.nextLine();

        List<String> chat = gestionToxicidad.leerFicheros(ruta, archivo);
        System.out.println("Versión censurada");
        boolean palabrotaDEtectada = false;
        String palabraPorCaractar = "";
        String lineVersionCensurada = "";
        String lineaOriginal = "";

        // Nueva lista para hacer el texto censurado.
        List<String> textoCensurado = new LinkedList<>();
        ;
        // list.asArray

        // Lista de palabras a censurar
        List<String> palabrasCensuradas = new ArrayList<>();

        palabrasCensuradas.add("espantapájaros");
        palabrasCensuradas.add("pelotudo");
        palabrasCensuradas.add("manco");
        palabrasCensuradas.add("neuronas");
        palabrasCensuradas.add("muerto");
        palabrasCensuradas.add("baboso");
        palabrasCensuradas.add("forros");
        palabrasCensuradas.add("orto");
        palabrasCensuradas.add("mierda");
        palabrasCensuradas.add("carreta");

        int posicionPalabrota = 0;

        for (String linea : chat) {
            palabrotaDEtectada = false;
            palabraPorCaractar = "";
            lineVersionCensurada = "";
            lineaOriginal = "";
            for (int i = 0; i < linea.length(); i++) {
                char caracter = linea.charAt(i);
                palabraPorCaractar += caracter;
                lineaOriginal += caracter;
                if (caracter == ' ' || caracter == ',' || caracter == '.') {
                    palabraPorCaractar = "";

                }

                for (String palabrotas : palabrasCensuradas) {
                    if (palabrotas.equals(palabraPorCaractar)) {
                        palabrotaDEtectada = true;
                        posicionPalabrota = i;
                        // System.out.println(palabrotas + " detectado");
                        for (int j = 0; j < lineaOriginal.length() - (palabrotas.length()); j++) {
                            char char2 = linea.charAt(j);
                            lineVersionCensurada += char2;

                            // Imprimimos hasta que empieza la palabrota
                        }
                        // String palabrotaCensurada = "";

                        for (int j = 0; j < palabrotas.length(); j++) {

                            // modificamos la palavra
                            if (j == 0 || j == palabrotas.length() - 1) {
                                lineVersionCensurada += palabrotas.charAt(j);
                            } else {
                                lineVersionCensurada += '*';
                            }

                        }

                        // Agregamos la otra mita de la frase del chat
                        for (int j = posicionPalabrota + 1; j < linea.length(); j++) {

                            char char3 = linea.charAt(j);
                            lineVersionCensurada += char3;
                        }

                    }
                }

            }
            if (palabrotaDEtectada) {
                System.out.println(lineVersionCensurada);
                System.out.println();
                textoCensurado.add(lineVersionCensurada);
            } else {
                System.out.println(linea);
                System.out.println();
                textoCensurado.add(linea);

            }

        }

        System.out.println("Leyendo la version censurada despues de procesarla ");

        System.out.println("Introduce nueva ruta y introduce nuevo archivo donde  colocar el archivo censurado ");
        ruta = sc.nextLine();

        gestionToxicidad.escribirFichero(ruta, textoCensurado);

        // Creando jugadores
        HashMap<Jugador, Integer> jugadoresMapa = new HashMap<>();
        int nPuntos = 0;
        for (String linea : chat) {
            nPuntos = 0;

            String[] partes = linea.split("[ ,.]+");
            for (int i = 0; i < partes.length; i++) {

                for (String palabrota : palabrasCensuradas) {
                    // Palabrotas puntuaje
                    if (partes[i].equals(palabrota)) {

                        nPuntos++;
                        System.out.println(nPuntos);

                    }

                }

                Jugador a = new Jugador(partes[1]);
                a.setPuntos_baneo(nPuntos);

                if (jugadoresMapa.containsKey(a)) {
                    jugadoresMapa.put(a, jugadoresMapa.get(a) + nPuntos);
                } else {
                    jugadoresMapa.put(a, nPuntos);
                }

                nPuntos = 0;

            }

        }
        System.out.println("Estos son los jugadores y sus puntos de baneo ");
        System.out.println(jugadoresMapa);

        System.out.println("Expulsando");

        Iterator<Map.Entry<Jugador, Integer>> iterator = jugadoresMapa.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Jugador, Integer> entry = iterator.next();

            if (entry.getValue() >= 5) {
                System.out.println(
                        "El jugador " + entry.getKey().getNombreJugador() + " ha alcanzado el limite de baneo soez ");

                iterator.remove();

            }
        }

        System.out.println("Actualizado");
        for (Map.Entry<Jugador, Integer> entry : jugadoresMapa.entrySet()) {
            System.out.println(entry.getKey().getNombreJugador() + " -> " + entry.getValue());
        }

    }

}
