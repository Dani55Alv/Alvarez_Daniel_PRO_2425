public class App {
    public static void main(String[] args)  {

     Personaje Dani55 = new Guerrero("Dani55", 10, 100, 5, 50);

     Personaje g2 = new Guerrero("g2", 10, 100, 5, 50);


     Personaje Guillermo42 = new Arquero("Guillermo42", 15, 200, 32, 120);


     Personaje a2 = new Arquero("a2", 10, 100, 5, 50);

  /*
   * vehiculo v1 = new moto();
   * vehiculo v2 = new coche();
   */

System.out.println(Dani55);
System.out.println(Guillermo42);

Servidor servidor = new Servidor("Servido_Incial");

servidor.agregarPersona(Dani55);
servidor.agregarPersona(Guillermo42);

servidor.listar();
servidor.ordenarPersonajes();
System.out.println();
servidor.listar();


servidor.batalla(Guillermo42, Dani55);
    }
}

//*Hacer servidor pero antes interfaz y la clase no extiende sino, implement interfaz */

//intefaz servidor{
/*
 * void agregarPersona(Personaje p);
 * void listar();
 */
//class servidor implements Serivdor;
