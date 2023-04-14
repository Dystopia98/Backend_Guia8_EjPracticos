
import Objetos.Cafetera;
import Servicios.CafeteraServicio;
import java.util.Scanner;

/**
* Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con los atributos 
*  capacidadMáxima (la cantidad máxima de café que puede contener la cafetera) y 
*  cantidadActual (la cantidad actual de café que hay en la cafetera). Agregar 
*  constructor vacío y con parámetros así como setters y getters. Crear 
*  clase CafeteraServicio en el paquete Servicios con los siguiente metodos:
* Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
* Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la 
*  taza y simula la acción de servir la taza con la capacidad indicada. Si la cantidad actual de 
*  café “no alcanza” para llenar la taza, se sirve lo que quede. El método le informará 
*  al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
* Método vaciarCafetera(): pone la cantidad de café actual en cero. 
* Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se 
*  añade a la cafetera la cantidad de café indicada.
 */
public class Ej_2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int R ;
        CafeteraServicio C1 = new CafeteraServicio();
        Cafetera C = C1.llenarCafe();
        do{
            System.out.println("          MENÚ");
            System.out.println("       1)Vaciar cafetera.");
            System.out.println("       2)Agregar cafe.");
            System.out.println("       3)Servir en taza(elegir)");
            System.out.println("       4)TERMINAR.");
            System.out.print("         >");
            R = leer.nextInt();
            switch(R){
                case 1 :
                    C1.vaciarCafetera(C);
                    break;
                case 2 :
                    C1.agregarCafe(C);
                    break;
                case 3 :
                    C1.servirTaza(C);
                    break;
                case 4 :
                    break;
                default :
                    System.out.println("Opciones del 1 al 3... 4 para terminar el programa.");
                    break;
            }
        }while((R >= 1 && R <= 3)|| (R >= 5 || R <= 0));
    }
    
}
