package aula4;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class PriorityQueueAula4 {
    public static void main(String[] args) {
        //              E = String
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(); // criar a priority queue

        //            add(E e) -> String item
        priorityQueue.add("A");//adiciona itens a priority queue
        priorityQueue.add("C");
        priorityQueue.add("Z");
        priorityQueue.add("AXA");
        priorityQueue.add("WAA");
        priorityQueue.add("B");
        priorityQueue.add("AASDAW");

        System.out.println(priorityQueue); //visualiza os item da fila fora de ordem

        // separando o tamanho da fila, porque a fila fica menor a cada poll realizado
        int length = priorityQueue.size();

        for(int i =0; i < length; i++){ // loop pela fila
            //retornar e remover os itens da fila, ela retorna os items ordenados
            System.out.println(priorityQueue.poll());
        }


        ArrayList<String> lista = new ArrayList<>();
        lista.add("Valor 1");
        lista.add("Valor 2");
        lista.add("Valor 3");
        for (String item: lista){
            System.out.println(item);
        }
    }
}
