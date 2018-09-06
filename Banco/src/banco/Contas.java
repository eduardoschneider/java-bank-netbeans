/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Alunos
 */
public class Contas {
    private Conta contas[];

    public Contas(){
        this.contas[0] = new Conta(1);
        this.contas[1] = new Conta(2);
        this.contas[2] = new Conta(3);
        this.contas[3] = new Conta(4);
        this.contas[4] = new Conta(5);
        this.contas[5] = new Conta(6);
        this.contas[6] = new Conta(7);
        this.contas[7] = new Conta(8);
    }
    
    public Conta[] getContas() {
        return contas;
    }

    public void setContas(Conta[] contas) {
        this.contas = contas;
    }
}
