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
        // si fuera con fori el indice se decrementaria después de eliminar con exito la
        // cuenta.
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

        // En crear cuenta habria que que meter el cliente e incrementar el indice.
        // (Como empadronar humano)
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
    // En crear cuenta habria que que meter el cliente e incrementar el indice.
    // (Como empadronar humano)

    // Sería a traves de iban y cliente. Es decir el del this y el del que pasamos
    // por el iban y cliente.
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

    // No hace falta parametros.
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
        // Fori Manual
        // MANUAL int totalCuentas= banco1.getlCuetnaCorriente().lenght +
        // banco2.getlCuentaCorriente().lenght;
        // CuentaCorriente l[]1 = banco1.getlicuentaCorriente();
        // CuentaCorriente l[]2 = banco1.getlicuentaCorriente();

        // for (int i=0; i<banco1.getNumCuentasCorrientes();i++){
        // newBanco .anadirCuentaCorriente(lCuentaCorrienteB1[i]);
        // }
        /* Anadir cuenta corriente es una aparte que anade cuenta corrientes */
        // for (int i=0; i<banco2.getNumCuentasCorrientes();i++){
        // newBanco.anadirCuentaCorriente(lCuentaCorrienteB2[i]);
        // }
        // return newbanco; (Es decir hay que obtener todos los parametros del banc
        // fusionado)
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

    public void transferencia(long iban1, long iban2, double dineroAEmitir) {
        Scanner sc = new Scanner(System.in);

        boolean iban1Econtrado = false;
        boolean iban2Econtrado = false;
        String nombreEmisor = " ";
        String nombreReceptor = " ";

        double emisor = 0;
        double receptor = 0;
        double resultadoE = 0;
        double resultadoR = 0;
        for (CuentaCorriente cuentaCorriente : listaCuentaCorriente) {
            if (iban1 == cuentaCorriente.getIban()) {
                iban1Econtrado = true;
                nombreEmisor = cuentaCorriente.getTitular().getNombre();
                emisor = cuentaCorriente.getSaldo();
                System.out.println("Cuanto dinero va a querer el emisor emitir ");

                resultadoE = emisor - dineroAEmitir;

                cuentaCorriente.setSaldo(resultadoE);

            }
            if (iban2 == cuentaCorriente.getIban()) {
                iban2Econtrado = true;
                nombreReceptor = cuentaCorriente.getTitular().getNombre();

                receptor = cuentaCorriente.getSaldo();
                resultadoR = receptor + dineroAEmitir;
                cuentaCorriente.setSaldo(resultadoR);

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

        System.out.println("El cliente " + nombreEmisor + " a dado " + dineroAEmitir + " a " + nombreReceptor
                + " con lo que el cliente " + nombreReceptor + " ahora tiene de saldo: " + resultadoR
                + " y el emisor tiene " + resultadoE);

    }

    public void mostrarListacuentaCorreinte() {
        // Como seria manual? hacelrlo
        for (CuentaCorriente cuentaCorriente : listaCuentaCorriente) {
            System.out.println("Iban: " + cuentaCorriente.getIban() + " Nombre: "
                    + cuentaCorriente.getTitular().getNombre() + " Saldo:" + cuentaCorriente.getSaldo());
        }
    }

    public void cuentaConMasDineroAmenos() {
        System.out.println("Cuenta corriente con mas a menos dinero");
        double[] array = new double[listaCuentaCorriente.size()];

        int indice = 0;
        for (CuentaCorriente cuentas : listaCuentaCorriente) {

            array[indice] = cuentas.getSaldo();
            indice++;

        }

        double auxb = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    auxb = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = auxb;
                }
            }

        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("Cuenta corriente " + (i + 1) + " " + +array[i]);
        }

    }

}
