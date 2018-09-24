/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import static banco.Banco.contaAtual;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author eduardo.schneider
 */
public class Conta {
    private String codigoConta;
    private Cliente cliente;
    private double saldo;

    
    public Conta(String codigoConta, Cliente cliente, double saldo){
        this.codigoConta = codigoConta;
        this.cliente = cliente;
        this.saldo = saldo;
    }
   
//        switch(tipo){
//            case 1:
//                this.codigoConta = "0010-00";
//                this.senha = "00000";
//                this.nome = "Eduardo Schneider";
//                this.banco = "Banco do Brasil 001";
//                this.saldo = 520.0;
//                break;
//            case 2:
//                this.codigoConta = "0011-00";
//                this.senha = "00000";
//                this.nome = "Gabriel Campos";
//                this.banco = "Itaú 201";
//                this.saldo = 220.0;
//                break;
//            case 3:
//                this.codigoConta = "0012-00";
//                this.senha = "00000";
//                this.nome = "Daniel Campos";
//                this.banco = "Bradesco 221";
//                this.saldo = 310.0;
//                break;
//            case 4:
//                this.codigoConta = "0013-00";
//                this.senha = "00000";
//                this.nome = "Matheus Pereira";
//                this.banco = "Santander 335";
//                this.saldo = 970.0;
//                break;
//            case 5:
//                this.codigoConta = "0013-00";
//                this.senha = "00000";
//                this.nome = "Phelype de Paula";
//                this.banco = "Caixa Economica Federal 778";
//                this.saldo = 550.0;
//                break;
//            case 6:
//                this.codigoConta = "0014-00";
//                this.senha = "00000";
//                this.nome = "João Lucas";
//                this.banco = "Itau 201";
//                this.saldo = 120.0;
//                break;
//            case 7:
//                this.codigoConta = "0015-00";
//                this.senha = "00000";
//                this.nome = "Rafael Alvez";
//                this.banco = "Banco do Brasil 001";
//                this.saldo = 1520.0;
//                break;
//            case 8:
//                this.codigoConta = "1175-00";
//                this.senha = "00000";
//                this.nome = "Usuário Teste";
//                this.banco = "Banco Teste";
//                this.saldo = 25.0;
//                break;
//            default:
//                this.codigoConta = "000-00";
//                this.senha = "00000";
//                this.nome = "UNNAMED";
//                this.banco = "UNNAMED";
//                this.saldo = 0.0;
//                break;
//        }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getCodigoConta() {
        return codigoConta;
    }

    public void setCodigoConta(String codigoConta) {
        this.codigoConta = codigoConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.codigoConta);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Conta other = (Conta) obj;
        if (!Objects.equals(this.codigoConta, other.codigoConta)) {
            return false;
        }
        return true;
    }
    
     public Extrato sacar(Conta contaAtual){
        System.out.println("Digite o valor que deseja sacar:\n");
        Scanner leitor = new Scanner(System.in);
        Double valor = Double.parseDouble(leitor.next());
        
        if (contaAtual.getSaldo() < valor) {
            System.out.println("Saldo insuficiente para realizar o saque.\n");
            return null;
        }
        
        contaAtual.setSaldo(contaAtual.getSaldo() - valor);
        Extrato extrato = new Extrato(new Date(), valor, false, contaAtual);
        
        return extrato;
     }
     
     public void consultarSaldo(){
         System.out.println("O seu saldo é de: R$" + this.getSaldo());
         
     }

    
}
