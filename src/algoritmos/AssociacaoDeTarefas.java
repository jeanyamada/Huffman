/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author rafae
 */
public class AssociacaoDeTarefas {
    private Pessoa pessoas[];
    private Solucao solucao;
    Stack<Associacao> associacoes;
    private boolean tarefas[];
    
    public AssociacaoDeTarefas(Pessoa pessoas[], int numTarefas){
        // O construtor inicializa a solução parcial
        this.pessoas = pessoas;
        //
        tarefas = new boolean[numTarefas];
        for(boolean tarefa: tarefas){
            // Esse vetor indica se as tarefas estão livres ou não
            tarefa = false;
        }
        solucao = new Solucao();
        associacoes = new Stack<>();
    }
    
    public ArrayList<Associacao> efetuaAssociacoes(){
        // Retorna um arraylist com as associações correspondentes à solução ótima.        
        
        for(int i=0; i<tarefas.length; i++){
            // Inicialmente associa cada tarefa à pessoa 1 (0 no código), que é o 
            // ponto de partida para o percorrimento de todos os estados possíveis
            pessoas[0].setAssociada(true);
            tarefas[i] = true;
            Associacao associacao = new Associacao(pessoas[0],i);
            associacoes.push(associacao);
            associa();
            // Na volta, faz a desassociação
            pessoas[0].setAssociada(false);
            tarefas[i] = false;
            associacoes.pop();
        }
        
        return solucao.getAssociacoes();
    }
    
    private void associa(){
        /* Condições de parada:
            Se a associação atual tem todas as tarefas associadas, para e compara coma solução anterior.
            Caso ainda haja tarefas livres, verifica se a solução anterior (caso seja válida), é melhor do que 
            o custo parcial das associações atuais
            
        */
        if(associacoes.size() == tarefas.length){
            // Todas as tarefas foram associadas
            if(solucao.isValida()){
                // Se já tem solução válida, compara com a anterior
                if(custoParcial() < solucao.getCusto()){
                    // A nova solução é melhor, então substitui                    
                    solucao = new Solucao(pilha2ArrayList(),custoParcial());
                }
            }
            else{
                // Se não tem, é porque essa é a primeira solução encontrada
                solucao = new Solucao(pilha2ArrayList(),custoParcial());
            }
        }
        else{
            // Caso ainda tenha tarefas livres, só continua se o custo parcial
            // das associações atuais for menor do que o da solução anterior, ou
            // se não houver solução anterior
            if(!solucao.isValida() || (solucao.isValida() && custoParcial() < solucao.getCusto())){
                for(int indTarefa = 0; indTarefa<tarefas.length; indTarefa++){
                    if(tarefas[indTarefa] == false){ // Indica uma tarefa livre
                        for(Pessoa pessoa: pessoas){
                            if(!pessoa.isAssociada()){ // Só pega pessoas livres
                                pessoa.setAssociada(true);
                                tarefas[indTarefa] = true;
                                Associacao associacao = new Associacao(pessoas[pessoa.getId()],indTarefa);
                                associacoes.push(associacao);
                                associa(); // Busca a próxima associação
                                // Na volta deve desassociar
                                pessoa.setAssociada(false);
                                tarefas[indTarefa] = false;
                                associacoes.pop();
                            }
                        }
                    }
                }
            }
        }

        
    }
    
    private int custoParcial(){
        int custo = 0;
        Associacao associacao;
        for(int i=0; i<associacoes.size(); i++){
            associacao = associacoes.get(i);
            custo += associacao.getPessoa().getCustoTarefa(associacao.getTarefa());
        }
        return custo;
    }
    
    private ArrayList<Associacao> pilha2ArrayList(){
        // Retorna a pilha de associações como um ArrayList
        ArrayList<Associacao> solucao = new ArrayList();
        for(int i=0; i<associacoes.size(); i++){
            solucao.add(associacoes.get(i));
        }
        return solucao;
    }
}
