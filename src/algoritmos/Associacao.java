/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

/**
 *
 * @author rafae
 */
public class Associacao {
    private Pessoa pessoa;
    int tarefa;
    
    public Associacao(Pessoa P, int tarefa){
        this.pessoa = P;
        this.tarefa = tarefa;
    }

    /**
     * @return the pessoa
     */
    public Pessoa getPessoa() {
        return pessoa;
    }

    /**
     * @param pessoa the pessoa to set
     */
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    /**
     * @return the tarefa
     */
    public int getTarefa() {
        return tarefa;
    }

    /**
     * @param tarefa the tarefa to set
     */
    public void setTarefa(int tarefa) {
        this.tarefa = tarefa;
    }
}
