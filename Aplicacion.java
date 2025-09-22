import Clases.CuentaBancaria;
import Clases.Persona;

public class Aplicacion {
    public static void main(String args []) {

        Persona p1 = new Persona("Italo", 25);
        Persona p2 = new Persona("Brandon", 30);
        Persona p3 = new Persona("Francis", 40);
        
        CuentaBancaria c1 = new CuentaBancaria(1000, p1);
        CuentaBancaria c2 = new CuentaBancaria(2000, p2);
        CuentaBancaria c3 = new CuentaBancaria(3000, p3);

        c1.depositar(500);
        c2.retirar(300);
        c3.depositar(1000);
        c3.retirar(5000);

        System.out.println("\n--- Saldos actuales ---");
        System.out.println("Cuenta " + c1.getNumeroCuenta() + " - $" + c1.getSaldo());
        System.out.println("Cuenta " + c2.getNumeroCuenta() + " - $" + c2.getSaldo());
        System.out.println("Cuenta " + c3.getNumeroCuenta() + " - $" + c3.getSaldo());

        System.out.println();
        CuentaBancaria.imprimeInformacionDeTodasLasCuentas();
    } 
}
