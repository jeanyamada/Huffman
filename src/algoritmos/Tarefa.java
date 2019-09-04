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
public class Tarefa {
    private int id; // O id corresponde à coluna na tabela
    private boolean associada;

    public Tarefa(int id, boolean associada){
        this.id = id;
        this.associada = associada;
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
}
