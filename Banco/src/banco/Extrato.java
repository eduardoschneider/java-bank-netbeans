/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Date;

/**
 *
 * @author eduardo.schneider
 */
public class Extrato {
    private Date data;
    private double valorMexido;
    private boolean tipoMovimento; //false = saida true = entrada
    private Conta conta;

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValorMexido() {
        return valorMexido;
    }

    public void setValorMexido(double valorMexido) {
        this.valorMexido = valorMexido;
    }

    public boolean isTipoMovimento() {
        return tipoMovimento;
    }

    public void setTipoMovimento(boolean tipoMovimento) {
        this.tipoMovimento = tipoMovimento;
    }
}
