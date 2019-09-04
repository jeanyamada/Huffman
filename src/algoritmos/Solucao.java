/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

import java.util.ArrayList;

/**
 *
 * @author rafae
 */
public class Solucao {
    private ArrayList<Associacao> associacoes;
    private int custo; // Custo total da solução
    private boolean valida; // Indica se já foi encontrada alguma solução
    
    public Solucao(){
        this.custo = Integer.MAX_VALUE;
        associacoes = null;
        valida = false;
    }

    public Solucao(ArrayList<Associacao> associacoes, int custo){
        this.associacoes = (ArrayList<Associacao>)associacoes.clone();
        this.custo = custo;
        valida = true;
    }
    
    /**
     * @return the associacoes
     */
    public ArrayList<Associacao> getAssociacoes() {
        return associacoes;
    }

    /**
     * @param associacoes the associacoes to set
     */
    public void setSolucao(ArrayList<Associacao> associacoes,int custo) {
        ArrayList<Associacao> solucao = (ArrayList<Associacao>)associacoes.clone();
        this.associacoes = solucao;
        this.custo = custo;
    }

    /**
     * @return the custo
     */
    public int getCusto() {
        return custo;
    }

    /**
     * @param custo the custo to set
     */
    public void setCusto(int custo) {
        this.custo = custo;
    }

    /**
     * @return the valida
     */
    public boolean isValida() {
        return valida;
    }

    /**
     * @param valida the valida to set
     */
    public void setValida(boolean valida) {
        this.valida = valida;
    }
    
}
