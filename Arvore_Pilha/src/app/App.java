package app;

import modelo.Arvore;

public class App {
    public static void main(String[] args) {
        Arvore arvore = new Arvore();
        arvore.inserir(50);
        arvore.inserir(251);
        arvore.inserir(512);
        arvore.inserir(34);
        arvore.inserir(12);
        arvore.inserir(2);
        // System.out.println("Pré Ordem: \n");
        // arvore.pre_ordem(arvore.getRaiz());

        // System.out.println("Pós Ordem");
        // arvore.pos_ordem(arvore.getRaiz());

        // System.out.println("Ordem");
        // arvore.ordem(arvore.getRaiz());

        arvore.maiorValorArvore(arvore.getRaiz());
        arvore.menorValorArvore(arvore.getRaiz());
        System.out.println(arvore.somaValores(arvore.getRaiz(), 0));
    }
}
