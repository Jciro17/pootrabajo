package com.uco.banco.app;

import com.uco.banco.dominio.CuentaBancaria;

public class AppBanco {
    public static void main(String[] args) {
        CuentaBancaria miCuenta = new CuentaBancaria();
        miCuenta.numero = 123;
        miCuenta.activa = true;

        CuentaBancaria otraCuenta = new CuentaBancaria();
        otraCuenta.numero = 456;
        otraCuenta.activa = true;

        miCuenta.consignar(900000);
        miCuenta.transferir(500000, otraCuenta);

        System.out.println(miCuenta.consultarSaldo());
        System.out.println(otraCuenta.consultarSaldo());
    }
}
