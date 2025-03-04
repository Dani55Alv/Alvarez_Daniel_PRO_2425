import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ActividadesLista {
    /*
     * Actividad 1. ArrayList – Lista de Estudiantes
     * Objetivo: Crear una lista de estudiantes y permitir la búsqueda por nombre.
     * Crea un ArrayList<String> para almacenar nombres de estudiantes. Permite al
     * usuario agregar nombres hasta que escriba "fin". Pregunta por un nombre y
     * verifica si está en la lista. Muestra la lista completa de estudiantes.
     */
    public void ejercicio1() {
        Scanner sc = new Scanner(System.in);
        boolean fin = true;
        ArrayList<String> listaNombres = new ArrayList<String>();

        do {

            System.out.println("Introduce nombre");
            System.out.println("Si quieres parar, entonces escribe fin");

            String usuario = sc.nextLine();
            if (usuario.equals("fin")) {
                fin = false;
            } else {
                listaNombres.add(usuario);

            }

        } while (fin);
        boolean encontrado = true;

        String busqueda;

        if (listaNombres.isEmpty() == true) {
            System.out.println("Esta vacio no hay nada que mostrar");
        } else {
            System.out.println("Busqueda por nombre");

            busqueda = sc.nextLine();

            for (String nombre : listaNombres) {

                if (nombre.equals(busqueda)) {
                    encontrado = true;
                } else {
                    encontrado = false;

                }

            }

            if (encontrado) {
                System.out.println("Nombre encontrado");
                System.out.println("Lista");

                for (String nombre : listaNombres) {
                    System.out.print(nombre + " ");
                }
            } else {

                System.out.println("Nombre" + busqueda + ", no encontrado");
                System.out.println("Lista");
                for (String nombre : listaNombres) {
                    System.out.print(nombre + " ");
                }
            }
        }

    }

    /*
     * Actividad 2. LinkedList – Cola de Clientes
     * Objetivo: Simular la atención de una fila de clientes.
     * Crea una LinkedList<String> para almacenar clientes. Permite al usuario
     * agregar
     * clientes a la cola. Atiende a los clientes en orden. Muestra la cola en cada
     * paso.
     */
    public void ejercicio2() {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> listaEnlazada = new LinkedList<String>();
        boolean salida = true;
        do {
            System.out.println("Agregar cliente, introduce nombre");
            String cliente = sc.nextLine();
            listaEnlazada.addLast(cliente);
            for (String nombreCliente : listaEnlazada) {
                System.out.print(nombreCliente + " ");

            }
            System.out.println("Atendiendo actualmente al cliente:" + listaEnlazada.getFirst());
            System.out.println("El ultimos es  actualmente al cliente:" + listaEnlazada.getLast());

            System.out.println();

            System.out.println("Quieres salir?/ si/no");
            String usuario = sc.nextLine().toLowerCase();

            if (usuario.equals("si")) {
                System.out.println("Saliedno");
                salida = false;

            } else {
                System.out.println("Continuando");
            }
        } while (salida);

    }

    /*
     * Actividad 3. HashSet – Palabras Únicas Objetivo: Contar cuántas palabras
     * únicas hay en un texto.
     * Pide al usuario que ingrese un texto. Guarda las palabras en un
     * HashSet<String>. Muestra la cantidad de palabras únicas.
     */
    public void ejercicio3() {
        Scanner sc = new Scanner(System.in);
        boolean noHayEspacio = true;

        System.out.println("Introduce un texto para ver cuanta palabras unicas tiene.");

        String texto = sc.nextLine().toLowerCase();

        String palabra = "";
        Set<String> conjunto = new HashSet<String>();

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == ' ') {
                conjunto.add(palabra);
                palabra = "";
                noHayEspacio = false;
            }

            else {
                palabra += texto.charAt(i);

            }

        }

        if (noHayEspacio) {
            conjunto.add(palabra);
        }
        System.out.println("El numero de palabras unicas son de " + conjunto.size());
    }

    public void ejercicio4() {
        Set<String> conjuntoOrdenado = new LinkedHashSet<String>();
        Scanner sc = new Scanner(System.in);
        boolean salida = true;
        do {
            System.out.println("Agregar cliente, introduce nombre");
            String cliente = sc.nextLine();
            conjuntoOrdenado.add(cliente);
            for (String nombreCliente : conjuntoOrdenado) {
                System.out.print(nombreCliente + " ");

            }
            // System.out.println("Atendiendo actualmente al cliente:" + conjuntoOrdenado.);
            // System.out.println("El ultimos es actualmente al cliente:" +
            // conjuntoOrdenado.);

            System.out.println();

            System.out.println("Quieres salir?/ si/no");
            String usuario = sc.nextLine().toLowerCase();

            if (usuario.equals("si")) {
                System.out.println("Saliendo");
                salida = false;

            } else {
                System.out.println("Continuando");
            }
        } while (salida);
    }

    public void ejercicio5() {
        Scanner sc = new Scanner(System.in);
        Set<String> conjuntoArbol = new TreeSet<>();
        System.out.println("Vamos a hacer un diccionarion ordenado alfabeticamente");
        boolean salida = true;
        String palabra = "";
        do {

            palabra = sc.nextLine();
            conjuntoArbol.add(palabra);

            System.out.println("Quieres salir?/ si/no");
            String usuario = sc.nextLine().toLowerCase();

            if (usuario.equals("si")) {
                System.out.println("Saliendo");
                salida = false;

            } else {
                System.out.println("Continuando");
            }
        } while (salida);
        System.out.println("Ordenado alfabeticamente");
        for (String palabras : conjuntoArbol) {
            System.out.print(palabras + " ");
        }
    }

    public void ejercicio6() {
        Scanner sc = new Scanner(System.in);

        HashMap<String, String> mapa = new HashMap<>();
        boolean salida = true;
        String nombre;
        String nTelfono;
        do {

            System.out.println("Introduce nombre");
            nombre = sc.nextLine();

            System.out.println("Introduce numero de telefono");
            nTelfono = sc.nextLine();

            mapa.put(nombre, nTelfono);

            System.out.println("Quieres salir?/ si/no");
            String usuario = sc.nextLine().toLowerCase();

            if (usuario.equals("si")) {
                System.out.println("Saliendo");
                salida = false;

            } else {
                System.out.println("Continuando");
            }
        } while (salida);

        System.out.println(mapa);

        boolean noEncontrado = true;
        System.out.println("Busqueda introduce nombre ");
        String busquedaNombre = sc.nextLine();
        for (String nombres : mapa.keySet()) {

            if (busquedaNombre.equals(nombres)) {
                noEncontrado = false;
            }
        }
        if (noEncontrado) {
            System.out.println("No se ha encontrado el nombre: " + busquedaNombre);
            System.out.println("Mostrando mapa");
            System.out.println(mapa);

        } else {
            System.out.println("Se ha encontrado el nombre: " + busquedaNombre);
            System.out.println("Su valor respecto a su clave es " + mapa.get(busquedaNombre));
            System.out.println("Mostrando mapa");
            System.out.println(mapa);

        }

    }

    /*
     * Actividad 7. LinkedHashMap – Historial de Compras
     * Objetivo: Guardar productos comprados en orden de compra.
     * Usa LinkedHashMap<String, Double> (producto → precio). Permite agregar
     * productos y su precio. Muestra los productos en orden de compra.
     */
    public void ejercicio7() {
        Scanner sc = new Scanner(System.in);

        LinkedHashMap<String, Double> mapaProductos = new LinkedHashMap<>();
        boolean salida = true;
        String nombreProducto;
        double precio;
        do {

            System.out.println("Introduce nombre producto");
            nombreProducto = sc.nextLine();

            System.out.println("Introduce precio");
            precio = sc.nextDouble();

            mapaProductos.put(nombreProducto, precio);

            System.out.println("Quieres salir? si/no");
            sc.nextLine();

            String usuario = sc.nextLine().toLowerCase();

            if (usuario.equals("si")) {
                System.out.println("Saliendo");
                salida = false;

            } else {
                System.out.println("Continuando");
            }
        } while (salida);
        System.out.println("Mostrando los productos en orden de compra");
        System.out.println(mapaProductos);

    }

    /*
     * Actividad 8. TreeMap – Ranking de Jugadores
     * Objetivo: Ordenar jugadores por puntaje en un ranking.
     * Usa TreeMap<Integer, String> (puntos → nombre). Permite registrar jugadores y
     * sus puntajes. Muestra el ranking ordenado de mayor a menor.
     */
    public void ejercicio8() {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer, String> mapaJugadores = new TreeMap<>(Comparator.reverseOrder());

        boolean salida = true;
        String juadores;
        int puntuaje;

        do {

            System.out.println("Introduce puntaje");
            puntuaje = sc.nextInt();

            System.out.println("Introduce jugador (El nombre)");
            sc.nextLine();

            juadores = sc.nextLine();

            mapaJugadores.put(puntuaje, juadores);

            System.out.println("Quieres salir? si/no");

            String usuario = sc.nextLine().toLowerCase();

            if (usuario.equals("si")) {
                System.out.println("Saliendo");
                salida = false;

            } else {
                System.out.println("Continuando");
            }
        } while (salida);
        System.out.println("Mostrando los jugadores en orden de puntuje de mayor a menor es decir decendente");
        System.out.println(mapaJugadores);
    }

    public static void main(String[] args) throws Exception {

        ActividadesLista actividadesLista1 = new ActividadesLista();

        // actividadesLista1.ejercicio1();

        // actividadesLista1.ejercicio2();

        // actividadesLista1.ejercicio3();
        // el perro mordio al otro pero el perro fue listo no mordio al otro
        // 9 palabraws

        // actividadesLista1.ejercicio4();

        // actividadesLista1.ejercicio5();

        // actividadesLista1.ejercicio6();

        // actividadesLista1.ejercicio7();

        actividadesLista1.ejercicio8();

    }
}
