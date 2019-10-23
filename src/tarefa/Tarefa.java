/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa;

import java.util.ArrayList;

/**
 *
 * @author 20171pf.cc0178
 */
public class Tarefa implements Runnable {

    private String nome;
    private int min;
    private int max;
    private ArrayList<Integer> contagem = new ArrayList<>();
    private ArrayList<Integer> primo = new ArrayList<>();
    Tarefa tarefaAmiga;

    public Tarefa(String nome, int min, int max) {
        this.nome = nome;
        this.min = min;
        this.max = max;
    }
    
    
    @Override
    public void run() {
        fazContagem();
    }
    
    public void fazUmaCoisa(){
        System.out.println("Pois não");
    }
    
    private void fazContagem(){
        for(int cont = min; cont < max; cont++) {
            contagem.add(cont);
            isPrimo(cont);
        }
    }
    
    protected void listaContagem(){
        for(int cont : contagem)
            System.out.println("Tarefa " + nome + " | contagem " + cont);
    }
    
    protected void listaPrimo(){
        for(int cont : primo)
            System.out.println("Tarefa " + nome + " | contagem " + cont);
    }

    private void isPrimo(int valor){
        for(int i = valor / 2; i > 1; i--) {
            if (valor % i == 0)
                return;
        }
        primo.add(valor);
    }
}
