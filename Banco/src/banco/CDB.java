/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author eduardo.schneider
 */
public class CDB {

    private int id;
    private String nome;
    private BigDecimal saldo;
    private Date vencimento;

    public CDB(int id, String nome, BigDecimal saldo, Date data) {
        this.id = id;
        this.nome = nome;
        this.saldo = saldo;
        this.vencimento = data;
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

    public Date getVencimento() {
        return vencimento;
    }

    public void setVencimento(Date vencimento) {
        this.vencimento = vencimento;
    }
    
    public static void cadastrarCDB(List<CDB> cdbs, int idAtual) {
    
        System.out.println("Digite o nome do CDB:");
        Scanner leitor = new Scanner(System.in);
        String nome = leitor.next();
        
        System.out.println("Digite o prazo do CDB:");
        int vencimento = Integer.parseInt(leitor.next());
        
        Date venciment = new Date();
        Calendar c = Calendar.getInstance(); 
        c.setTime(venciment); 
        c.add(Calendar.DATE, 30);
        venciment = c.getTime();
        
        CDB cdb = new CDB(idAtual, nome, new BigDecimal("0.0"),venciment);
        cdbs.add(cdb);
    }
 
    public static void investirCDB(Conta contaAtual, List<CDB> cdbs, List<CDB_Extrato> cdbMovimento, int idDeposito) throws InterruptedException {
        System.out.println("Digite o código do CDB que deseja investir:");
        Scanner leitor = new Scanner(System.in);
        int codigo = Integer.parseInt(leitor.next());
        
        System.out.println("Digite o valor que deseja investir:");
        BigDecimal valor = new BigDecimal(leitor.next());
        
        if (contaAtual.getSaldo().compareTo(valor) > 0){
            CDB cdbAlvo = null;
            for (CDB cdb : cdbs){
                if (cdb.getId() == codigo){
                    cdbAlvo = cdb;
                }
            }
            if (cdbAlvo != null){
                cdbAlvo.setSaldo(cdbAlvo.getSaldo().add(valor));
                contaAtual.setSaldo(contaAtual.getSaldo().subtract(valor));
                CDB_Extrato movimento = new CDB_Extrato(idDeposito, cdbAlvo, contaAtual.getCliente(), valor, new Date(), true);
                cdbMovimento.add(movimento);
                System.out.println("Investimento realizado com sucesso!");
            }
            else
                System.out.println("CDB Inexistente, por favor, verifique o código digitado.");
            
        } 
        else 
            System.out.println("Saldo insuficiente para realizar a transação.");
        
        Thread.sleep(1500);
    }
    
    public static void verificaJuros(List<CDB> cdbs, List<Conta> contas, List<CDB_Extrato> cdbMovimento, Date dataDeHoje) {
        LocalDate localDate = dataDeHoje.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int month = localDate.getMonthValue();

        Taxas taxas = new Taxas();
        BigDecimal taxaAtual;
        if (month >= 7){
            taxaAtual = taxas.getSelicMensal()[month - 7];
        } else 
        {
            taxaAtual = taxas.getSelicMensal()[month + 5];
        }
        
        for (CDB cdb : cdbs){
            cdb.setSaldo(cdb.getSaldo().add(cdb.getSaldo().multiply(taxaAtual)));
            
            if (cdb.getVencimento().compareTo(dataDeHoje) == 0){ // vence hoje
                for (CDB_Extrato movimento : cdbMovimento){
                    if(movimento.getCdb() == cdb){ //movimento do CDB que venceu
                        for(Conta conta : contas){
                            if (movimento.getCliente() == conta.getCliente()){
                                conta.setSaldo(conta.getSaldo().add(movimento.getSaldo()));
                            }
                        }
                        for (Iterator<CDB_Extrato> iter = cdbMovimento.listIterator(); iter.hasNext();) {
                            CDB_Extrato a = iter.next();
                            if (a.getId() == movimento.getId())
                                iter.remove();
                        }
                    }
                }
 
                for (Iterator<CDB> iter = cdbs.listIterator(); iter.hasNext();) {
                    CDB a = iter.next();
                    if (a.getId() == cdb.getId())
                        iter.remove();
                }
            }
        }   
    }
}
