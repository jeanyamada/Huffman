package algoritmos;

public class ItemMochila{

    private String nome;
    private int peso;
    private int valor;
    
    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    public ItemMochila(String nome, int peso, int valor) {
        this.nome = nome;
        this.peso = peso;
        this.valor = valor;
    }
    

    public int getPeso(){
        return peso;
    }
    public int getValor(){
        return valor;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
}
