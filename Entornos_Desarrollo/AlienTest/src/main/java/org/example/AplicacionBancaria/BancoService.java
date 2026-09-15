package org.example.AplicacionBancaria;

public class BancoService {

    private final RepositorioBanco repositorioBanco;


    public BancoService(RepositorioBanco repositorioBanco) {
        this.repositorioBanco = repositorioBanco;
    }

    public void depositar(String cuenta, double monto){
        double saldo = repositorioBanco.obtenerSaldo(cuenta);

        repositorioBanco.actualizarSaldo(cuenta,saldo+monto);

    }

    public void retirar(String cuenta,double monto){
        double saldo = repositorioBanco.obtenerSaldo(cuenta);

        repositorioBanco.actualizarSaldo(cuenta,saldo-monto);
    }

    public double consultarSaldo(String cuenta){
        return repositorioBanco.obtenerSaldo(cuenta);
    }

}
