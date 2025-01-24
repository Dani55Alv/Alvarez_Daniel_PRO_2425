

/**
 * 
 * 
 * @autor Daniel Alvarez Morales
 * @version 1.0
 * @Class probandoPoo La clase principal
 * 
 * 
 */
public class probandoPoo {
    public static void main(String[] args) {
        PuebloDelOeste Armadillo = new PuebloDelOeste();

        Humanos dani = new Humanos();
        // Para meter parametros a la estancia específica (dani en este caso).
        dani.sexo = "H";
        dani.nombre = "Daniel";

        // Para acciones con return para la estancia específica (dani en este caso).
        String nombreHumano = dani.comoTeLlamas();

        // ImprimimosS
        System.out.println(nombreHumano);

        Villanos villano = new Villanos();
        villano.colorBigote = "Rojo";
        villano.colorSombrero = "verde";

        // Para acciones sin return (es decir metodos) para la estancia específica (dani
        // en este caso).
        villano.tomarWhiskey();
        System.out.println("Que tan ebrio estas?");

        System.out.println(villano.ebriedad);

        villano.secuestrarDamisela(dani);

        Humanos mary = new Humanos();
        mary.getPiernas();
        System.out.println("Mary tiene de piernas " + mary.getPiernas());
        mary.setPiernas(1);
        System.out.println("Mary tiene de piernas " + mary.getPiernas());

        System.out.println("Numero de habitantes de Armadillo " + Armadillo.getNumeroHumanos());
        Armadillo.empadronar(mary);
        System.out.println("Numero de habitantes de Armadillo " + Armadillo.getNumeroHumanos());




        Armadillo.convertirVillanos(mary);

        System.out.println("Numero de villanos de Armadillo");
          Armadillo.getVillanos();
          System.out.println("Numero de villanos "+           Armadillo.getVillanos() );
    }
}

// Humanos dani = new Humanos("DANIEL");
/*
 * public persona(string nombre){
 * this.nombre=nombre;
 * //TAmbien puedes meter --> this.edad =edad;
 * }
 */

 //TAmbien // Humanos dani = new Humanos("DANIEL", 21);

