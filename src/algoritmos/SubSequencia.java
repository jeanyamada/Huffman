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
public class SubSequencia {
    String cadeiaA;
    String cadeiaB;
    String solucao;
    Integer matrizSoma[][];
    Character matrizDirecao[][];
    
    public SubSequencia(String strA,String strB){
        cadeiaA = strA;
        cadeiaB = strB;
        solucao = "";
        matrizSoma = new Integer[cadeiaA.length()+1][cadeiaB.length()+1];
        matrizDirecao = new Character[cadeiaA.length()+1][cadeiaB.length()+1];
        
        // O construtor já inicializa as matrizes com 0 e \0
        for(int lin=0; lin<=cadeiaA.length(); lin++){
            matrizSoma[lin][0] = 0;
            matrizDirecao[lin][0] = '\0';
        }
        for(int col=1;col<=cadeiaB.length();col++){
            matrizSoma[0][col] = 0;
            matrizDirecao[0][col] = '\0';
        }
    }
    
    public String encontraSubsequencia(){
        // Compara as duas strings e retorna a subsequência máxima comum entre elas
        
        // A matriz de caracteres receberá nulo para as posições (0,*) e (*,0), 'c' quando a soma vier de cima, 'e' quando
        // a soma vier da esquerda, e 'd' quando a soma vier da diagonal superior esquerda
        
        for(int i=1; i<=cadeiaA.length(); i++){
            for(int j=1; j<=cadeiaB.length(); j++){
                if(cadeiaA.charAt(i-1) == cadeiaB.charAt(j-1)){
                    matrizSoma[i][j] = matrizSoma[i-1][j-1] + 1;
                    matrizDirecao[i][j] = 'd';
                }
                else{
                    // Verifica qual é maior, a solução de cima ou da esquerda, se forem iguais pega a de cima
                    if(matrizSoma[i-1][j] >= matrizSoma[i][j-1]){
                        // Se a de cima é maior ou igual a da esquerda
                        matrizSoma[i][j] = matrizSoma[i-1][j];
                        matrizDirecao[i][j] = 'c';
                    }
                    else{
                        matrizSoma[i][j] = matrizSoma[i][j-1];
                        matrizDirecao[i][j] = 'e';
                    }
                }
            }
        }
        
        // Agora busca a solução
        int linha = cadeiaA.length();
        int coluna = cadeiaB.length();
        while(matrizDirecao[linha][coluna] != '\0'){
            if(matrizDirecao[linha][coluna] == 'd'){
                solucao += cadeiaA.charAt(linha-1);
                linha -= 1;
                coluna -= 1;
            }
            else if(matrizDirecao[linha][coluna] == 'c') linha -=1;
            else coluna -= 1;
        }
        solucao = inverteString(solucao);
        
        return solucao;
        
    }
    
    private static String inverteString(String original){
        String nova = "";
        for(int i=0;i<original.length();i++){
            nova += original.charAt(original.length()-1-i);
        }
        return nova;
    }
    
}
