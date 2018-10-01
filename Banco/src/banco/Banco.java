/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import static banco.Cliente.cadastrarCliente;
import static banco.Conta.cadastrarConta;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author eduardo.schneider
 */
public class Banco {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.lang.InterruptedException
     */
    
    @SuppressWarnings("ResultOfObjectAllocationIgnored") //só pra warning não encher o saco (:
    public static void main(String[] args) throws IOException, InterruptedException, ParseException {
        new Banco();
    }

    public static void clearScreen() {
        for (int i = 0; i < 20; i++) {
            System.out.println(" ");
        }
    }

    private Banco() throws InterruptedException, ParseException {
        Date dataDeHoje = new Date();
        int idCliente = 5;
        int idConta = 5;
        Helper help = new Helper();
        Conta contaAtual = new Conta();
        Poupanca poupancaAtual = new Poupanca();
        List<Cliente> clientes = new ArrayList();
        List<Conta> contas = new ArrayList();
        List<Poupanca> poupancas = new ArrayList();
        List<Poupanca_Extrato> poupancaMovimento = new ArrayList();
        List<Extrato> extratos = new ArrayList();
        int contadorPoupancaDepositos = 0;
        help.populaParaTestes(clientes, contas, poupancas, poupancaMovimento, extratos);
        clearScreen();

        int opcao = 0;

        Scanner leitor = new Scanner(System.in);
        while (opcao != 3) {
            opcao = help.perguntaTipo();
            switch (opcao) {
                case 1:
                    clearScreen();
                    while ((opcao != 12) && (opcao != 11)) {
                        help.showAdminMenu();
                        opcao = leitor.nextInt();
                        switch (opcao) {
                            case 1:
                                clearScreen();
                                clientes.add(Cliente.cadastrarCliente(idCliente));
                                idCliente++;
                                break;
                            case 2:
                                clearScreen();
                                Cliente.excluirCliente(clientes, contas);
                                break;
                            case 3:
                                clearScreen();
                                Cliente.alterarCliente(clientes);
                                break;
                            case 4:
                                clearScreen();
                                Cliente.pesquisarCliente(clientes);
                                break;
                            case 5:
                                clearScreen();
                                Conta.cadastrarConta(clientes,contas, idConta);
                                idConta++;
                                break;
                            case 6:
                                clearScreen();
                                Conta.excluirConta(contas);
                                break;
                            case 7:
                                clearScreen();
                                Conta.alterarConta(contas);
                                break;
                            case 8:
                                clearScreen();
                                Conta.pesquisarConta(contas);
                                break;
                            case 9:
                                clearScreen();
                                //cadastrar invstimentos
                                break;
                            case 10:
                                clearScreen();
                                dataDeHoje = help.incrementaDia(dataDeHoje);
                                Poupanca.verificaJuros(poupancas, poupancaMovimento, dataDeHoje);
                                break;
                            case 11:
                                clearScreen();
                                /////////////////
                                ///V O L T A R///
                                /////////////////
                                break;
                            case 12:
                                System.out.println("Obrigado por utilizar o banco!");
                                break;
                            case 13:
                            if (poupancaAtual != null)
                                poupancaAtual.printaDepositos(poupancaMovimento);
                            break;
                            default:
                                System.out.println("Digite uma opção válida.");
                                break;
                        }
                    }
                    clearScreen();
                    break;
                case 2:
                    clearScreen();
                    if ((contaAtual = Conta.perguntaUsuario(contas)) != null) {
                        poupancaAtual = Poupanca.checaExistenciaDePoupanca(contaAtual.getCliente(), poupancas);
                        clearScreen();
                        while ((opcao != 11) && (opcao != 12)) {
                            help.showNormalMenu();
                            opcao = leitor.nextInt();
                            switch (opcao) {
                                case 1:
                                    clearScreen();              
                                    contaAtual.depositar(contas, extratos);
                                    break;
                                case 2:
                                    clearScreen();
                                    contaAtual.pagarBoleto(extratos);
                                    break;
                                case 3:
                                    clearScreen();
                                    contaAtual.retirarExtrato(extratos);
                                    break;
                                case 4:
                                    clearScreen();
                                    Extrato saque = contaAtual.sacar(contaAtual);
                                    if (saque != null) {
                                        extratos.add(saque);
                                    }
                                    break;
                                case 5:
                                    clearScreen();
                                    //CDB
                                    break;
                                case 6:
                                    clearScreen();
                                    contaAtual.consultarSaldo();
                                    break;
                                case 7:
                                    clearScreen();
                                    //Investimentos
                                    break;
                                case 8:
                                    clearScreen();
                                    contaAtual.transferir(contas, extratos);
                                    break;
                                case 9:
                                    clearScreen();
                                    
                                    Poupanca.depositarPoupanca(contaAtual, poupancas, extratos, poupancaMovimento, contadorPoupancaDepositos);
                                    contadorPoupancaDepositos++;
                                    break;
                                case 10:
                                    clearScreen();
                                    if (poupancaAtual != null) 
                                        poupancaAtual.sacarPoupanca(poupancaMovimento);
                                    else
                                        System.out.println("Você não possui uma conta poupança.");
                                case 11:
                                    clearScreen();
                                    /////////////////
                                    ///V O L T A R///
                                    /////////////////
                                    break;
                                case 12:
                                    System.out.println("Obrigado por utilizar o banco!");
                                    break;
                                case 13:
                                    clearScreen();
                                    if (poupancaAtual != null)
                                        poupancaAtual.printSaldo();
                                    break;
                                default:
                                    System.out.println("Digite uma opção válida!");
                                    break;
                            }
                        }
                    }
                    clearScreen();
                    break;
                default:
                    System.out.println("Digite uma opção válida!");
                    break;
            }
        }
    }
}
