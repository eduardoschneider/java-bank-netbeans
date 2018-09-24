/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import static banco.Banco.clearScreen;
import static banco.Banco.contaAtual;
import static banco.Banco.idConta;
import java.util.Date;
import java.util.List;
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
     
     public static Conta cadastrarConta(List<Cliente> todos, int idConta) {
        System.out.println("Digite o CPF\n");
        Scanner leitor = new Scanner(System.in);
        String cpf = leitor.next();

        Cliente atual = null; // só p inicializar
        Conta conta = null; // só p inicializar

        for (Cliente cadaCliente : todos) {
            if (cadaCliente.getCpfCliente().equals(cpf)) {
                atual = cadaCliente;
            }
        }
        if (atual != null) {
            conta = new Conta("000-0" + idConta, atual, 0.0);
            idConta++;
        } else {

            clearScreen();
            return null;
        }

        clearScreen();
        return conta;
    }

    
}
