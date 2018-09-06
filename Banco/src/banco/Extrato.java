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
    private String codigoConta;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getCodigoConta() {
        return codigoConta;
    }

    public void setCodigoConta(String codigoConta) {
        this.codigoConta = codigoConta;
    }
}
