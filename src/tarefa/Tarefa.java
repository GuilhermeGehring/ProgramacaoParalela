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
public class Tarefa implements Runnable {

    String nome;
    Tarefa tarefaAmiga;

    public Tarefa(String nome) {
        this.nome = nome;
    }
    
    @Override
    public void run() {
        System.out.println("Eu sou a tarefa " + nome);
    }
    
    public void fazUmaCoisa(){
        System.out.println("Pois não");
    }
}
