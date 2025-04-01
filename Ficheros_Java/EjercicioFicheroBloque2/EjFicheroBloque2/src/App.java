import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void ejercicio2() {

        System.out.println("Vamos a combinar un archivo");

        gestionFicherosBloque2 gestionFicherosBloque2 = new gestionFicherosBloque2("Gestion2");

        Scanner sc = new Scanner(System.in);

        String ruta = "";
        String nombreFichero = "";
        String a = "";
        String b = "";

        System.out.println("Introduce la ruta comun");
        ruta = sc.nextLine();
        System.out.println("Introduce el nombre del fichero combinado");
        nombreFichero = sc.nextLine();

        System.out.println("Introduce el nombre del fichero a combinar (A)");
        a = sc.nextLine();

        System.out.println("Introduce el nombre del fichero a combinar (B)");
        b = sc.nextLine();

        gestionFicherosBloque2.combinarArchivo(nombreFichero, a, b, ruta);

    }

    public static void ejercicio4() {
        gestionFicherosBloque2 gestionFicherosBloque2 = new gestionFicherosBloque2("Gestion2");

        System.out.println("Salida");
        String ruta = "";
        String archivo = "";

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce ruta");
        ruta = sc.nextLine();
        System.out.println("Introduce fichero");
        archivo = sc.nextLine();
        List<String> lista = new ArrayList<>();
        List<String> lista2 = new ArrayList<>();
        System.out.println("Leyendo el fichero");

        lista = gestionFicherosBloque2.leerFichero1(ruta, archivo);
        // transformar lista en array?
        String linea = "";
        String[] array = new String[20];
        System.out.println("Salida:");
        for (String string : lista) {
            // System.out.println(string);

            // Cada linea lo metes en un string (ya lo has hecho)
            // splitt estructura estatica cada string
            // Array[0]= "nombre" (pares)
            // Array[1]= "nota" (impares)

            array = string.split(" ");

            for (int i = 0; i < array.length; i++) {

                if (i % 2 == 0) {

                    array[i] = "Nombre: " + array[i];

                } else {
                    array[i] = "Nota: " + array[i] + "\f";
                }
            }
            for (int i = 0; i < array.length; i++) {
                System.out.print(" " + array[i] + " ");

            }

        }

    }

    public static void ejercicio1(){

               gestionFicherosBloque2 gestionFicherosBloque2 = new gestionFicherosBloque2("Gestion2");

        String ruta = "";
        String archivo = "";

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce ruta");
        ruta = sc.nextLine();
        System.out.println("Introduce fichero");
        archivo = sc.nextLine();
     

        try {
            gestionFicherosBloque2.deleteFichero(ruta, archivo);
            
        } catch (Exception e) {
System.out.println("Archivo "+ archivo +" seleccionado no encontrado");

        }
    }
    public static void ejercicio3(){
        gestionFicherosBloque2 gestionFicherosBloque2 = new gestionFicherosBloque2("Gestion2");

        String ruta = "";
        String archivo = "";

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce ruta");
        ruta = sc.nextLine();
        System.out.println("Introduce fichero");
        archivo = sc.nextLine();

        try {
            gestionFicherosBloque2.verPropiedadesFichero(ruta, archivo);

        } catch (Exception e) {
            System.out.print("Error" );
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {

        /*
         * Escribe un programa que guarde en un fichero el contenido de otros dos
         * ficheros,
         * de tal forma que en el fichero resultante aparezcan las líneas de los dos
         * primeros
         * ficheros mezcladas, es decir, la primera línea será del primer fichero, la
         * segunda
         * será del segundo fichero…
         * Hay que tener en cuenta que los ficheros de los que se cogen las líneas
         * pueden
         * tener tamaños diferentes.
         */
        
         //ejercicio1();
        // ejercicio2();
        // ejercicio3();

         ejercicio4();

    }
}
