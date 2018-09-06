/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author eduardo.schneider
 */
public class Conta {
    private String codigoConta;
    private String nome;
    private String banco;
    private double saldo;
    private Extrato extrato[];

    
    public Conta(){
        this.codigoConta = "0010-00";
        this.nome = "Eduardo Schneider";
        this.banco = "Banco do Brasil 001";
        this.saldo = 520.0;
        this.extrato = new Extrato[30];
    }
    
    public Extrato[] getExtrato() {
        return extrato;
    }

    public void setExtrato(Extrato[] extrato) {
        this.extrato = extrato;
    }

    public String getCodigoConta() {
        return codigoConta;
    }

    public void setCodigoConta(String codigoConta) {
        this.codigoConta = codigoConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }    
}
