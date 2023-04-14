import java.util.Scanner;
import Objetos.CuentaBancaria;
import Servicios.CuentaBancariaServicio;

/**
* Realizar una clase llamada CuentaBancaria en el paquete Entidades con los siguientes atributos:
*     numeroCuenta(entero), dniCliente(entero largo), saldoActual.
* Agregar constructor vacío, con parámetros, getters y setters.
* Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
* -Método para crear cuenta pidiéndole los datos al usuario.
* -Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
* -Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual.
*   Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta 
*   dejar la cuenta en 0.
* -Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que 
*   el usuario no saque más del 20%.
* -Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
* -Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
 */
public class Ej_1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int R;
        CuentaBancariaServicio C1 = new CuentaBancariaServicio();
        CuentaBancaria C = C1.crearCuenta();
        do {
            System.out.println("               MENU");
            System.out.println("          1)Ingresar saldo.");
            System.out.println("          2)Retirar saldo.");
            System.out.println("          3)Metodo extracción rapida(20% del saldo)");
            System.out.println("          4)Consultar saldo.");
            System.out.println("          5)Consultar datos.");
            System.out.println("          6)Terminar.");
            System.out.print("     > ");
            R = leer.nextInt();
            switch (R) {
                case 1 :
                    C1.Ingresar(C);
                    break;
                case 2 :
                    C1.Retirar(C);
                    break;
                case 3 :
                    C1.MetodoExtraccionRapida(C);
                    break;
                case 4 :
                    C1.ConsultarSaldo(C);
                    break;
                case 5 :
                    C1.ConsultarDatos(C);
                    break;
                case 6 :
                    break;
                default :
                    System.out.println("    OPCIÓN NO ENCONTRADA.");
                    System.out.println(" INGRESE UN NÚMERO DEL 1 AL 6.");
                    break;
            }
        }while((R >= 1 && R <= 5)|| R >= 7);
    }
    
}
