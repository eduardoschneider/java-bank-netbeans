/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import static banco.Banco.clearScreen;
import static banco.Banco.poupancas;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author eduardo.schneider
 */
public class Poupanca {
    private int idPoupanca;
    private Cliente cliente;
    private BigDecimal saldo;

    public Poupanca(int idPoupanca, Cliente cliente, BigDecimal saldo) {
        this.idPoupanca = idPoupanca;
        this.cliente = cliente;
        this.saldo = saldo;
    }
    
    public Poupanca(){
        
    }

    public int getIdPoupanca() {
        return idPoupanca;
    }

    public void setIdPoupanca(int idPoupanca) {
        this.idPoupanca = idPoupanca;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }    
    
        
    public static Poupanca checaExistenciaDePoupanca(Cliente c){
        
        for (Poupanca p : poupancas){
            if ((p.getCliente()).equals(c))
                return p;
        }
   
        return null;        
    }
    
     public void depositarPoupanca(Conta contaAtual, List<Extrato> extratos, List<PoupancaDeposito> poupancaMovimento, int contadorPoupancaDepositos){
        clearScreen();
        System.out.println("Digite o valor que deseja depositar na sua poupança: \n");
        Scanner leitor = new Scanner(System.in);
        BigDecimal valor = new BigDecimal(leitor.next());
        
        if ((contaAtual.getSaldo()).compareTo(valor.add(new BigDecimal("0.1"))) > 0) {
            contaAtual.setSaldo((contaAtual.getSaldo()).subtract(valor));
            this.setSaldo((this.getSaldo()).add(valor));
            Extrato extratoSaida = new Extrato(new Date(), valor, false, contaAtual);
            extratos.add(extratoSaida);
            PoupancaDeposito movimento = new PoupancaDeposito(contadorPoupancaDepositos, this, valor, new Date(), new Date(), new Date(), true);
            poupancaMovimento.add(movimento);
            contadorPoupancaDepositos++;
        }
    }
}
