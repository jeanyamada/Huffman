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
public class MochilaBooleana {
    
    int capacidade;
    ArrayList<ItemMochila> solucao = new ArrayList();
    ArrayList<ItemMochila> itens;
    int MValor[][];
    short MSolucao[][];
    
    public MochilaBooleana(ItemMochila itens[], int capacidade){
        // Antes de construir as matrizes, há um pré-processamento para retirar
        // os itens mais pesados que a mochila, diminuindo o tamanho necessário 
        // para as matrizes       
        this.itens = removeMaisPesados(itens, capacidade);
        this.capacidade = capacidade;
        MValor = new int[this.itens.size()+1][capacidade+1];
        MSolucao = new short[this.itens.size()+1][capacidade+1];
         /*  Inicializando as linhas e colunas das matrizes com 0.   */
        for(int k=0; k <= this.itens.size(); k++){            
            MValor[k][0] = 0;            
            MSolucao[k][0] = 0;
        }
        for(int k=0; k <= capacidade; k++){
            MValor[0][k] = 0;
            MSolucao[0][k] = 0;
        }
    }
    
    
    public ArrayList<ItemMochila> efetuaCombinacao(){
        /*  Dada uma lista de items, escolher um ou mais items tais que
        a soma desses valores seja a maior de todas as combinações possíveis.

        Técnica: Programação Dinâmica
        */    
        int i=1,j=1;

        while(i <= itens.size()){
            j=1;
            while(j < itens.get(i-1).getPeso()){
                if(MValor[i-1][j] > 0) MValor[i][j] = MValor[i-1][j];
                else MValor[i][j] = 0;
                j++;
            }
            while(j <= capacidade){
                int v1 = MValor[i-1][j-itens.get(i-1).getPeso()]+itens.get(i-1).getValor(),
                v2 = MValor[i-1][j];

                if(v1 < v2){
                    MValor[i][j] = v2;
                    MSolucao[i][j] = 0;
                }
                else{
                    MValor[i][j] = v1;
                    MSolucao[i][j] = 1;
                }
                j++;
            }
            i++;
        }

        ArrayList<ItemMochila> solucao = new ArrayList();
        i--;  j--;
        while(i > 0){
            if(MSolucao[i][j] == 1){
                // Adiciona à mochila, e reajusta a coluna
                solucao.add(itens.get(i-1));
                j -= itens.get(i-1).getPeso();                
            }
            i--;            
        }
        return solucao;
    }

    private ArrayList<ItemMochila> removeMaisPesados(ItemMochila itens[], int capacidade){
        // Remove os itens que não podem ser colocados na mochila, 
        // Retornando um arraylist sem estes itens
        ArrayList<ItemMochila> novosItens = new ArrayList();
        for(ItemMochila item: itens){
            if(item.getPeso() <= capacidade){
                novosItens.add(item);
            }
        }
        return novosItens;
    }
    
}
