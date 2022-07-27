import java.util.LinkedList;

public class LinkedListAula3 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Andre"); // adiciona um item a lista
        linkedList.add("Gustavo");
        linkedList.add("Fabio");
        linkedList.add("Sophiye");

        System.out.println(linkedList.size()); // retorna o tamanho da lista
        System.out.println(linkedList.getFirst()); // pega o primeiro item da lista
        System.out.println(linkedList.getLast()); // pega o ultimo item da lista
        System.out.println(linkedList.get(2)); // pega uma item da lista pelo index

        linkedList.addFirst("Primeiro"); // adiciona um item na primira posição
        linkedList.addLast("Ultimo"); // adiciona um item na ultima posição
        System.out.println(linkedList);

    }
}
