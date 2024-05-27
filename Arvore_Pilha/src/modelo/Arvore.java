package modelo;

public class Arvore {
    No raiz, atual;

    public No getRaiz() {
        return raiz;
    }

    public void setRaiz(No raiz) {
        this.raiz = raiz;
    }

    public No getAtual() {
        return atual;
    }

    public void setAtual(No atual) {
        this.atual = atual;
    }

    public void inserir(int valor){
        if(raiz == null){
            raiz = new No(null, null, valor);
        }
        else{
            atual = new No(null, null, valor);
            inserir(raiz, atual);
        }


    }
    public void inserir(No no, No atual){
        if(atual.getValor() < no.getValor()){
            if(no.getEsquerda() == null){
                no.setEsquerda(atual);
            }
            else{
                inserir(no.getEsquerda(), atual);
            }
        }
        else{
            if(no.getDireita() == null){
                no.setDireita(atual);
            }
            else{
                inserir(no.getDireita(), atual);
            }
        }
    }
    public void pre_ordem(No no){
        if(no != null){
            System.out.print(" " + no.getValor());
            pre_ordem(no.getEsquerda());
            pre_ordem(no.getDireita());
        }
    }
    public void pos_ordem(No no){
        if(no != null){
            pos_ordem(no.getEsquerda());
            pos_ordem(no.getDireita());
            System.out.print(" " + no.getValor());
        }
       
    }
    public void ordem(No no){
        if(no != null){
            ordem(no.getEsquerda());
            System.out.print(" " + no.getValor());
            ordem(no.getDireita());
        }
       
    }
    public void maiorValorArvore(No no){
        if(no.getDireita() == null){
            System.out.println(no.getValor());
        }
        else{
            maiorValorArvore(no.getDireita());
        }
    }
    public void menorValorArvore(No no){
        if(no.getEsquerda() == null){
            System.out.println(no.getValor());
        }
        else{
            menorValorArvore(no.getEsquerda());
        }
    }
    public int somaValores(No no, int valor){
        if(no == null){
            return 0;
        }
        int soma = no.getValor();
        soma+= somaValores(no.getDireita(), valor);
        soma+= somaValores(no.getEsquerda(), valor);
        return soma;
    }
    
}
