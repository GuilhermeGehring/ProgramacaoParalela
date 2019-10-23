/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 20171pf.cc0178
 */
public class Threads1 {
    public static void main(String[] args) throws InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Informe a quantidade de processos utilizados: ");
        /*Divisão das tarefas*/
        int tarefas = leitura.nextInt();
        int trabalho = 100;
        
        if(trabalho % tarefas != 0) {
            System.out.println("Divisão de tarefas não é exata.");
            System.exit(0);
        }
        int fatia = trabalho / tarefas;
        int min = 1, max;
        
        ArrayList<Tarefa> listaTarefa = new ArrayList<>();
        ArrayList<Thread> listaThreads = new ArrayList<>();
        /*Escalonamento das tarefas*/
        for (int i = 0; i < tarefas; i++) {
            max = min + fatia;
            if(max > trabalho)
                max = trabalho + 1;
            Tarefa t = new Tarefa(String.valueOf(i), min, max);
            listaTarefa.add(t);
            min = max;
            
            Thread th = new Thread(t, "thread"+i);
            listaThreads.add(th);
            th.start();
        }
        
        for (Thread thread : listaThreads)
            thread.join();
        
        for (Tarefa tarefa : listaTarefa) {
//            tarefa.listaContagem();       
            tarefa.listaPrimo();       
        }
        
        System.exit(0);
    }
}
