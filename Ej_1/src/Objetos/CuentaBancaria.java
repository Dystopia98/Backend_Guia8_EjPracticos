package Objetos;

public class CuentaBancaria {
    public int numcuenta;
    public long dnicliente;
    public double saldoactual;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numcuenta, long dnicliente, double saldoactual) {
        this.numcuenta = numcuenta;
        this.dnicliente = dnicliente;
        this.saldoactual = saldoactual;
    }

    public void setNumcuenta(int numcuenta) {
        this.numcuenta = numcuenta;
    }

    public void setDnicliente(long dnicliente) {
        this.dnicliente = dnicliente;
    }

    public void setSaldoactual(double saldoactual) {
        this.saldoactual = saldoactual;
    }

    public int getNumcuenta() {
        return numcuenta;
    }

    public long getDnicliente() {
        return dnicliente;
    }

    public double getSaldoactual() {
        return saldoactual;
    }
    
}
