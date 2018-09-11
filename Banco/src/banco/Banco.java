/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author eduardo.schneider
 */
public class Banco {
    protected static int idCliente = 5;
    protected static int idConta = 5;
    protected static Conta contaAtual = null;
    
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        metodoPrincipal();
    }

    public static void clearScreen() {
        for (int i = 0; i < 30; i++) {
            System.out.println(" ");
        }
    }

    public static void showAdminMenu() {
        System.out.println("------------------------------------------------------");
        System.out.println("Selecione uma das opções administrativas:");
        System.out.println("1- Cadastrar Clientes");
        System.out.println("2- Cadastrar Contas");
        System.out.println("3- Investimentos");
        System.out.println("4- Pesquisar Investimentos");
        System.out.println("5- Pesquisar Clientes");
        System.out.println("6- Pesquisar Contas");
        System.out.println("7- Avançar o dia");
        System.out.println("8- Voltar");
        System.out.println("9- Sair");
        System.out.println("------------------------------------------------------");
    }

    public static void showNormalMenu() {
        System.out.println("------------------------------------------------------");
        System.out.println("Selecione uma das opções:");
        System.out.println("1- Depósito");
        System.out.println("2- Pagamento");
        System.out.println("3- Extrato");
        System.out.println("4- Saque");
        System.out.println("5- CDB");
        System.out.println("6- Saldo");
        System.out.println("7- Investimento");
        System.out.println("8- Transferência");
        System.out.println("9- Voltar");
        System.out.println("10- Sair");
        System.out.println("------------------------------------------------------");
    }

    private static int perguntaTipo(){
        System.out.println("------------------------------------------------------");
        System.out.println("Digite o tipo de usuário que você gostaria de acessar:\n");
        System.out.println("1- Administrador");
        System.out.println("2- Usuário Normal\n");
        System.out.println("------------------------------------------------------");
        
        Scanner leitor = new Scanner(System.in);
        int opcao = leitor.nextInt();
        
        return opcao;
    }

    private static void metodoPrincipal() {
        Cliente cliente1 = new Cliente(0,"Eduardo Schneider111","464.833.218-05", new Date());
        Cliente cliente2 = new Cliente(1,"Eduardo Schneider222","464.833.218-05", new Date());
        Cliente cliente3 = new Cliente(2,"Eduardo Schneider333","464.833.218-05", new Date());
        Cliente cliente4 = new Cliente(3,"Eduardo Schneider444","464.833.218-05", new Date());
        Cliente cliente5 = new Cliente(4,"Eduardo Schneider555","464.833.218-05", new Date());
        List<Cliente> clientes = new ArrayList();
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);
        clientes.add(cliente5);
        
        Conta conta1 = new Conta("000-00", cliente1, 500.0);
        Conta conta2 = new Conta("000-01", cliente2, 200.0);
        Conta conta3 = new Conta("000-02", cliente3, 300.0);
        Conta conta4 = new Conta("000-03", cliente4, 400.0);
        Conta conta5 = new Conta("000-04", cliente5, 100.0);
        List<Conta> contas = new ArrayList();
        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);
        contas.add(conta4);
        contas.add(conta5);
        
        Poupanca poupanca1 = new Poupanca(0, cliente1 , 0.0);
        Poupanca poupanca2 = new Poupanca(1, cliente2 , 0.0);
        Poupanca poupanca3 = new Poupanca(2, cliente3 , 0.0);
        Poupanca poupanca4 = new Poupanca(3, cliente4 , 0.0);
        Poupanca poupanca5 = new Poupanca(4, cliente5 , 0.0);
        List<Poupanca> poupancas = new ArrayList();
        poupancas.add(poupanca1);
        poupancas.add(poupanca2);
        poupancas.add(poupanca3);
        poupancas.add(poupanca4);
        poupancas.add(poupanca5);
        
        List<Extrato> extratos = new ArrayList(); //lista de extratos
       
        clearScreen();
        
        int opcao = perguntaTipo();
        Scanner leitor = new Scanner(System.in);
        
        switch (opcao) {
            case 1:
                clearScreen();
                while (opcao != 9){
                showAdminMenu();
                opcao = leitor.nextInt();
                    switch (opcao) {
                        case 1:
                            clientes.add(cadastrarCliente());
                            break;
                        case 2:
                            contas.add(cadastrarConta(clientes));
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            break;
                        case 9:
                            System.out.println("Obrigado por utilizar o banco!");
                            break;
                        default:
                            System.out.println("Digite uma opção válida.");
                            break;
                    }
                }
                break;
            case 2:
                clearScreen();
                if (perguntaUsuario(contas)) {
                    clearScreen();
                    while (opcao != 10){
                    showNormalMenu();
                    opcao = leitor.nextInt();
                    switch (opcao) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            break;
                        case 9:
                            break;
                        case 10:
                            System.out.println("Obrigado por utilizar o banco!");
                            break;
                        default:
                            System.out.println("Digite uma opção válida!");
                            break;
                    }
                  }
                }
                break;
            default:
                System.out.println("Digite uma opção válida!");
                break;
        }
    }

    public static boolean perguntaUsuario(List<Conta> todas) {
        System.out.println("Digite sua conta\n");
        Scanner leitor = new Scanner(System.in);
        String conta = leitor.next();
        clearScreen();
        for(Conta cadaConta : todas){
            if (cadaConta.getCodigoConta().equals(conta)){
                contaAtual = cadaConta;
                return true;
            }
        }
        return false;
    }
  
    public static Cliente cadastrarCliente(){
        System.out.println("Digite o nome do cliente\n");
        Scanner leitor = new Scanner(System.in);
        String nome = leitor.next();
        
        System.out.println("Digite o CPF do cliente\n");
        String cpf = leitor.next();
        
        Cliente cliente = new Cliente(idCliente, nome, cpf, new Date());
        idCliente++;
        clearScreen();
        
        return cliente;
    }
    
    public static Conta cadastrarConta(List<Cliente> todos){
        System.out.println("Digite o CPF\n");
        Scanner leitor = new Scanner(System.in);
        String cpf = leitor.next();
        
        Cliente atual = null; // só p inicializar
        Conta conta = null; // só p inicializar
        
        for(Cliente cadaCliente : todos){
           if (cadaCliente.getCpfCliente().equals(cpf)){
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
