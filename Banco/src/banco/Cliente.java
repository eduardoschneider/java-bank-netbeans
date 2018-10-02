/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import static banco.Helper.clearScreen;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author eduardo.schneider
 */
public class Cliente {
    private int idCliente;
    private String nomeCliente;
    private String cpfCliente;
    private Date dataNasc;

    public Cliente(int idCliente, String nomeCliente, String cpfCliente, Date dataNasc) {
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.dataNasc = dataNasc;
    }

   public Cliente(){}

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public Date getDataNasc() {
        return dataNasc;
    }
    
    public String getDataNascString() throws ParseException {
        DateFormat targetFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String str = targetFormat.format(dataNasc);
        
        return str;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }
    
    public static Cliente cadastrarCliente(int idCliente) {
        System.out.println("Digite o nome do cliente\n");
        Scanner leitor = new Scanner(System.in);
        String nome = leitor.nextLine();

        System.out.println("Digite o CPF do cliente\n");
        String cpf = leitor.next();

        Cliente cliente = new Cliente(idCliente, nome, cpf, new Date());
        clearScreen();

        return cliente;
    }
    
    public static void excluirCliente(List<Cliente> clientes, List<Conta> contas){
        System.out.println("Digite o CPF do cliente que deseja excluir:\n");
        Scanner leitor = new Scanner(System.in);
        String cpf = leitor.next();
        boolean achouCliente = false;
        boolean achouConta = false;
        for (Cliente c : clientes){
            System.out.println(c.getCpfCliente());
            if ((c.getCpfCliente()).equals(cpf)){
                achouCliente = true;
                for (Conta co : contas){
                    if (((co.getCliente().getCpfCliente())).equals(cpf)){
                        achouConta = true;
                    }
                }
            }
        }
        if (achouConta){
            System.out.println("Cliente possui conta, deseja excluir ambos? (S/N)");
            String resposta = leitor.next();
            
            if((resposta.equals("s")) || (resposta.equals("S")) || (resposta.equals("sim")) || (resposta.equals("SIM"))){
                for (Iterator<Conta> iter = contas.listIterator(); iter.hasNext(); ) {
                    Conta a = iter.next();
                    if (((a.getCliente().getCpfCliente())).equals(cpf)) {
                        iter.remove();
                    }
                }
                
                for (Iterator<Cliente> iter = clientes.listIterator(); iter.hasNext(); ) {
                    Cliente a = iter.next();
                    if ((a.getCpfCliente()).equals(cpf)) {
                        iter.remove();
                    }
                }
            }
        } else if (achouCliente && !achouConta){
            System.out.println("Cliente encontrado, deseja excluir? (S/N)");
            String resposta = leitor.next();
            
            if((resposta.equals("s")) || (resposta.equals("S")) || (resposta.equals("sim")) || (resposta.equals("SIM"))){
                for (Iterator<Cliente> iter = clientes.listIterator(); iter.hasNext(); ) {
                    Cliente a = iter.next();
                    if ((a.getCpfCliente()).equals(cpf)) {
                        iter.remove();
                    }
                }
            }
        }
    }
    
    public static void pesquisarCliente(List<Cliente> clientes) throws InterruptedException, ParseException {
        System.out.println("Digite o CPF a ser procurado:");
        Scanner leitor = new Scanner(System.in);
        String cpf = leitor.next();
        boolean achou = false;
        for (Cliente c : clientes){
            if((c.getCpfCliente()).equals(cpf)){
                clearScreen();
                System.out.println("ID: " + c.getIdCliente() + " - - NOME: " + c.getNomeCliente());
                System.out.println("CPF: " + c.getCpfCliente() + " - - DATA DE NASCIMENTO: " + c.getDataNasc());
                System.out.println("\n Retornando ao menu em 3 segundos...");
                Thread.sleep(4000);
                achou = true;
            }
        }
        if (!achou){
            System.out.println("Cliente não encontrado :(");
            Thread.sleep(2000);
        }
    }
    
    public static Cliente alterarCliente(List<Cliente> clientes) throws InterruptedException, ParseException{
        
        System.out.println("Digite o CPF do cliente que deseja pesquisar:\n");
        Scanner leitor = new Scanner(System.in);
        String cpf = leitor.next();
        clearScreen();
        Cliente cliente = null;
        boolean achouCliente = false;
        for (Cliente co : clientes) {
            if (((co.getCpfCliente())).equals(cpf)) {
                cliente = co;
                achouCliente = true;
            }
        }

        if (achouCliente) {
            System.out.println("CPF: " + cpf);
            System.out.println((cliente.getNomeCliente()));
            System.out.println((cliente.getDataNascString()));
            
            Thread.sleep(2500);
        } 
        else 
        {
            System.out.println("Cliente não encontrado.");
        }
        
        return new Cliente();
    }
}
