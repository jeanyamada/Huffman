/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author Usuario
 */
public class Simbolo {
    private String str;
    private int frequencia;
    private String codigo;
    private Simbolo esq;
    private Simbolo dir;
            
    public Simbolo(String s,int frequencia,Simbolo esq,Simbolo dir){
        this.str = s;
        this.frequencia = frequencia;
        this.esq = esq;
        this.dir = dir;
        this.codigo = "";
    }
    
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public String getCodigo(){
        return codigo;
    }

    /**
     * @return the str
     */
    public String getStr() {
        return str;
    }

    /**
     * @param str the str to set
     */
    public void setStr(String str) {
        this.str = str;
    }

    /**
     * @return the frequencia
     */
    public int getFrequencia() {
        return frequencia;
    }

    /**
     * @param frequencia the frequencia to set
     */
    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }

    /**
     * @return the esq
     */
    public Simbolo getEsq() {
        return esq;
    }

    /**
     * @param esq the esq to set
     */
    public void setEsq(Simbolo esq) {
        this.esq = esq;
    }

    /**
     * @return the dir
     */
    public Simbolo getDir() {
        return dir;
    }

    /**
     * @param dir the dir to set
     */
    public void setDir(Simbolo dir) {
        this.dir = dir;
    }
}
