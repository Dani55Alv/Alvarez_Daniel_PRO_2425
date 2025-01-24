import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class Banco {

    // private static int contadorCuentas=0;
    private String nombre;
    private ArrayList<CuentaCorriente> listaCuentaCorriente; // IMPORTANTE QUE SE NOS OLVIDÓ DC

    private Double ratioInteres;
    // ArrayList<CuentaCorriente> ListaCuentaCorriente = new
    // ArrayList<CuentaCorriente>(); X AQUI NO, es en el main

    private int numeroTrabajadores;
    // Cuando una accion o metodo es statico en el main no lo llamas por un bojeto
    // sino lo llamas por la clase donde este
    // es decir clase.accion(); o clase.accion("variable");

    public Banco(String nombre, Double ratioInteres, ArrayList<CuentaCorriente> listaCuentaCorriente,
            int numeroTrabajadores) {
        this.nombre = nombre;
        this.ratioInteres = ratioInteres;
        this.numeroTrabajadores = numeroTrabajadores;
        this.listaCuentaCorriente = listaCuentaCorriente; // IMPORTANTE QUE SE NOS OLVIDÓ DC

    }

    public void eliminarCuentaBanco(ArrayList<CuentaCorriente> bancolista, Banco banco) { // long iban
        System.out.println("Introduce un Iban para eliminar la cuenta: ");

        Scanner sc = new Scanner(System.in);
        long buscarIban = sc.nextLong();
        sc.close();
        boolean ibanEcontrado = false;
        Iterator<CuentaCorriente> iterador1 = bancolista.iterator();

        while (iterador1.hasNext()) { // Mientras haya más elementos
            // Creamos una variable de clase cuenta para almacenar y comparar.
            CuentaCorriente cuentas = iterador1.next(); // Devuele el objeto actual y avanza

            System.out.println(cuentas.getIban());
            if (cuentas.getIban() == buscarIban) {
                System.out.println("Iban encontrado");

                System.out.println(
                        "Procediendo a eliminar la cuenta " + cuentas.getTitular().getNombre() + " " + cuentas
                                .getTitular().getApellidos() + " del banco " + banco.getNombre());

                iterador1.remove(); // lCuentaCorriente(forEach paralbra segunda).remove(cc);
                ibanEcontrado = true;
            } else {
                System.out.println("iban no correspondido (sigue iterando)");
            }

        }
        if (ibanEcontrado == false) {
            System.out.println("El Iban no existe por lo tanto la cuenta tampoco");

        }

    }

    public String getNombre() {
        return nombre;
    }

    public Double getRatioInteres() {
        return ratioInteres;
    }

    public int getNumeroTrabajadores() {
        return numeroTrabajadores;
    }

    public ArrayList<CuentaCorriente> getListaCuentaCorriente() {
        return listaCuentaCorriente;
    }

    public void mostrarListaBanco(ArrayList<CuentaCorriente> bancolista, Banco banco) {
        System.out.println();
        System.out.println("Monstrando cuenta de banco: " + banco.getNombre());
        for (CuentaCorriente cuentas : bancolista) {
            System.out.println(cuentas.getTitular().toString() + "  " + cuentas.getIban() + "  " + cuentas.getSaldo());

        }
        System.out.println();
        System.out.println("Fin de lista");

    }

    // Se puede usar equals en vez de string y para modularizar mas hacer una el
    // chekeo en un metodo o funcion
    // Crear una nueva cuenta (a través del Cliente) en el banco.

    public void crearCuentaBanco(ArrayList<CuentaCorriente> bancolista, Banco banco, CuentaCorriente cuenta) {
        // A traves del dni del cliente creamos una cuenta bancaria a la lista
        // Cuenta correinte ccl = new Cuentaacorriente();
        System.out.println(cuenta.getTitular().getDni());
        boolean clienteEncontrado = false;
        for (CuentaCorriente cuentaCorriente : bancolista) {
            if (cuenta.getTitular().getDni() == cuentaCorriente.getTitular().getDni()) {
                clienteEncontrado = true;
            }
        }

        if (clienteEncontrado) {
            System.out.println(" Lo siento pero ya tiene en este banco: " + banco.getNombre() + " Una cuenta creada "
                    + "por parte del usuario " + cuenta
                            .getTitular().getNombre());
        } else {

            bancolista.add(cuenta);
            System.out.println("Cuenta creada al banco: " + banco.getNombre() + " con exito" + " por parte del usuario "
                    + cuenta.getTitular().getNombre());
        }
    }

    public void cambiarTitular(CuentaCorriente cuenta1, CuentaCorriente cuenta2) {

        System.out.println("La cuenta corriente de " + cuenta1.getTitular().getNombre() + " ahora será de " + cuenta2
                .getTitular().getNombre());

        System.out.println("La cuenta corriente de " + cuenta2.getTitular().getNombre() + " ahora será de "
                + cuenta1.getTitular().getNombre());

        Cliente a = cuenta1.getTitular();
        Cliente b = cuenta2.getTitular();

        cuenta2.setTitular(a);
        cuenta1.setTitular(b);

    }

    public void pagoInteres(ArrayList<CuentaCorriente> bancolista, Banco banco) {
        System.out.println("Pagando intereses en el banco " + banco.getNombre() + " con un ratio de interés de "
                + banco.getRatioInteres());

        for (CuentaCorriente cuentaCorriente : bancolista) {
            double interes = 0;
            double interesXsaldo = 0;
            interes = (cuentaCorriente.getSaldo() * banco.getRatioInteres()) / 1000;
            interesXsaldo = cuentaCorriente.getSaldo() + interes;
            cuentaCorriente.setSaldo(interesXsaldo);

            System.out.println("Cuenta de " + cuentaCorriente.getTitular().getNombre() +
                    " con IBAN " + cuentaCorriente.getIban() +
                    ": saldo actualizado a " + interesXsaldo);
        }

        System.out.println("Pago de intereses completado.");

    }

    public static Banco fusionarBanco(Banco banco1, Banco banco2, ArrayList<CuentaCorriente> bancolista1,
            ArrayList<CuentaCorriente> bancolista2) {
        String nombre = banco1.getNombre() + " y " + banco2.getNombre();
        int numeroTrabajadoresF = banco1.getNumeroTrabajadores() + banco2.getNumeroTrabajadores();
        ArrayList<CuentaCorriente> listaFusionada = new ArrayList<>();

        listaFusionada.addAll(bancolista1);
        listaFusionada.addAll(bancolista2);

        double interesFusionadoMedia = (banco1.getRatioInteres() + banco2.getRatioInteres()) / 2;

        Banco bancoFusionado = new Banco(nombre, interesFusionadoMedia, listaFusionada, numeroTrabajadoresF);
        return bancoFusionado;
    }

    public void mostrarDatosBanco(Banco banco) {
        System.out.println("Nombre banco: " + banco.getNombre());

        System.out.println("Numero de cuentas corrientes: " + numeroCuentas(banco));
        System.out.println("Numero de trabajadores: " + banco.getNumeroTrabajadores());

    }

    private int numeroCuentas(Banco banco) {
        int contador = 0;
        for (CuentaCorriente cuentaCorriente : banco.getListaCuentaCorriente()) {
            contador++; // Tambien se puede poner banco.getListaCuentaCorriente().size();
        }
        return contador;

    }

    public void clienteMasDinero(Banco banco) {
        double aux;
        double Mdinero = 0;
        String clienteM = null;

        for (CuentaCorriente cuentaCorriente : banco.getListaCuentaCorriente()) {

            aux = cuentaCorriente.getSaldo();

            if (aux > Mdinero) {
                clienteM = cuentaCorriente.getTitular().getNombre() + " " + cuentaCorriente.getTitular().getApellidos();
                Mdinero = aux;
            }
        }

        System.out.println("El cliente con mas dinero es " + clienteM + " " + "con : " + Mdinero);
    }

    public void clienteMenosDinero(Banco banco) {
        double aux;
        double mDinero = banco.getListaCuentaCorriente().get(0).getSaldo();
        String clientem = banco.getListaCuentaCorriente().get(0).getTitular().getNombre();

        for (CuentaCorriente cuentaCorriente : banco.getListaCuentaCorriente()) {

            aux = cuentaCorriente.getSaldo();

            if (aux < mDinero) {
                clientem = cuentaCorriente.getTitular().getNombre() + " " + cuentaCorriente.getTitular().getApellidos();
                mDinero = aux;
            }
        }

        System.out.println("El cliente con menos dinero es " + clientem + " " + "con : " + mDinero);
    }

    public void ingresarDinero(Banco banco, long iban, double dineroIngresar) {
        boolean ibanEcontrado = false;
        String nombre = " ";
        String apellido = " ";
        double saldoActual = 0;
        double saldoActualizado = 0;

        for (CuentaCorriente cuentas : banco.getListaCuentaCorriente()) {
            if (iban == cuentas.getIban()) {
                nombre = cuentas.getTitular().getNombre();
                apellido = cuentas.getTitular().getApellidos();
                saldoActual = cuentas.getSaldo();
                cuentas.setSaldo(cuentas.getSaldo() + dineroIngresar);
                saldoActualizado = cuentas.getSaldo();

                ibanEcontrado = true;
                System.out.println("Dinero ingresado con exito");
            }

        }

        if (!ibanEcontrado) {
            System.out.println(
                    "No se ha encotrado el iban por lo tanto el usuario tampoco y el dinero no se ha ingresado");
        } else {
            System.out.println("Usuario encontrado con exito: " + nombre + " " + apellido + " saldo: " + saldoActual
                    + " a " + saldoActualizado);

        }

    }

    public void retirarDinero(Banco banco, long iban, double dineroRetirar) {
        boolean ibanEcontrado = false;
        String nombre = " ";
        String apellido = " ";
        double saldoActual = 0;
        double saldoActualizado = 0;

        for (CuentaCorriente cuentas : banco.getListaCuentaCorriente()) {
            if (iban == cuentas.getIban()) {
                nombre = cuentas.getTitular().getNombre();
                apellido = cuentas.getTitular().getApellidos();
                saldoActual = cuentas.getSaldo();

                if (dineroRetirar < cuentas.getSaldo()) {
                    cuentas.setSaldo(cuentas.getSaldo() - dineroRetirar);
                    saldoActualizado = cuentas.getSaldo();
                    System.out.println("Dinero retirado con exito");

                } else {
                    System.out
                            .println("Saldo retirado mayor que el guardado actual, no se puede realizar la operacion");
                    saldoActual = cuentas.getSaldo();

                    saldoActualizado = cuentas.getSaldo();

                }
                ibanEcontrado = true;
            }

        }

        if (!ibanEcontrado) {
            System.out.println(
                    "No se ha encotrado el iban por lo tanto el usuario tampoco y el dinero no se ha retirado");
        } else {
            System.out
                    .println("Usuario encontrado con exito: " + nombre + " " + apellido + " saldo: " + saldoActual
                            + " a " + saldoActualizado);
        }

    }

    public void transferencia(long iban1, long iban2, Banco banco) {

        boolean iban1Econtrado = false;
        boolean iban2Econtrado = false;

        double emisor = 0;
        double receptor = 0;
        double resultado = 0;

        for (CuentaCorriente cuentaCorriente : listaCuentaCorriente) {
            if (iban1 == cuentaCorriente.getIban()) {
                iban1Econtrado = true;

                emisor = cuentaCorriente.getSaldo();

            }
            if (iban2 == cuentaCorriente.getIban()) {
                iban2Econtrado = true;
                receptor = cuentaCorriente.getSaldo();

            }

        }

        if (!iban1Econtrado) {
            System.out.println("No se encontro al usuario emisor");
        } else {
            System.out.println("se encontro al usuario emisor");
        }

        if (!iban2Econtrado) {
            System.out.println("No se encontro al usuario receptor");

        } else {
            System.out.println("se encontro al usuario emisor");
        }

        resultado = emisor + receptor;
        for (CuentaCorriente cuentaCorriente : listaCuentaCorriente) {
            if (iban2 == cuentaCorriente.getIban()) {

                cuentaCorriente.setSaldo(resultado);
            }
        }

    }

}
