/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa;

/**
 *
 * @author 20171pf.cc0178
 */
public class Threads1 {
    public static void main(String[] args) {
        Runnable tarefa1 = new Tarefa("1");
        Runnable tarefa2 = new Tarefa("2");
        Tarefa tarefa3 = new Tarefa("3");
        Runnable outraTarefa = tarefa3;
        
        Thread th1 = new Thread(tarefa1, "thread1");
        Thread th2 = new Thread(tarefa2, "thread2");
        
        th1.start();
        th2.start();
        
    }
}
