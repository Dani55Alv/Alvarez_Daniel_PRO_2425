import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        Gestion_deportistas_club club = new Gestion_deportistas_club();

        do {
            System.out.println("Menú club deportistas");
            System.out.println("1. Dar de alta ");
            System.out.println("2. Dar de baja ");
            System.out.println("3. Actualizar datos (dni, no se puede)");
            System.out.println("4. Listar por orden alfabetico de nombre");
            System.out.println("5. Listar por orden de edad");
            System.out.println("6. guardar");
            System.out.println("7. recuperar");

            System.out.println("8. Salir");

            System.out.print("Seleccione una opción: ");

            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    boolean valido = true;
                    System.out.println("Dando de alta");
                    System.out.println("Introduce dni");
                    String pasandoDni = sc.nextLine();

                    System.out.println("Introduce nombre");
                    String pasandoNombre = sc.nextLine();
                    System.out.println("Introduce fecha de nacimiento");
                    String pasandFecaNac = sc.nextLine();

                    Deportes seleccionDeporte = null;

                    do {
                        System.out.println("Introduce deporte por numero");
                        System.out.println("1.-natacion, 2.-remo, 3.-vela, 4.-waterpolo");
                        int pasandoDeporte = sc.nextInt();
                        sc.nextLine();
                        switch (pasandoDeporte) {
                            case 1:
                                System.out.println("Has elegido natacion");
                                seleccionDeporte = Deportes.Natacion;
                                valido = true;
                                break;
                            case 2:
                                System.out.println("Has elegido remo");
                                seleccionDeporte = Deportes.Remo;
                                valido = true;

                                break;
                            case 3:
                                System.out.println("Has elegido vela");
                                seleccionDeporte = Deportes.Vela;
                                valido = true;

                                break;
                            case 4:
                                System.out.println("Has elegido waterpolo");
                                seleccionDeporte = Deportes.Waterpolo;
                                valido = true;

                                break;
                            default:
                                System.out.println("no valido otra vez");
                                valido = false;
                                break;

                        }
                    } while (!valido);

                    club.darAlta(pasandoDni, pasandoNombre, pasandFecaNac, seleccionDeporte);

                    break;
                case 2:
                    System.out.println("Dando de baja");
                    System.out.println("Dando de baja por dni (Introduce dni)");
                    String buquedaDni = sc.nextLine();

                    club.darBaja(buquedaDni);

                    break;

                case 3:
                    System.out.println("Actualizando datos (Menos dni que es inmutable)");
                    System.out.println("Introduce el dni del usuario a actualizar");
                    buquedaDni = sc.nextLine();
                    System.out.println("Introduce el cambio de nombre");
                    String actualizacionNombre = sc.nextLine();
                    System.out.println("Introduce el cambio de fecha");
                    String actualizacionfechaNac = sc.nextLine();

                    seleccionDeporte = null;

                    do {
                        System.out.println("Introduce el cambio de deporte a practicar");
                        System.out.println("1.-natacion, 2.-remo, 3.-vela, 4.-waterpolo");
                        int actualizacionDeporte = sc.nextInt();
                        sc.nextLine();
                        switch (1) {
                            case 1:
                                System.out.println("Has elegido natacion");
                                seleccionDeporte = Deportes.Natacion;
                                valido = true;
                                break;
                            case 2:
                                System.out.println("Has elegido remo");
                                seleccionDeporte = Deportes.Remo;
                                valido = true;

                                break;
                            case 3:
                                System.out.println("Has elegido vela");
                                seleccionDeporte = Deportes.Vela;
                                valido = true;

                                break;
                            case 4:
                                System.out.println("Has elegido waterpolo");
                                seleccionDeporte = Deportes.Waterpolo;
                                valido = true;

                                break;
                            default:
                                System.out.println("no valido otra vez");
                                valido = false;
                                break;

                        }
                    } while (!valido);

                    club.actualizar(buquedaDni, actualizacionNombre, actualizacionfechaNac, seleccionDeporte);

                    break;

                case 4:
                    System.out.println("Mostrando deportistas por orden alfabetico del nombre");
                    club.ordenarNombreAlfabeticamente();

                    break;

                case 5:
                    System.out.println("Mostrando deportistas por orden edad");
                    club.ordenarEdad();

                    break;
                    case 6:
                    System.out.println("Guardando datos fichero binario");
                     club.grabarListaDeportistas();
                    break;

                    case 7:
                    System.out.println("Recuperado datos fichero binario");
                    club.recuperarListaDeportistas();
                    break;
                case 8:
                    System.out.println("Saliendo del programa...");
                    salir = true;
                    break;
                default:
                    System.out.println(" Opción no válida. Intenta de nuevo.");
            }
        } while (!salir);
    }
}
