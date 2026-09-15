package org.example.Banco;

public class Cuenta {
    private int contador_cuentas = 0;
    private final String FORMATO_IBAN = "ESXX";
    private final int DEFAULT_SALDO = 0;

    private String iban;
    private Cliente titular;
    private double saldo;


    public Cuenta (){
        ++contador_cuentas;
        iban = setIban();
        titular = null;
        saldo = DEFAULT_SALDO;

    }

    public String getIban() {
        return iban;
    }

    public String setIban() {
        return FORMATO_IBAN+contador_cuentas;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "iban='" + iban + '\'' +
                ", titular=" + titular +
                ", saldo=" + saldo +
                '}';
    }
}
