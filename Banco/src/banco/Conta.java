/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import static banco.Banco.clearScreen;
import static banco.Banco.contaAtual;
import java.math.BigDecimal;
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
    private BigDecimal saldo;

    public Conta(String codigoConta, Cliente cliente, BigDecimal saldo) {
        this.codigoConta = codigoConta;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public Conta() {
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

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
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

    public Extrato sacar(Conta contaAtual) {
        System.out.println("Digite o valor que deseja sacar:\n");
        Scanner leitor = new Scanner(System.in);
        BigDecimal valor = new BigDecimal(leitor.next());

        if ((contaAtual.getSaldo()).compareTo(valor) < 0) {
            System.out.println("Saldo insuficiente para realizar o saque.\n");
            return null;
        }

        contaAtual.setSaldo((contaAtual.getSaldo()).subtract(valor));
        Extrato extrato = new Extrato(new Date(), valor, false, contaAtual);

        return extrato;
    }

    public void consultarSaldo() {
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
            conta = new Conta("000-0" + idConta, atual, new BigDecimal("0.0"));
            idConta++;
        } else {

            clearScreen();
            return null;
        }

        clearScreen();
        return conta;
    }

    public boolean perguntaUsuario(List<Conta> todas, Poupanca poupancaAtual) {
        System.out.println("Digite sua conta\n");
        Scanner leitor = new Scanner(System.in);
        String conta = leitor.next();
        clearScreen();
        for (Conta cadaConta : todas) {
            if (cadaConta.getCodigoConta().equals(conta)) {
                contaAtual = cadaConta;
                poupancaAtual = Poupanca.checaExistenciaDePoupanca(contaAtual.getCliente());
                return true;
            }
        }
        return false;
    }

    public void retirarExtrato(List<Extrato> extratos) {
        clearScreen();
        for (Extrato e : extratos) {
            if ((e.getConta()).equals(this)) {
                System.out.println(e.getData() + " - " + e.getValorMexido() + " - " + (e.getConta().getCodigoConta()) + " - " + e.getTipoMovimento() + "\n");
            }
        }
    }

    public void transferir(List<Conta> contas, List<Extrato> extratos) {
        clearScreen();
        System.out.println("Digite a conta que deseja depositar");
        Scanner leitor = new Scanner(System.in);
        String contaProcurada = leitor.next();

        for (Conta c : contas) {
            if ((c.getCodigoConta()).equals(contaProcurada)) {
                boolean tipoMovimento = true;
                BigDecimal valor = new BigDecimal("-50.0");
                while (valor.compareTo(new BigDecimal("0.0")) < 0) {
                    System.out.println("\nDigite o valor que gostaria de transferir:\n");
                    leitor = new Scanner(System.in);
                    valor = new BigDecimal(leitor.next());
                    if (valor.compareTo(new BigDecimal("0.0")) < 0) {
                        System.out.println("É impossível realizar depósitos negativos!");
                    }
                }
                if (valor.compareTo(this.getSaldo()) > 0) {
                    System.out.println("Saldo insuficiente para realizar a transação.");
                } else {
                    this.setSaldo(this.getSaldo().subtract(valor));
                    c.setSaldo(c.getSaldo().add(valor));
                    Extrato extratoSaida = new Extrato(new Date(), valor, false, this);
                    Extrato extratoEntrada = new Extrato(new Date(), valor, true, c);
                    extratos.add(extratoSaida);
                    extratos.add(extratoEntrada);
                }
            }
        }
    }

    public void depositar(List<Conta> contas, List<Extrato> extratos) {
        clearScreen();
        System.out.println("\nDigite a conta que deseja depositar:\n");
        Scanner leitor = new Scanner(System.in);
        String contaProcurada = leitor.next();

        for (Conta c : contas) {
            if ((c.getCodigoConta()).equals(contaProcurada)) {
                BigDecimal valor = new BigDecimal("-50.0");
                while (valor.compareTo(new BigDecimal("0.0")) < 0) {
                    System.out.println("\nDigite o valor que gostaria de depositar:\n");
                    leitor = new Scanner(System.in);
                    valor = new BigDecimal(leitor.next());
                    if (valor.compareTo(new BigDecimal("0.0")) < 0) {
                        System.out.println("É impossível realizar depósitos negativos!");
                    }
                }
                c.setSaldo(c.getSaldo().add(valor));
                //Extrato extratoSaida = new Extrato(new Date(), valor, false, contaAtual);
                Extrato extratoEntrada = new Extrato(new Date(), valor, true, c);
                //extratos.add(extratoSaida);
                extratos.add(extratoEntrada);
            }
        }
    }
}
