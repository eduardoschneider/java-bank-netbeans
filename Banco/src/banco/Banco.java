/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import static banco.Cliente.cadastrarCliente;
import static banco.Conta.cadastrarConta;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author eduardo.schneider
 */
public class Banco {

    public static int idCliente = 5;
    public static int idConta = 5;
    public static int contadorPoupancaDepositos = 0;
    public static Conta contaAtual = new Conta();
    public static Poupanca poupancaAtual = new Poupanca();
    public static List<Cliente> clientes = new ArrayList();
    public static List<Conta> contas = new ArrayList();
    public static List<Poupanca> poupancas = new ArrayList();
    public static List<PoupancaDeposito> poupancaMovimento = new ArrayList();
    public static List<Extrato> extratos = new ArrayList();
    public static Helper help = new Helper();

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        metodoPrincipal();
    }

    public static void clearScreen() {
        for (int i = 0; i < 20; i++) {
            System.out.println(" ");
        }
    }

    private static void metodoPrincipal() {
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
                                clientes.add(cadastrarCliente(idCliente));
                                idCliente++;
                                break;
                            case 2:
                                //excluir cliente
                                break;
                            case 3:
                                //alterar cliente
                                break;
                            case 4:
                                //pesquisar cliente
                                break;
                            case 5:
                                contas.add(cadastrarConta(clientes, idConta));
                                idConta++;
                                break;
                            case 6:
                                //excluir conta
                                break;
                            case 7:
                                //alterar conta
                                break;
                            case 8:
                                //pesquisar conta
                                break;
                            case 9:
                                //cadastrar invstimentos
                                break;
                            case 10:
                                //avançar o dia
                                break;
                            case 11:
                                //voltar
                                break;
                            case 12:
                                System.out.println("Obrigado por utilizar o banco!");
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
                    if (contaAtual.perguntaUsuario(contas, poupancaAtual)) {
                        clearScreen();
                        while ((opcao != 11) && (opcao != 12)) {
                            help.showNormalMenu();
                            opcao = leitor.nextInt();
                            switch (opcao) {
                                case 1:
                                    contaAtual.depositar(contas, extratos);
                                    break;
                                case 2:
                                    //pagar();
                                    break;
                                case 3:
                                    contaAtual.retirarExtrato(extratos);
                                    break;
                                case 4:
                                    Extrato saque = contaAtual.sacar(contaAtual);
                                    if (saque != null) {
                                        extratos.add(saque);
                                    }
                                    break;
                                case 5:
                                    //CDB
                                    break;
                                case 6:
                                    contaAtual.consultarSaldo();
                                    break;
                                case 7:
                                    //Investimentos
                                    break;
                                case 8:
                                    contaAtual.transferir(contas, extratos);
                                    break;
                                case 9:
                                    if (poupancaAtual != null) {
                                        poupancaAtual.depositarPoupanca(contaAtual, extratos, poupancaMovimento, contadorPoupancaDepositos);
                                    }
                                    break;
                                case 10:
                                    if (poupancaAtual != null) //sacarPoupanca();
                                    {
                                        break;
                                    }
                                case 11:
                                    //VOltar
                                    break;
                                case 12:
                                    System.out.println("Obrigado por utilizar o banco!");
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
