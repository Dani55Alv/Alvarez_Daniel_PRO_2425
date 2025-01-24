
public class CuentaCorriente {
    
private static long contadorIban = 0; // "Los static afecta o todos los objetos"
// Si lo pusieramos directamente (es decir sin contador directamente iban) o sin static todos sería igual.

 private long iban;
 private double saldo; // "SALDO es para cada una su cuenta"
 private Cliente titular;





public CuentaCorriente( Cliente titular) {
    this.iban =contadorIban;
    this.saldo = 0;
    this.titular = titular;
    contadorIban++;

}





public static long getContadorIban() {
    return contadorIban;
}





public static void setContadorIban(long contadorIban) {
    CuentaCorriente.contadorIban = contadorIban;
}





public long getIban() {
    return iban;
}





public void setIban(long iban) {
    this.iban = iban;
}





public double getSaldo() {
    return saldo;
}





public void setSaldo(double saldo) {
    this.saldo = saldo;
}





public Cliente getTitular() {
    return titular;
}





public void setTitular(Cliente titular) {
    this.titular = titular;
}

public void sacarDinero(Cliente cliente, double retirada){
//Poner condicion
if (retirada>saldo) {
    System.out.println("No permitido excede al saldo");
}else{
    double resultadoOperacion = this.saldo - retirada;
    this.saldo = resultadoOperacion;
}
    


}

public void ingresarDinero(Cliente cliente, double ingreso) {



    double resultadoOperacion = this.saldo + ingreso;
    this.saldo = resultadoOperacion;

}

public void InfCuenta( Cliente cliente) {
   
    System.out.println("Este es el iban: "+ this.iban);
    System.out.println("Este es el saldo: " + this.saldo);
    System.out.println("Este es el titular: " + cliente.getNombre());

}
//En palabra despues de Cliente es decier "cliente" puedes poner lo que tu quieras
public void cambiarTitular(Cliente cliente, String nombre){

cliente.setNombre(nombre);
}


public void traspasarDinero(CuentaCorriente cliente1, CuentaCorriente cliente2, Cliente a, Cliente b, double dar){

cliente1.getSaldo();

cliente2.getSaldo();


cliente1.sacarDinero(a, dar);


cliente2.ingresarDinero(b, dar);
}
}