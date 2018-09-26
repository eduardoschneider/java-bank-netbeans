/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.math.BigDecimal;

/**
 *
 * @author eduardo.schneider
 */
public class CDB {
    private int id;
    private String nome;
    private BigDecimal saldo;

    public CDB(int id, String nome, BigDecimal saldo) {
        this.id = id;
        this.nome = nome;
        this.saldo = saldo;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
}
