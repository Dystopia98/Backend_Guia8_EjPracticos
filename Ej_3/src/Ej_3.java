
import Entidad.Persona;
import Servicios.PersonaServicio;

/**
 * Realizar una clase llamada Persona en el paquete de entidades que tengan los
 * siguientes atributos: nombre, edad, sexo (‘H’ para hombre, ‘M’ para mujer,
 * ‘O’ para otro), peso y altura. Si desea añadir algún otro atributo, puede
 * hacerlo. Agregar constructores, getters y setters. En el paquete Servicios
 * crear PersonaServicio con los siguientes 3 métodos: Método esMayorDeEdad():
 * indica si la persona es mayor de edad. La función devuelve un booleano.
 * Metodo crearPersona(): el método crear persona, le pide los valores de los
 * atributos al usuario y después se le asignan a sus respectivos atributos para
 * llenar el objeto Persona. Además, comprueba que el sexo introducido sea
 * correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje
 * Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
 * kg/(altura^2 en m2)). Si esta fórmula da por resultado un valor menor que 20,
 * significa que la persona está por debajo de su peso ideal y la función
 * devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
 * (incluidos), significa que la persona está en su peso ideal y la función
 * devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor
 * que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
 * A continuación, en la clase main hacer lo siguiente: Crear 4 objetos de tipo
 * Persona con distintos valores, a continuación, llamaremos todos los métodos
 * para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
 * sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
 * persona es mayor de edad. Por último, guardaremos los resultados de los
 * métodos calcularIMC y esMayorDeEdad en distintas variables(arrays), para
 * después calcular un porcentaje de esas 4 personas cuantas están por debajo de
 * su peso, cuantas en su peso ideal y cuantos, por encima, y también
 * calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
 * Para esto, podemos crear unos métodos adicionales.
 */
public class Ej_3 {

    public static void main(String[] args) {
        boolean[] Array1 = new boolean[4];
        int[] Array2 = new int[4];
        int Ed = 0, Pb = 0, Pi = 0, Pe = 0;
        PersonaServicio Obj = new PersonaServicio();

        Persona Obj1 = Obj.crearPersona();
        Obj.esMayorDeEdad(Obj1);
        Obj.IMC(Obj1);
        Array1[0] = Obj.esMayorDeEdad(Obj1);
        Array2[0] = Obj.IMC(Obj1);
        System.out.println("----------*----------");
        Persona Obj2 = Obj.crearPersona();
        Obj.esMayorDeEdad(Obj2);
        Obj.IMC(Obj2);
        Array1[1] = Obj.esMayorDeEdad(Obj2);
        Array2[1] = Obj.IMC(Obj2);
        System.out.println("----------*----------");
        Persona Obj3 = Obj.crearPersona();
        Obj.esMayorDeEdad(Obj3);
        Obj.IMC(Obj3);
        Array1[2] = Obj.esMayorDeEdad(Obj3);
        Array2[2] = Obj.IMC(Obj3);
        System.out.println("----------*----------");
        Persona Obj4 = Obj.crearPersona();
        Obj.esMayorDeEdad(Obj4);
        Obj.IMC(Obj4);
        Array1[3] = Obj.esMayorDeEdad(Obj4);
        Array2[3] = Obj.IMC(Obj4);

        for (int i = 0; i < 4; i++) {
            if (Array1[i]) {
                Ed = Ed + 1;
            }
            switch (Array2[i]) {
                case -1:
                    Pb = Pb + 1;
                    break;
                case 0:
                    Pi = Pi + 1;
                    break;
                default:
                    Pe = Pe + 1;
                    break;
            }
        }
        System.out.println(((Ed * 100) / 4) + "% son mayores de edad.");
        System.out.println(" y "+(((4-Ed)*100)/4)+"% son menores de edad.");
        System.out.println(((Pb * 100) / 4) + "% Estan por debajo de su peso.");
        System.out.println(((Pi * 100) / 4) + "% Estan en su peso ideal.");
        System.out.println(((Pe * 100) / 4) + "% Estan por ensima de su peso.");
    }

}
