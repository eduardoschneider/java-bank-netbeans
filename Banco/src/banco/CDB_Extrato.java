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
public class CDB_Extrato {
    private int id;
    private CDB cdb;
    private Cliente cliente;
    private double saldo;
    private Date datainicio;
    private Date datatermino;
    private boolean status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CDB getCdb() {
        return cdb;
    }

    public void setCdb(CDB cdb) {
        this.cdb = cdb;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Date getDatainicio() {
        return datainicio;
    }

    public void setDatainicio(Date datainicio) {
        this.datainicio = datainicio;
    }

    public Date getDatatermino() {
        return datatermino;
    }

    public void setDatatermino(Date datatermino) {
        this.datatermino = datatermino;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}