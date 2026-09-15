package org.example.AplicacionBancaria;

import java.util.HashMap;
import java.util.Map;

public class Banco {
    static HashMap<String,Double> mapaBanco = new HashMap<>();

    public static HashMap<String, Double> getMapaBanco() {
        return mapaBanco;
    }

    public static void depositar(String cuenta, double monto){

        for (Map.Entry<String,Double> mapita : mapaBanco.entrySet()){
            if (mapita.getKey().equals(cuenta)){
                double saldo = mapita.getValue()+monto;

                mapita.setValue(saldo);
            }
        }

    }

    public static void retirar(String cuenta,double monto){

        for (Map.Entry<String,Double> mapita : mapaBanco.entrySet()){
            if (mapita.getKey().equals(cuenta)){
                double saldo = mapita.getValue()-monto;

                mapita.setValue(saldo);
            }
        }
    }

    public static double consultarSaldo(String cuenta){

        return mapaBanco.get(cuenta);
    }
}
