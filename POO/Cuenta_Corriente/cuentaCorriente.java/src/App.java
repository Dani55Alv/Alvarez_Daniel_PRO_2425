public class App {
    public static void main(String[] args)  {
     

        Cliente cliente1 = new Cliente("Juan", "Pérez", "12345678A", Raza.caucasica);

        //Ahora cliente 2 vale su iban 1, ya que el static contador del iban de la clase cuenta corriente
        Cliente cliente2 = new Cliente("Ana", "López", "87654321B", Raza.mongolica);

           CuentaCorriente cuentaCorriente1 = new CuentaCorriente (cliente1);
           CuentaCorriente cuentaCorriente2 = new CuentaCorriente(cliente2);
/*
 * cuentaCorriente1.InfCuenta(cliente1);
 * cuentaCorriente1.ingresarDinero(cliente1);
 * cuentaCorriente1.sacarDinero(cliente1);
 * cuentaCorriente1.InfCuenta(cliente1);
 * System.out.println("");
 * 
 * cuentaCorriente2.InfCuenta(cliente2);
 * cuentaCorriente2.cambiarTitular(cliente2, "Miguel");
 * cuentaCorriente2.InfCuenta(cliente2);
 */
System.out.println("AAA");
cuentaCorriente2.sacarDinero(cliente1, 50);

           cuentaCorriente1.ingresarDinero(cliente1, 5000);

             cuentaCorriente1.InfCuenta(cliente1);
             System.out.println();
             cuentaCorriente2.InfCuenta(cliente2);
System.out.println("sucede traspaso");
             cuentaCorriente1.traspasarDinero(cuentaCorriente1, cuentaCorriente2, cliente1, cliente2, 50);
             cuentaCorriente1.InfCuenta(cliente1);
             System.out.println();
             cuentaCorriente2.InfCuenta(cliente2);


   // Sacardinero


 //Ingresar dinero en efectivo


  //Mostrar información de la cuenta por consola
  //Cambiar el titular de la cuenta
 // Traspasar dinero de una cuenta a otra
    }
}
