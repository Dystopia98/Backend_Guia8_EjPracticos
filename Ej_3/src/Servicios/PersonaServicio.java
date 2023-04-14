package Servicios;

import Entidad.Persona;
import java.util.Scanner;

public class PersonaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Persona crearPersona(){
        Persona X = new Persona();
        System.out.print("Nombre : ");
        X.setNombre(leer.next());
        System.out.print("Edad : ");
        X.setEdad(leer.nextInt());
        System.out.println("Sexo HOMBRE (H) / MUJER (M) / OTROS (O) : ");
        X.setSexo(leer.next().substring(0,1).toUpperCase());
        if(!X.getSexo().equals("H") && !X.getSexo().equals("M" ) && !X.getSexo().equals("O")){
            X.setSexo("Indefinido.");
        }
        System.out.print("Peso : ");
        X.setPeso(leer.nextDouble());
        System.out.print("Altura(en centimetros) : ");
        X.setAltura(leer.nextDouble());
        return new Persona(X.getNombre(),X.getEdad(),X.getSexo(),X.getPeso(),X.getAltura());
    }
    public boolean esMayorDeEdad(Persona n){
        return (n.getEdad() >= 18);
    }
    public int IMC(Persona n){
        double M;
        M = (n.getPeso()/(Math.pow(n.getAltura()/100, 2)));
        //IMC = peso en kg / (altura*altura m2)
        if(M < 20){
            return -1;
        } else if(M >= 20 && M <= 25){
            return 0;
        } else {
            return 1;
        }
    }
}
