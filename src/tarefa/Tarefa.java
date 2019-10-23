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
        for(int cont = min; cont <= max; cont++)
            contagem.add(cont);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
}
