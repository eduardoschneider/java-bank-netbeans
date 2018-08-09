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
        System.out.println("Digite o tipo de usuário que você gostaria de acessar:\n");
        System.out.println("1- Administrador");
        System.out.println("2- Usuário Normal\n");

        Scanner leitor = new Scanner(System.in);
        int opcao = 0;
        opcao = leitor.nextInt();

        if (opcao == 1) {
            clearScreen();
        } else if (opcao == 2) {
            System.out.println("NORMAL");
        } else {
            System.out.println("Digite uma opção válida!");        
        }
    }
    
    public static void clearScreen(){
        for (int i = 0; i < 50; i++)
        {
            System.out.println(" ");
        }
    }
}
