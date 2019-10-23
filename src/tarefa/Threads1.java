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
public class Threads1 {
    public static void main(String[] args) {
        
        /*Divisão das tarefas*/
        int trabalho = 100;
        int tarefas = 10;
        
        if(trabalho % tarefas != 0) {
            System.out.println("Divisão de tarefas não é exata.");
            System.exit(0);
        }
        int fatia = trabalho / tarefas;
        int min = 0, max;
        
        ArrayList<Tarefa> listaTarefa = new ArrayList<>();
        ArrayList<Thread> listaThreads = new ArrayList<>();
        /*Escalonamento das tarefas*/
        for (int i = 0; i < tarefas; i++) {
            max = min + fatia;
            if(max > trabalho)
                max = trabalho;
            Tarefa t = new Tarefa(String.valueOf(i), min, max);
            listaTarefa.add(t);
            min = max + 1;
            
            Thread th = new Thread(t, "thread"+i);
            listaThreads.add(th);
            th.start();
        }
        System.out.println("Minimo: " + listaTarefa.get(5).getMin());
    }
}
