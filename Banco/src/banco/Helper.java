/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author eduardo.schneider
 */
public class Helper {
    
    public void showAdminMenu() {
        System.out.println("█████████████████████████████████");
        System.out.println("Selecione uma das opções administrativas:███████");
        System.out.println("████ CLIENTES           ████████████████");
        System.out.println("1- Cadastrar               ████████████████");
        System.out.println("2- Excluir                 ████████████████");
        System.out.println("3- Alterar                 ████████████████");
        System.out.println("4- Pesquisar               ████████████████");
        System.out.println("█████████████████████████████████");
        System.out.println("████ CONTAS             ████████████████");
        System.out.println("5- Cadastrar               ████████████████");
        System.out.println("6- Excluir                 ████████████████");
        System.out.println("7- Alterar                 ████████████████");
        System.out.println("8- Pesquisar               ████████████████");
        System.out.println("█████████████████████████████████");
        System.out.println("9- Cadastrar Investimentos ████████████████");
        System.out.println("10- Avançar o dia          ████████████████");
        System.out.println("11- Voltar                 ████████████████");
        System.out.println("12- Sair                   ████████████████");
        System.out.println("13- REGISTRO DE DEPOSITOS POUPANÇA1███████████");
        System.out.println("█████████████████████████████████");
    }

    public void showNormalMenu() {
        System.out.println("███████████████████████████████████");
        System.out.println("Selecione uma das opções:███████████████████");
        System.out.println("1- Depósito              ███████████████████");
        System.out.println("2- Pagamento             ███████████████████");
        System.out.println("3- Extrato               ███████████████████");
        System.out.println("4- Saque                 ███████████████████");
        System.out.println("5- CDB                   ███████████████████");
        System.out.println("6- Saldo                 ███████████████████");
        System.out.println("7- Investimento          ███████████████████");
        System.out.println("8- Transferência         ███████████████████");
        System.out.println("9- Depositar Poupança    ███████████████████");
        System.out.println("10- Sacar Poupança       ███████████████████");
        System.out.println("11- Voltar               ███████████████████");
        System.out.println("12- Sair                 ███████████████████");
        System.out.println("███████████████████████████████████");
    }

    public int perguntaTipo() {
        System.out.println("███████████████████████████████████");
        System.out.println("███████  BEM VINDO AO BANCO EM JAVA ☕ ████████");
        System.out.println("██████████████❗█████████████████████");
        System.out.println("Digite o tipo de usuário que você gostaria de acessar:\n");
        System.out.println("1- Administrador");
        System.out.println("2- Usuário Normal\n");
        System.out.println("███████████████████████████████████");

        Scanner leitor = new Scanner(System.in);
        int opcao = leitor.nextInt();

        return opcao;
    }
    
    public void populaParaTestes(List<Cliente> clientes, List<Conta> contas, List<Poupanca> poupancas, List<Poupanca_Extrato> poupancaMovimento, List<Extrato> extratos){
        
        Cliente cliente1 = new Cliente(0, "Eduardo Schneider111", "46483321805", new Date());
        Cliente cliente2 = new Cliente(1, "Eduardo Schneider222", "46483321806", new Date());
        Cliente cliente3 = new Cliente(2, "Eduardo Schneider333", "46483321807", new Date());
        Cliente cliente4 = new Cliente(3, "Eduardo Schneider444", "46483321808", new Date());
        Cliente cliente5 = new Cliente(4, "Eduardo Schneider555", "46483321809", new Date());
        Cliente cliente6 = new Cliente(4, "Eduardo Schneider666", "46483321810", new Date());
        Cliente cliente7 = new Cliente(4, "Eduardo Schneider777", "46483321811", new Date());
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);
        clientes.add(cliente5);
        clientes.add(cliente6);
        clientes.add(cliente7);
        
        Conta conta1 = new Conta("000-00", cliente1, new BigDecimal("500.0"));
        Conta conta2 = new Conta("000-01", cliente2, new BigDecimal("200.0"));
        Conta conta3 = new Conta("000-02", cliente3, new BigDecimal("300.0"));
        Conta conta4 = new Conta("000-03", cliente4, new BigDecimal("400.0"));
        Conta conta5 = new Conta("000-04", cliente5, new BigDecimal("100.0"));
        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);
        contas.add(conta4);
        contas.add(conta5);

        Poupanca poupanca1 = new Poupanca("0221", cliente1, new BigDecimal("0.0"));
        Poupanca poupanca5 = new Poupanca("4334", cliente5, new BigDecimal("0.0"));
        poupancas.add(poupanca1);
        poupancas.add(poupanca5);

        Extrato extratoSaida = new Extrato(new Date(), new BigDecimal("150.0"), false, conta1);
        extratos.add(extratoSaida);
        extratoSaida = new Extrato(new Date(), new BigDecimal("350.0"), false, conta1);
        extratos.add(extratoSaida);
    }
    
    public Date incrementaDia(Date data){
        System.out.println("Digite quantos dias quer avançar: (Um mês = 30)\n");
        Scanner leitor = new Scanner(System.in);
        int dia = Integer.parseInt(leitor.next());
        Calendar c = Calendar.getInstance(); 
        c.setTime(data); 
        c.add(Calendar.DATE, dia);
        data = c.getTime();
        
        return data;
    }
}
