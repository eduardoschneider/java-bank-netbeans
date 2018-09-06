/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author eduardo.schneider
 */
public class Banco {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        metodoPrincipal();
    }
    
    public static void clearScreen(){
        for (int i = 0; i < 30; i++)
        {
            System.out.println(" ");
        }
    }
    
    public static void showAdminMenu(){
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
    
    public static void showNormalMenu(){
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

    private static void metodoPrincipal() {
        clearScreen();
        System.out.println("------------------------------------------------------");
        System.out.println("Digite o tipo de usuário que você gostaria de acessar:\n");
        System.out.println("1- Administrador");
        System.out.println("2- Usuário Normal\n");    
        System.out.println("------------------------------------------------------");

        Scanner leitor = new Scanner(System.in);
        int opcao = leitor.nextInt();

        switch (opcao) {
            case 1:
                clearScreen();
                showAdminMenu();
                opcao = leitor.nextInt();
                switch (opcao){
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
                    
                default:System.out.println("Digite uma opção válida.");
                break;
                }
            break;
            case 2:
                Conta usuario = new Conta();
                clearScreen();
                showNormalMenu();
                opcao = leitor.nextInt();
                switch (opcao){
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
                    break;
            default:
                System.out.println("Digite uma opção válida!");
                break;
            }
            break;
            default:System.out.println("Digite uma opção válida!");
            break;
        } 
    }
}
