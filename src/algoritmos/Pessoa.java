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
public class Pessoa {
    private int id; // Corresponde à linha na tabela
    private int custos[]; // Armazena o custo para que essa pessoa realize cada tarefa
    private boolean associada;

    public Pessoa(int id, int custos[]){
        this.id = id;
        this.custos = new int[custos.length];
        for(int i=0; i < custos.length; i++){
            this.custos[i] = custos[i];
        }
        this.associada = false;
    }
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the associada
     */
    public boolean isAssociada() {
        return associada;
    }

    /**
     * @param associada the associada to set
     */
    public void setAssociada(boolean associada) {
        this.associada = associada;
    }
    
    public int getCustoTarefa(int idTarefa){
        // Retorna o custo da tarefa 1, 2, 3, etc.
        return custos[idTarefa];
    }
}
