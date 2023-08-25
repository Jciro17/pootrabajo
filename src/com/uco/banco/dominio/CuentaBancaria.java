package com.uco.banco.dominio;

public class CuentaBancaria {
    public int numero;
    public long saldo;
    public boolean activa;


    public boolean consignar(long valorAConsignar) {
        if (this.activa) {
            this.saldo += valorAConsignar;
            return true;
        }

        System.out.println("No se puede consignar a " + this.numero + ". La cuenta no está activa.");
        return false;
    }

    public boolean retirar(long valorARetirar) {
        if (this.activa && this.saldo >= valorARetirar) {
            this.saldo -= valorARetirar;
            return true;
        }

        System.out.println("No se puede retirar de " + this.numero + ".");
        return false;
    }

    public boolean transferir(long valorATransferir, CuentaBancaria cuentaDestino) {
        boolean retiroCorrecto = this.retirar(valorATransferir);

        if (retiroCorrecto) {
            boolean consignoCorrecto = cuentaDestino.consignar(valorATransferir);

            if (consignoCorrecto) {
                return true;
            }

            this.saldo += valorATransferir;
            return false;
        }

        return false;
    }

    public String consultarSaldo() {
        String mensajeSaldo = "Tu saldo es " + saldo;
        return mensajeSaldo;
    }
}
