import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;
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

    // clase palabra y hacer atributo string.

    // En estudiante hacer gestion de estudiante, y clase gestion estudiante.

    // Cliente hacer clase

    // La clase con un atributo string y string. Hay que sobrescribir equals y
    // hascode.

    // ejercicio 3 
    //Dos formas:String o clase palabra con un atributo string.
    // 1º forma: Hashset<String>
    // 2º forma: Hashset<Palabra> (Aqui Palabra representa una clase)
    // Con las segunda forma no borra porque solo mira las direcciones ya que son objetos no strings.
    // es decir que hay que sobresscribir el equals y el hascode.
    // Hascode sirve para que no meta duplicados en el hashSet
    // @override
    // to string reutrn palabra.
    // Al hacer add puedes hacer palabra.toLowerCase(); //ENTRA EN EXAMEN
 
    public void ejercicio3() {
        Scanner sc = new Scanner(System.in);
System.out.println("Introduce texto");
String texto = sc.nextLine();
Set<Palabra_Ej3> conjunto = new HashSet<Palabra_Ej3>(); 

String[] palabras = texto.split(" ");

for (String palabra : palabras) {
    conjunto.add(new Palabra_Ej3(palabra.toLowerCase())); //Asi se añade un nuevo objeto palabra independiente.
}

System.out.println("El numero de palabras unicas son de " + conjunto.size());

      /*
       * boolean noHayEspacio = true;
       * 
       * System.out.
       * println("Introduce un texto para ver cuanta palabras unicas tiene.");
       * 
       * String texto = sc.nextLine().toLowerCase();
       * 
       * String palabra = "";
       * Set<String> conjunto = new HashSet<String>();
       * 
       * for (int i = 0; i < texto.length(); i++) {
       * if (texto.charAt(i) == ' ') {
       * conjunto.add(palabra);
       * palabra = "";
       * noHayEspacio = false;
       * }
       * 
       * else {
       * palabra += texto.charAt(i);
       * 
       * }
       * 
       * }
       * 
       * if (noHayEspacio) {
       * conjunto.add(palabra);
       * }
       * System.out.println("El numero de palabras unicas son de " + conjunto.size());
       * }
       * 
       * public void ejercicio4() {
       * Set<String> conjuntoOrdenado = new LinkedHashSet<String>();
       * Scanner sc = new Scanner(System.in);
       * boolean salida = true;
       * do {
       * System.out.println("Agregar cliente, introduce nombre");
       * String cliente = sc.nextLine();
       * conjuntoOrdenado.add(cliente);
       * for (String nombreCliente : conjuntoOrdenado) {
       * System.out.print(nombreCliente + " ");
       * 
       * }
       * // System.out.println("Atendiendo actualmente al cliente:" +
       * conjuntoOrdenado.);
       * // System.out.println("El ultimos es actualmente al cliente:" +
       * // conjuntoOrdenado.);
       * 
       * System.out.println();
       * 
       * System.out.println("Quieres salir?/ si/no");
       * String usuario = sc.nextLine().toLowerCase();
       * 
       * if (usuario.equals("si")) {
       * System.out.println("Saliendo");
       * salida = false;
       * 
       * } else {
       * System.out.println("Continuando");
       * }
       * } while (salida);
       * }
       * 
       * public void ejercicio5() {
       * Scanner sc = new Scanner(System.in);
       * Set<String> conjuntoArbol = new TreeSet<>();
       * System.out.println("Vamos a hacer un diccionarion ordenado alfabeticamente");
       * boolean salida = true;
       * String palabra = "";
       * do {
       * 
       * palabra = sc.nextLine();
       * conjuntoArbol.add(palabra);
       * 
       * System.out.println("Quieres salir?/ si/no");
       * String usuario = sc.nextLine().toLowerCase();
       * 
       * if (usuario.equals("si")) {
       * System.out.println("Saliendo");
       * salida = false;
       * 
       * } else {
       * System.out.println("Continuando");
       * }
       * } while (salida);
       * System.out.println("Ordenado alfabeticamente");
       * for (String palabras : conjuntoArbol) {
       * System.out.print(palabras + " ");
       * }
       * }
       * 
       * public void ejercicio6() {
       * Scanner sc = new Scanner(System.in);
       * 
       * HashMap<String, String> mapa = new HashMap<>();
       * boolean salida = true;
       * String nombre;
       * String nTelfono;
       * do {
       * 
       * System.out.println("Introduce nombre");
       * nombre = sc.nextLine();
       * 
       * System.out.println("Introduce numero de telefono");
       * nTelfono = sc.nextLine();
       * 
       * mapa.put(nombre, nTelfono);
       * 
       * System.out.println("Quieres salir?/ si/no");
       * String usuario = sc.nextLine().toLowerCase();
       * 
       * if (usuario.equals("si")) {
       * System.out.println("Saliendo");
       * salida = false;
       * 
       * } else {
       * System.out.println("Continuando");
       * }
       * } while (salida);
       * 
       * System.out.println(mapa);
       * 
       * boolean noEncontrado = true;
       * System.out.println("Busqueda introduce nombre ");
       * String busquedaNombre = sc.nextLine();
       * for (String nombres : mapa.keySet()) {
       * 
       * if (busquedaNombre.equals(nombres)) {
       * noEncontrado = false;
       * }
       * }
       * if (noEncontrado) {
       * System.out.println("No se ha encontrado el nombre: " + busquedaNombre);
       * System.out.println("Mostrando mapa");
       * System.out.println(mapa);
       * 
       * } else {
       * System.out.println("Se ha encontrado el nombre: " + busquedaNombre);
       * System.out.println("Su valor respecto a su clave es " +
       * mapa.get(busquedaNombre));
       * System.out.println("Mostrando mapa");
       * System.out.println(mapa);
       * 
       * }
       */
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

    /*
     * Actividad 1.
     * Añade 10 números a una lista y muéstrala. Luego elimina los números pares y
     * muéstrala nuevamente.
     */
    public void ejercicio1Pdf2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lista");
        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();

        System.out.println("Introduce 10 numeros");

        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            listaNumeros.add(n);

        }
        System.out.println("Todos");
        for (Integer numero : listaNumeros) {

            System.out.print(numero + " ");

        }
        System.out.println();
        System.out.println("Impares");
        for (Integer numero : listaNumeros) {
            if (numero % 2 == 1) {
                System.out.print(numero + " ");
            }
        }

    }

    public void ejercicio2Pdf2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lista linkedlist");
        LinkedList<Integer> listaNumeros = new LinkedList<Integer>();

        System.out.println("Introduce 10 numeros");

        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            listaNumeros.add(n);
        }

        System.out.println("Mostrando lista");
        for (Integer numeros : listaNumeros) {
            System.out.println(numeros + " ");
        }

        // For each y fori da problemas aqui al borrar.
        while (listaNumeros.size() > 1) {

            int suma = listaNumeros.getLast() + listaNumeros.getFirst();
            listaNumeros.removeLast();

            // listaNumeros.set(0, suma); // reemplaza el primer elemento con la suma

            // o
            listaNumeros.removeFirst();
            listaNumeros.addFirst(suma);

        }

        System.out.println("Mostrando lista sumada");
        for (Integer numeros : listaNumeros) {
            System.out.print(numeros + " ");
        }

        /*
         * for (int i = 0; i < 10; i++) {
         * int n = sc.nextInt();
         * listaNumeros.add(n);
         * 
         * if (listaNumeros.size()==2) {
         * System.out.println("Adasd");
         * int suma =listaNumeros.getFirst() + listaNumeros.getLast();
         * listaNumeros.removeLast();
         * listaNumeros.removeFirst();
         * //O listaNumeros.set(0, suma); // reemplaza el primer elemento con la suma
         * 
         * listaNumeros.addFirst(suma);
         * for (Integer numeros : listaNumeros) {
         * System.out.print(numeros + " ");
         * 
         * }
         * }
         * }
         * 
         * System.out.println("El resultado de la suma de los elementos es:");
         * 
         * for (Integer numeros : listaNumeros) {
         * System.out.println(numeros);
         * 
         * }
         */

    }

    public void ejercicio3Pdf2() {
        Scanner sc = new Scanner(System.in);

        Set<Integer> conjuntoNumeros = new HashSet<Integer>();

        while (conjuntoNumeros.size() < 10) { // asegura pase lo que pase sin condicionales que se agregen 10 números.
            int random = (int) (Math.random() * (100 + 1));
            conjuntoNumeros.add(random);
        }
        System.out.println("Numero aleatorio");

        for (Integer numero : conjuntoNumeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }

    public void ejercicio4Pdf2() {
        ArrayList<String> nombres = new ArrayList<>();
        // Se agregan los nombres como antes
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Carlos");
        nombres.add("Ana");
        nombres.add("Pedro");
        nombres.add("Laura");
        nombres.add("Luis");
        nombres.add("Sofía");
        nombres.add("Javier");
        nombres.add("Elena");
        nombres.add("Diego");
        nombres.add("Paula");
        nombres.add("Alejandro");
        nombres.add("Lucía");
        nombres.add("Miguel");
        nombres.add("Carmen");
        nombres.add("Pablo");
        nombres.add("Rosa");
        nombres.add("Roberto");
        nombres.add("Isabel");
        nombres.add("Daniel");
        nombres.add("Teresa");
        nombres.add("Jorge");
        nombres.add("Beatriz");
        nombres.add("Fernando");
        nombres.add("Raquel");
        nombres.add("José");
        nombres.add("Patricia");
        nombres.add("David");
        nombres.add("Eva");

        System.out.println(nombres.size());

        // Creamos el HashMap para los grupos
        HashMap<Integer, ArrayList<String>> grupos = new HashMap<>();

        // Inicializamos las variables de control
        int contadorGrupo1 = 0, contadorGrupo2 = 0, contadorGrupo3 = 0;
        int contadorGrupo4 = 0, contadorGrupo5 = 0, contadorGrupo6 = 0;

        for (int i = 0; i < nombres.size(); i++) {
            boolean grupoAsignado = false; // Bandera para verificar si se asignó a un grupo

            // Intentamos asignar a un grupo que no esté lleno
            while (!grupoAsignado) {
                int random = (int) (Math.random() * 6) + 1; // Genera un número aleatorio entre 1 y 6

                switch (random) {
                    case 1:
                        if (contadorGrupo1 < 5) {
                            if (!grupos.containsKey(1)) {
                                grupos.put(1, new ArrayList<>());
                            }
                            grupos.get(1).add(nombres.get(i));
                            contadorGrupo1++;
                            grupoAsignado = true;
                        }
                        break;
                    case 2:
                        if (contadorGrupo2 < 5) {
                            if (!grupos.containsKey(2)) {
                                grupos.put(2, new ArrayList<>());
                            }
                            grupos.get(2).add(nombres.get(i));
                            contadorGrupo2++;
                            grupoAsignado = true;
                        }
                        break;
                    case 3:
                        if (contadorGrupo3 < 5) {
                            if (!grupos.containsKey(3)) {
                                grupos.put(3, new ArrayList<>());
                            }
                            grupos.get(3).add(nombres.get(i));
                            contadorGrupo3++;
                            grupoAsignado = true;
                        }
                        break;
                    case 4:
                        if (contadorGrupo4 < 5) {
                            if (!grupos.containsKey(4)) {
                                grupos.put(4, new ArrayList<>());
                            }
                            grupos.get(4).add(nombres.get(i));
                            contadorGrupo4++;
                            grupoAsignado = true;
                        }
                        break;
                    case 5:
                        if (contadorGrupo5 < 5) {
                            if (!grupos.containsKey(5)) {
                                grupos.put(5, new ArrayList<>());
                            }
                            grupos.get(5).add(nombres.get(i));
                            contadorGrupo5++;
                            grupoAsignado = true;
                        }
                        break;
                    case 6:
                        if (contadorGrupo6 < 5) {
                            if (!grupos.containsKey(6)) {
                                grupos.put(6, new ArrayList<>());
                            }
                            grupos.get(6).add(nombres.get(i));
                            contadorGrupo6++;
                            grupoAsignado = true;
                        }
                        break;
                }
            }
        }

        System.out.println(grupos);
    }

    /*
     * Actividad 5.
     * Crea un mapa que guarde información sobre unas elecciones, utilizando como
     * clave
     * el nombre del partido candidato y como valor el número de votos obtenido. Con
     * esa
     * información, implementa las siguientes funcionalidades:
     * • Buscar el número de votos de un partido introducido por teclado.
     * • Mostrar todos los partidos, usando el set de claves.
     * • Mostrar todos los partidos junto con su número de votos.
     * • Mostrar el ganador de las elecciones.
     */

    public void ejercicio5Pdf2() {
        Scanner sc = new Scanner(System.in);
        TreeMap<String, Integer> mapaVotos = new TreeMap<>(Comparator.reverseOrder());
        mapaVotos.put("vox", 500);
        mapaVotos.put("pp", 200);
        mapaVotos.put("psoe", 250);
        mapaVotos.put("podemos", 50);
        mapaVotos.put("pnv", 600);

        System.out.println("Buscando votos");
        System.out.print("Introduce el nombre del partido para buscar los votos: ");
        String partidoBuscado = sc.nextLine();
        if (mapaVotos.containsKey(partidoBuscado)) {
            System.out
                    .println("El partido " + partidoBuscado + " ha obtenido " + mapaVotos.get(partidoBuscado)
                            + " votos.");
        } else {
            System.out.println("No se encontró el partido.");
        }

        System.out.println("Mostrando todos los partidos");
        for (String partido : mapaVotos.keySet()) {
            System.out.print(partido + " ");
        }

        System.out.println("Mostrando todos los partidos y sus respectivos numeros de votos: ");

        for (Map.Entry<String, Integer> entry : mapaVotos.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " votos");
        }

        // o
        System.out.println(mapaVotos);

        System.out.println("El ganador de las elecciones");

        Collection<Integer> todosVotos = mapaVotos.values();
        int ganador = 0;
        for (Integer votosPartido : todosVotos) {

            if (ganador < votosPartido) {
                ganador = votosPartido;
            }

        }
        System.out.println(ganador);

        for (String partido : mapaVotos.keySet()) {
            if (mapaVotos.get(partido) == ganador) {
                System.out.println("El partido " + partido + " tiene el número de votos del ganador: " + ganador);
            }
        }

    }

    /*
     * Actividad 6.
     * Crea un programa que lea por teclado palabras hasta obtener la palabra fin.
     * Si alguna
     * de las palabras está repetida, deberá indicarlo. El programa no tendrá en
     * cuenta
     * mayúsculas y minúsculas.
     */

    public void ejercicio6Pdf2() {
        Scanner sc = new Scanner(System.in);
        boolean salida = true;

        Set<String> conjunto = new HashSet<String>();

        do {

            String palabra = sc.nextLine().toLowerCase();
            if (conjunto.add(palabra) == false) { // Si esta repetido o duplicado devuelve false
                System.out.println("Esta repetido la palabra " + palabra);
            } else {
                conjunto.add(palabra);
            }

            if (palabra.equals("fin")) {
                salida = false;
            }
        } while (salida == true);
    }

    /*
     * Actividad 7.
     * Vas a jugar una partida al Bingo. Necesitarás una estructura para el bombo y
     * otra
     * para los cartones, selecciona la que mejor se ajuste al problema. Ahora saca
     * bolas
     * hasta que la partida finalice. No vamos a contar líneas. Solo cuenta que se
     * tenga
     * bingo.
     * Las bolas se extraen aleatoriamente y se debe comprobar si el número aparece
     * en
     * los cartones. El programa acaba cuando alguno de los cartones saque bingo, o
     * cuando el bombo se quede sin bolas.
     */
    public void ejercicio7Pdf2() {
        // Linked haset bombo (32 numeros)

        // Los cartones son linkedlist (6 numeros)

        // cuatro jugadores cuatro cartones

        // La partida termina cuando el bombo se queda sin bolas o un carton haga bingo.

        Set<Integer> bombo = new LinkedHashSet<Integer>();

        do {
            int random = (int) (Math.random() * (75 + 1));
            bombo.add(random);
        } while (bombo.size() < 32);

        for (Integer numeroBombo : bombo) {
            System.out.println(numeroBombo);
        }

        // Creacion cartones
        LinkedList<Integer> carton1 = new LinkedList<Integer>();
        LinkedList<Integer> carton2 = new LinkedList<Integer>();
        LinkedList<Integer> carton3 = new LinkedList<Integer>();
        LinkedList<Integer> carton4 = new LinkedList<Integer>();

        System.out.println("Carton1");
        do {
            int random = (int) (Math.random() * (25 + 1));
            carton1.add(random);
        } while (carton1.size() < 25);

        for (Integer numero : carton1) {
            System.out.print(numero + " ");
        }
        System.out.println();

        System.out.println("Carton2");
        do {
            int random = (int) (Math.random() * (25 + 1));
            carton2.add(random);
        } while (carton2.size() < 25);

        for (Integer numero : carton2) {
            System.out.print(numero + " ");
        }

        System.out.println();

        System.out.println("Carton3");
        do {
            int random = (int) (Math.random() * (25 + 1));
            carton3.add(random);
        } while (carton3.size() < 25);

        for (Integer numero : carton3) {
            System.out.print(numero + " ");
        }

        System.out.println();
        System.out.println("Carton4");
        do {
            int random = (int) (Math.random() * (25 + 1));
            carton4.add(random);
        } while (carton4.size() < 25);

        for (Integer numero : carton4) {
            System.out.print(numero + " ");
        }

        boolean finPartida = false;
        System.out.println();
        System.out.println("Ahora empezamos con la partida");
        int bomboNbolas = 75;
        do {
            // Chequeos

            if (bomboNbolas == 0) {
                System.out.println("El bomobo se ha acabado");
                System.out.println("Fin de la partida");
                finPartida = true;

            }

            if (carton1.isEmpty()) {
                System.out.println("Jugador 1 ha ganado");
                System.out.println("Fin de la partida");
                finPartida = true;

            }

            if (carton2.isEmpty()) {
                System.out.println("Jugador 2 ha ganado");
                System.out.println("Fin de la partida");
                finPartida = true;

            }
            if (carton3.isEmpty()) {
                System.out.println("Jugador 3 ha ganado");
                System.out.println("Fin de la partida");
                finPartida = true;

            }
            if (carton4.isEmpty()) {
                System.out.println("Jugador 4 ha ganado");
                System.out.println("Fin de la partida");
                finPartida = true;
            }

            // Logica de la partida
            bomboNbolas--;
            // Para borrar hay que usar iterator.
            for (Integer nBola : bombo) {
                Iterator<Integer> iterador1 = carton1.iterator();
                while (iterador1.hasNext()) {
                    if (iterador1.next().equals(nBola)) {
                        iterador1.remove();
                    }
                }
            }

            for (Integer nBola : bombo) {
                Iterator<Integer> iterador2 = carton2.iterator();
                while (iterador2.hasNext()) {
                    if (iterador2.next().equals(nBola)) {
                        iterador2.remove();
                    }
                }
            }
            for (Integer nBola : bombo) {

                Iterator<Integer> iterador3 = carton3.iterator();
                while (iterador3.hasNext()) {
                    if (iterador3.next().equals(nBola)) {
                        iterador3.remove();
                    }
                }
            }

            for (Integer nBola : bombo) {
                Iterator<Integer> iterador4 = carton4.iterator();
                while (iterador4.hasNext()) {
                    if (iterador4.next().equals(nBola)) {
                        iterador4.remove();
                    }
                }
            }

        } while (!finPartida);

    }

    /*
     * Actividad 8.
     * Crea un programa en Java que cuente la cantidad de veces que aparece cada
     * palabra
     * en una oración dada.
     * Instrucciones:
     * 1. Pide al usuario que ingrese una oración.
     * 2. Divide la oración en palabras (separando por espacios y signos de
     * puntuación).
     * 3. Selecciona una estructura de datos para almacenar el conteo de palabras.
     * 4. Muestra los resultados en la consola.
     */
    public void ejercicio8Pdf2() {
        ArrayList<String> listaPalbras = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean noHayEspacio = true;

        System.out.println("Introduce un texto para ver cuanta palabras se repiten.");

        String texto = sc.nextLine().toLowerCase();
        int palabraCantidad = 1;
        String palabra = "";
        LinkedHashMap<String, Integer> mapaPalabrasRepetidas = new LinkedHashMap<>();

        Set<String> conjunto = new HashSet<String>();
        // String [] palaabras = frase.split('');

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == ' ' || texto.charAt(i) == '.') {

                if (conjunto.add(palabra) == false) {

                    mapaPalabrasRepetidas.put(palabra, palabraCantidad);
                    System.out.println(palabra);
                    if (mapaPalabrasRepetidas.containsKey(palabra)) {
                        int valorActual = mapaPalabrasRepetidas.get(palabra);
                        mapaPalabrasRepetidas.put(palabra, valorActual + 1); // Incrementa el conteo
                    } else {
                        mapaPalabrasRepetidas.put(palabra, 1); // Primera vez que aparece la palabra
                    }

                } else {

                    conjunto.add(palabra);
                    mapaPalabrasRepetidas.put(palabra, palabraCantidad);
                }

                palabra = "";
                noHayEspacio = false;
            } else {
                palabra += texto.charAt(i);

            }

        }

        if (noHayEspacio) {
            conjunto.add(palabra);
            mapaPalabrasRepetidas.put(palabra, palabraCantidad);
        }

        System.out.println("El numero de palabras repetidas");
        System.out.println(mapaPalabrasRepetidas);

        // Ejemplo para meter.
        // El aparato funciona mal. Pero es eso un aparato.
        // cangrejo cangrejo cangrejo. Un pedido
    }

    public static void main(String[] args) throws Exception {

        ActividadesLista actividadesLista1 = new ActividadesLista();
        ActividadesLista actividadesLista2 = new ActividadesLista();

        actividadesLista1.ejercicio1();

        // actividadesLista1.ejercicio2();

        // actividadesLista1.ejercicio3();
        // el perro mordio al otro pero el perro fue listo no mordio al otro
        // 9 palabraws

        // actividadesLista1.ejercicio4();

        // actividadesLista1.ejercicio5();

        // actividadesLista1.ejercicio6();

        // actividadesLista1.ejercicio7();

        // actividadesLista1.ejercicio8();

        // Segundo PDF

        // actividadesLista2.ejercicio1Pdf2();

        // actividadesLista2.ejercicio2Pdf2();

        // actividadesLista2.ejercicio3Pdf2();
        // actividadesLista2.ejercicio4Pdf2();

        // actividadesLista2.ejercicio5Pdf2();

        // actividadesLista2.ejercicio6Pdf2();

        // actividadesLista2.ejercicio7Pdf2();
       // actividadesLista2.ejercicio8Pdf2(); I
        // actividadesLista2.ejercicio9Pdf2();
        // actividadesLista2.ejercicio10Pdf2();

    }
}
