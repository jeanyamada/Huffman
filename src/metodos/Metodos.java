/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import com.sun.scenario.effect.Merge;

/**
 *
 * @author deadlock
 */
public class Metodos {

    public static String multMatriz(Integer [] d){
        
        Integer size = d.length-1;
        
        Integer [][] m = new Integer[size][size];
        Integer [][] s = new Integer[size][size];
        
        for(int i = 0;i < size;i++){
            for(int j = 0;j <size;j++){
                m[i][j] = 0;
                s[i][j] = 0;
            }

        }       

        int j = 0;
                
        
        for(int h = 1;h < size;h++)
            for(int i = 1;i <= size - h;i++){
                
                j = i+h;
                
                m[i-1][j-1] = Integer.MAX_VALUE;
                
                for(int k = i;k < j;k++){
                    
                    Integer temp = m[i-1][k-1] + m[k][j-1] + (d[i-1]*d[k]*d[j]);
                    
                    if(temp < m[i-1][j-1]){
                        m[i-1][j-1] = temp;
                        s[i-1][j-1] = k;
                    }
                 }
            }
        
        String out = "Numero de multiplicacoes: "+ Integer.toString(m[0][size-1]);
        out += "\n\nOrdem de associatividade: ";
        
        //System.out.println(m[0][size-1]);
        out +=printMatriz(s,0,size-1);
        
        return out;
    }
    
    
    

    public static String printMatriz(Integer[][] matriz,int i,int j){
        String out = "";
        
       if(i == j){
           out += " M"+(i+1)+" ";
           return out;
       }
       else{
            out+= "( ";
            out += printMatriz(matriz, i,matriz[i][j]-1);
            out += printMatriz(matriz,matriz[i][j],j);
            out+=" )";
       }
       return out;
    }
    
    public static Float [] mochilaFracionaria(Float [] peso,Float [] valor,Float carga){
        Float [] x = new Float [peso.length];
        
        for(int j = peso.length-1;j >=0 ;j--){
            if(peso[j] <= carga){
                x[j] = 1.0F;
                carga = carga - peso[j];                
            }
            else{
                x[j] = carga/peso[j];
                carga = 0.0F;
            }
        }
        
        return x;
        
    }
}
