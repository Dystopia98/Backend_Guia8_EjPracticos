package Servicios;

import Objetos.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaServicio {
    Scanner leer = new Scanner(System.in);
    public CuentaBancaria crearCuenta(){
    CuentaBancaria X = new CuentaBancaria();
        System.out.print("Número de cuenta : ");
        X.setNumcuenta(leer.nextInt());
        System.out.print("D.N.I : ");
        X.setDnicliente(leer.nextInt());
        X.setSaldoactual(((double)((int)(Math.random()*100000000))/100));
        System.out.print("Saldo actual : ");
        System.out.println(X.getSaldoactual());
        return new CuentaBancaria(X.getNumcuenta(),X.getDnicliente(),X.getSaldoactual());
    }
    public double Ingresar(CuentaBancaria n){
        System.out.println("----- Cantidad de dinero a ingresar -----");
        System.out.print("        > ");
        double C = leer.nextDouble();
        n.setSaldoactual(n.getSaldoactual()+C);
        return n.getSaldoactual();
    }
    public double Retirar(CuentaBancaria n){
        System.out.println("----- Cantidad de dinero a retirar -----");
        System.out.print("        > ");
        double C , R = leer.nextDouble();
        C = n.getSaldoactual();
        if (R >= n.getSaldoactual()){
            n.setSaldoactual(0);
            System.out.println(" Su limite de saldo es de $"+C+" por lo que");
            System.out.println("  se retiró su saldo total de $"+C);
            return n.getSaldoactual();
        } else {
            n.setSaldoactual(n.getSaldoactual()-R);
            System.out.println(" Se retiro $"+C);
            return n.getSaldoactual();
        }
    }
    public double MetodoExtraccionRapida(CuentaBancaria n){
        double Num;
        Num = (double)((int)((n.getSaldoactual()*0.2)*100))/100;
        System.out.println("Se retiró "+Num+" de "+n.getSaldoactual());
        n.setSaldoactual(n.getSaldoactual() - Num);
        return n.getSaldoactual();
    }
    public void ConsultarSaldo(CuentaBancaria n){
        System.out.println("Saldo actual : $"+n.getSaldoactual());
    }
    public void ConsultarDatos(CuentaBancaria n){
        System.out.println("Número de cuenta : "+n.getNumcuenta());
        System.out.println("D.N.I de cliente : "+n.getDnicliente());
        System.out.println("Saldo actual : $"+n.getSaldoactual());
    }
}
