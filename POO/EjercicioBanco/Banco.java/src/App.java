import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Las listas se crean en el main.

        // NO HAY QUE CREAR LISTA, NO HAY QUE CREAR CUENTA CORRIENTE EN EL MAIN ,SOLO UN
        // BANCO EN EL MAIN y
        // CLIENTES. HAy que crear una lista por banco
        ArrayList<CuentaCorriente> ListaCuentaCorrienteBanco1 = new ArrayList<CuentaCorriente>();
        ArrayList<CuentaCorriente> ListaCuentaCorrienteBanco2 = new ArrayList<CuentaCorriente>();

        Banco banco1 = new Banco("Iber", 1.5, ListaCuentaCorrienteBanco1, 12); // Cliente1 esta aqui Dani
        Banco banco2 = new Banco("BBVA", 3.0, ListaCuentaCorrienteBanco2, 20); // Cliente2 esta aqui Guille

        Cliente cliente1 = new Cliente("Daniel", "Alvarez", "12345678V", Raza.caucasica);
        Cliente cliente2 = new Cliente("Guillermo", "Alvarez", "12345678C", Raza.caucasica);
        Cliente cliente3 = new Cliente("Alvaro", "Alvarez", "12345678D", Raza.caucasica);

        CuentaCorriente cuenta1 = new CuentaCorriente(cliente1);
        CuentaCorriente cuenta2 = new CuentaCorriente(cliente2);
        CuentaCorriente cuenta3 = new CuentaCorriente(cliente3);
        ListaCuentaCorrienteBanco1.add(cuenta3);
        ListaCuentaCorrienteBanco1.add(cuenta1);

        ListaCuentaCorrienteBanco2.add(cuenta2);

        banco1.mostrarListaBanco(ListaCuentaCorrienteBanco1, banco1);

        cuenta1.InfCuenta(cliente1);
        System.out.println();
        cuenta2.InfCuenta(cliente2);
        // Hacer metodo mostrar cuenta corriente
        banco1.mostrarListaBanco(ListaCuentaCorrienteBanco1, banco1);

        // Hacer metodo ELIMINAR

        banco1.eliminarCuentaBanco(ListaCuentaCorrienteBanco1, banco1);

        banco1.mostrarListaBanco(ListaCuentaCorrienteBanco1, banco1);

        // Metodo añadir banco

        banco1.crearCuentaBanco(ListaCuentaCorrienteBanco2, banco2, cuenta1); // añadir daniel a BBVA

        banco2.mostrarListaBanco(ListaCuentaCorrienteBanco2, banco2);
        banco1.mostrarListaBanco(ListaCuentaCorrienteBanco1, banco1);

        banco1.crearCuentaBanco(ListaCuentaCorrienteBanco2, banco2, cuenta1); // añadir daniel a BBVA

        // Cambiando titular
        banco1.cambiarTitular(cuenta1, cuenta2);

        System.out.println();
        // Metemos manualmente dinero a guille y a dani
        cuenta1.setSaldo(50);
        cuenta2.setSaldo(150);

        banco2.pagoInteres(ListaCuentaCorrienteBanco2, banco2);

        // Fusionar banco (funcion estatico)
        Banco bancoFusionado = Banco.fusionarBanco(banco1, banco2, ListaCuentaCorrienteBanco1,
                ListaCuentaCorrienteBanco2);

        System.out.println(bancoFusionado.getNombre());

        System.out.println(bancoFusionado.getNumeroTrabajadores());
        System.out.println(bancoFusionado.getRatioInteres());

        bancoFusionado.mostrarListaBanco(bancoFusionado.getListaCuentaCorriente(), bancoFusionado);

        // Mostrar los datos del banco por consola: Nombre del banco, Número de cuentas
        // corrientes y número de trabajadores.

        bancoFusionado.mostrarDatosBanco(bancoFusionado);

        bancoFusionado.clienteMasDinero(bancoFusionado);

        bancoFusionado.clienteMenosDinero(bancoFusionado);

        bancoFusionado.ingresarDinero(bancoFusionado, 2, 25);

        bancoFusionado.retirarDinero(bancoFusionado, 2, 50);

        bancoFusionado.retirarDinero(bancoFusionado, 2, 5);

        // Daniel 1 125.45 y Alvaro 2 45

        // Si la transferencia es estatico quiere decir que lo hace la clase en este
        // caso la clase Banco, no dos
        // objetos entre si
        // Un atributo statico es de todos por ejemplo contadorIBan

        // transferencia(){}; Tiene que se un metodo estatico ya que lo hace el banco la
        // transaccion.

        // C

    }
}
