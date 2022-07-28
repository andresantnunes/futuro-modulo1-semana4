package aula4;

import java.util.LinkedList;
import java.util.Queue;

public class QueueAula4 {
    public static void main(String[] args) {
        // Queue pode receber LinkedList, PriorityQueue, ArrayDequeue
        Queue<String> queue = new LinkedList<>();
        queue.add("Item 1"); //adiciona um item a fila (inicio)
        queue.add("Item 2"); //adiciona um item a fila (segunda posição)
        queue.add("Item 3"); //adiciona um item a fila (terceira posição)
        queue.add("Item 4"); //adiciona um item a fila (quarta posição)

        System.out.println(queue);
        String primeiroItem = queue.poll(); // retornar e remover o primerio item da fila
        System.out.println("Primeiro item: "+primeiroItem);
        System.out.println(queue);
        primeiroItem = queue.poll(); // retornar e remover o primerio item da fila
        System.out.println("Primeiro item: "+primeiroItem);
        System.out.println(queue);

        // retorna o primerio item da fila sem remover
        String primeiroItemSemRemover = queue.peek();
        System.out.println("Primeiro item sem remover: "+primeiroItemSemRemover);
        System.out.println(queue);
        //faz a mesma coisa que o peak, porém ele dá erro se a fila está vazia
        System.out.println("Primeiro item sem remover" +
                ", com erro se a fila for vazia: "
                +queue.element());


    }
}
