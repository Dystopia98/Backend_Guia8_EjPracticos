package Servicios;

import Objetos.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {

    Scanner leer = new Scanner(System.in);

    public Cafetera llenarCafe() {
        System.out.println("Capacidad de cafetera");
        System.out.println("     1,5L(1500ml) ");
        Cafetera X = new Cafetera();
        X.capacidadmaxima = 1500;
        X.cantidadactual = 0;
        return new Cafetera(X.capacidadmaxima, X.cantidadactual);
    }

    public int servirTaza(Cafetera n) {
        int R;
        System.out.println("");
        System.out.println("  --- 1)Taza pequeña.");
        System.out.println("  --- 2)Taza mediana.");
        System.out.println("  --- 3)Taza grande.");
        System.out.print("      > ");
        R = leer.nextInt();
        if (R == 1) {
            if (n.getCantidadactual() >= 90) {
                n.setCantidadactual(n.getCantidadactual() - 90);
                System.out.println("Taza llena!");
                System.out.println("¡Hasta pronto!");
            } else {
                if (n.getCantidadactual() < 45) {
                    System.out.println("Su taza esta servida con menos de la mitad de cafe.");
                } else if (n.getCantidadactual() == 45) {
                    System.out.println("Su taza esta medio llena.");
                } else {
                    System.out.println("Su taza esta servida con mas de la mitad,pero no esta llena.");
                }
                System.out.println("Taza servida con " + n.getCantidadactual() + "ml de café.");
                n.setCantidadactual(0);
                System.out.println("¡Hasta pronto!");
            }
        }
        if (R == 2) {
            if (n.getCantidadactual() >= 110) {
                n.setCantidadactual(n.getCantidadactual() - 110);
                System.out.println("Taza llena!");
                System.out.println("¡Hasta pronto!");
            } else {
                if (n.getCantidadactual() < 55) {
                    System.out.println("Su taza esta servida con menos de la mitad de cafe.");
                } else if (n.getCantidadactual() == 55) {
                    System.out.println("Su taza esta medio llena.");
                } else {
                    System.out.println("Su taza esta servida con mas de la mitad,pero no esta llena.");
                }
                System.out.println("Taza servida con " + n.getCantidadactual() + "ml de café.");
                n.setCantidadactual(0);
                System.out.println("¡Hasta pronto!");
            }
        }
        if (R == 3) {
            if (n.getCantidadactual() >= 150) {
                System.out.println("Taza llena!");
                n.setCantidadactual(n.getCantidadactual() - 150);
                System.out.println("¡Hasta pronto!");
            } else {
                if (n.getCantidadactual() < 75) {
                    System.out.println("Su taza esta servida con menos de la mitad de cafe.");
                } else if (n.getCantidadactual() == 75) {
                    System.out.println("Su taza esta medio llena.");
                } else {
                    System.out.println("Su taza esta servida con mas de la mitad,pero no esta llena.");
                }
                System.out.println("Taza servida con " + n.getCantidadactual() + "ml de café.");
                n.setCantidadactual(0);
                System.out.println("¡Hasta pronto!");
            }
        }
        if (R <= 0 || R >= 4) {
            System.out.println("            ¿...?");
            System.out.println("Usted no apretó ningún botón...");
        }
        return n.getCantidadactual();
    }

    public void vaciarCafetera(Cafetera n) {
        System.out.println("");
        n.setCantidadactual(0);
        System.out.println("Cafetera vacía");
    }

    public int agregarCafe(Cafetera n) {
        int R;
        System.out.println("");
        System.out.println("Cantidad actual : "+n.getCantidadactual());
        System.out.println("");
        System.out.print("Cantidad : ");
        R = leer.nextInt();
        if (R > n.getCapacidadmaxima()) {
            System.out.println("No sobrepasar el limite de la cafetera(1.5L)...");
        } else {
            if (R <= 0) {
                System.out.println("Cafetera vacia , imposible agregar menos...");
            } else {
                n.setCantidadactual(R);
                System.out.println("Cantidad actual : " + R);
            }
        }
        return n.getCantidadactual();
    }
}
