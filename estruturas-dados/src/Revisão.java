import java.util.*;

public class Revisão {
    public static void main(String[] args) {
        int[] array = new int[3]; // criando um novo array de tamanho fixo
        array[0] = 1; // adiciona o valor "1" na primeira posição
        array[1] = 2; // adiciona o valor "2" na segunda posição
        array[2] = 3; // adiciona o valor "3" na terceira posição
        int length = array.length; // retorna o tamanhao do array

        int[][] matriz = new int[3][3]; //criando uma matriz 3 linhas e 3 colunas, não pode ter mais posições
        matriz[0][0] = 100; // adiciona o valor 100 na intersecção da linha 0 e coluna 0
        matriz[0][1] = 101; // adiciona o valor 101 na intersecção da linha 0 e coluna 1
        matriz[0][2] = 102; // adiciona o valor 102 na intersecção da linha 0 e coluna 2
        matriz[1][0] = 102; // adiciona o valor 110 na intersecção da linha 1 e coluna 0
        matriz[1][1] = 111; // adiciona o valor 111 na intersecção da linha 1 e coluna 1
        matriz[1][2] = 112; // adiciona o valor 112 na intersecção da linha 1 e coluna 2
        // a última linha tem valor de zeros, que é o valor padrão
        int lengthMatriz1 = matriz.length;  //tamanho do primeiro array (linhas)
        int lengthMatriz2 = matriz[0].length; //tamanho do segundo array (colunas)

        String[][] matrizString = new String[2][2]; //cria uma matriz de 2 linhas e 2 colunas, o valor padrão é null
//        for(int linha = 0; linha<matrizString.length; linha++){ //loop pelas linhas
//            for (int coluna = 0; coluna<matrizString[0].length; coluna++){ // loop pelas colunhas de cada linha
//                System.out.println(matrizString[linha][coluna]);
//            }
//        }

        // Criando uma collection utilizando o ArrayList,
        // é utilizada para agregar todas as "filhas" de Collection
        Collection<Integer> collection = new ArrayList<>();
        collection.add(1); // adiciona o valor 1 ao fim da collection
        collection.add(2); // adiciona o valor 2 ao fim da collection
        collection.add(3); // adiciona o valor 3 ao fim da collection
        collection.add(14); // adiciona o valor 14 ao fim da collection
        int collectionLength = collection.size(); // retorna o valor do tamanho de casas da collection

        ArrayList<Integer> arrayListExemplo = new ArrayList<>(); // criando uma lista de exemplo
        arrayListExemplo.add(12); // adicionando um item a lista de exemplo
        arrayListExemplo.add(13); // adicionando um item a lista de exemplo
        arrayListExemplo.add(14); // adicionando um item a lista de exemplo

        collection.addAll(arrayListExemplo); // recebe uma collection(list(arrayList, LinkedList), set, queue) e copia todos os itens dele para dentro da collection
        collection.remove(1); // remover um item específico pelo valor
        collection.removeAll(arrayListExemplo); // remove todos os itens que tem os mesmos valor que a collection arrayExemplo
        System.out.println("Contains all collection:"+collection.containsAll(arrayListExemplo)); // verifica se uma collection tem todos os item da outra collection, se tiver os valore retorna true se não tiver retorna false
        System.out.println("Contains 2 na collection:"+collection.contains(2));// verifica se o valor 2 existe dentro da collection, se exister retora true, se não retorna false
        collection.clear(); // limpa a collection
        System.out.println(collection);


/*
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        int listLength = list.size();
        list.clear();
        list.addAll(list2);
        list.remove(1);
        list.removeAll(list2);
        list.isEmpty();
        list.contains(2);
        list.containsAll(list2);


        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        int arrayListLength = list.size();
        arrayList.clear();
        arrayList.addAll(list2);
        arrayList.remove(1);
        arrayList.removeAll(list2);
        arrayList.isEmpty();
        arrayList.contains(2);
        arrayList.containsAll(list2);
        arrayList.get(1); //
        arrayList.toArray();

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(1);
        linkedList.add(1);
        int linkedListLength = list.size();
        linkedList.clear();
        linkedList.addAll(list2);
        linkedList.remove(1);
        linkedList.removeAll(list2);
        linkedList.isEmpty();
        linkedList.contains(2);
        linkedList.containsAll(list2);
        linkedList.get(0);
        linkedList.getLast();
        linkedList.getFirst();
        linkedList.removeLast();
        linkedList.removeFirst();
        linkedList.removeFirstOccurrence(1);
        linkedList.removeLastOccurrence(1);
        linkedList.toArray();

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(2);
//        int listLength = set.size();
        set.clear();
        set.addAll(arrayList);
        set.remove(1);
        set.removeAll();
        set.contains();
        set.containsAll();


        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(1);
        hashSet.add(1);
//        int listLength = hashSet.size();
        hashSet.clear();
        hashSet.addAll();
        hashSet.remove(1);
        hashSet.removeAll();
        hashSet.contains();
        hashSet.containsAll();
        hashSet.clone(); // cria um clone vazio


        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(1);
        treeSet.add(1);
        int listLength = treeSet.size();
        treeSet.clear();
        treeSet.addAll();
        treeSet.remove(1);
        treeSet.removeAll();
        treeSet.descendingSet();
        treeSet.pollLast();
        treeSet.last();
        treeSet.pollFirst();
        treeSet.first();

        treeSet.ceiling();
        treeSet.floor();

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(1);
        queue.add(1);
        int listLength = queue.size();
        queue.clear();
        queue.addAll();
        queue.remove(1);
        queue.removeAll();
        queue.element();
        queue.poll();
        queue.peek();

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(1);
        priorityQueue.add(1);
        priorityQueue.add(1);
        int listLength = priorityQueue.size();
        priorityQueue.clear();
        priorityQueue.addAll();
        priorityQueue.remove(1);
        priorityQueue.removeAll();
        priorityQueue.element();
        priorityQueue.poll();
        priorityQueue.peek();

        Deque<Integer> deque = new LinkedList<>();
        deque.add(1);
        deque.add(1);
        deque.add(1);
        int listLength = priorityQueue.size();
        deque.clear();
        deque.addAll();
        deque.remove(1);
        deque.removeAll();
        deque.element();
        deque.peek();
        deque.peekFirst();
        deque.peekLast();
        deque.addFirst();
        deque.addLast();
        deque.removeFirst();
        deque.removeLast();
        deque.removeFirstOccurrence();
        deque.removeLastOccurrence();
        deque.poll();
        deque.pollFirst();
        deque.pollLast();


        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(1);
        arrayDeque.add(1);
        arrayDeque.add(1);
        int listLength = priorityQueue.size();
        arrayDeque.clear();
        arrayDeque.addAll();
        arrayDeque.remove(1);
        arrayDeque.removeAll();
        arrayDeque.element();
        arrayDeque.peek();
        arrayDeque.peekFirst();
        arrayDeque.peekLast();
        arrayDeque.addFirst();
        arrayDeque.addLast();
        arrayDeque.removeFirst();
        arrayDeque.removeLast();
        arrayDeque.removeFirstOccurrence();
        arrayDeque.removeLastOccurrence();
        arrayDeque.poll();
        arrayDeque.pollFirst();
        arrayDeque.pollLast();
        arrayDeque.toArray();


        Collections.sort(list);
        Collections.binarySearch(list,1);

        Collections.reverse(list);

*/
    }

}
