package modelo;

public class No{
    No esquerda, direita;
    int valor; 


    
    public No(No esquerda, No direita, int valor) {
        this.esquerda = esquerda;
        this.direita = direita;
        this.valor = valor;
    }
    public No getEsquerda() {
        return esquerda;
    }
    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }
    public No getDireita() {
        return direita;
    }
    public void setDireita(No direita) {
        this.direita = direita;
    }
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }

    
}