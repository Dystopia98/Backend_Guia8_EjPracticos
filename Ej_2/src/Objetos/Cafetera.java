package Objetos;

public class Cafetera {
    public int capacidadmaxima;
    public int cantidadactual;

    public Cafetera() {
    }

    public Cafetera(int capacidadmaxima, int cantidadactual) {
        this.capacidadmaxima = capacidadmaxima;
        this.cantidadactual = cantidadactual;
    }

    public void setCapacidadmaxima(int capacidadmaxima) {
        this.capacidadmaxima = capacidadmaxima;
    }

    public void setCantidadactual(int cantidadactual) {
        this.cantidadactual = cantidadactual;
    }

    public int getCapacidadmaxima() {
        return capacidadmaxima;
    }

    public int getCantidadactual() {
        return cantidadactual;
    }
    
}
