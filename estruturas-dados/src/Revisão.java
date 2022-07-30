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
        collection.add(1); // adiciona o valor 1 ao fim da collection, apenas adiciona por valor
        collection.add(2); // adiciona o valor 2 ao fim da collection
        collection.add(3); // adiciona o valor 3 ao fim da collection
        collection.add(14); // adiciona o valor 14 ao fim da collection
        int collectionLength = collection.size(); // retorna o valor do tamanho de casas da collection

        ArrayList<Integer> arrayListExemplo = new ArrayList<>(); // criando uma lista de exemplo
        arrayListExemplo.add(12); // adicionando um item a lista de exemplo
        arrayListExemplo.add(13); // adicionando um item a lista de exemplo
        arrayListExemplo.add(14); // adicionando um item a lista de exemplo

        Object[] arrayDaCollection = collection.toArray(); // todas as collection podem ser transformadas em array

        collection.addAll(arrayListExemplo); // recebe uma collection(list(arrayList, LinkedList), set, queue) e copia todos os itens dele para dentro da collection
        collection.remove(1); // remover um item específico pelo valor
        collection.removeAll(arrayListExemplo); // remove todos os itens que tem os mesmos valor que a collection arrayExemplo
//        System.out.println("Contains all collection:"+collection.containsAll(arrayListExemplo)); // verifica se uma collection tem todos os item da outra collection, se tiver os valore retorna true se não tiver retorna false
//        System.out.println("Contains 2 na collection:"+collection.contains(2));// verifica se o valor 2 existe dentro da collection, se exister retora true, se não retorna false
        collection.clear(); // limpa a collection
//        System.out.println(collection);
//        System.out.println("Está vazia: "+collection.isEmpty()); // valida se a collection está vazia, retorna true se sim, e false se não


        List<Integer> list = new ArrayList<>(); //list sendo criada utilizando a arrayList
//        Integer valor; // cenario de uso do isEmpty
//        if (!list.isEmpty())
//             valor = list.get(0);

        List<Integer> list2 = new ArrayList<>(); //list2 sendo criada utilizando a arrayList
        list.add(11);
        list.add(12);
        list.add(13);
        int listLength = list.size();
        list.addAll(list2);
        list.remove(1);
        list.removeAll(list2);
        list.contains(2);
        list.containsAll(list2);
        list.clear();
        list.isEmpty();
        list.add(12);
        list.add(0, 13); // adiciona um item no índice especificado
//        System.out.println(list.get(0)); //retorna o valor de um item pelo seu índice


        ArrayList<Integer> arrayList = new ArrayList<>(); // criando um novo arrayList, funciona de forma identica a List
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        int arrayListLength = list.size();
        arrayList.addAll(list2);
        arrayList.remove(1);
        arrayList.removeAll(list2);
        arrayList.isEmpty();
        arrayList.contains(2);
        arrayList.containsAll(list2);
        arrayList.get(1);
        arrayList.clear();



        LinkedList<Integer> linkedList = new LinkedList<>(); // cria uma nova LinkedList
        linkedList.add(21); // adiciona no fim da linked list
        linkedList.add(13);
        linkedList.add(14);
        linkedList.add(1,14); // add por índice
        int linkedListLength = list.size();

        linkedList.addAll(list2);
        linkedList.remove(1);
        linkedList.removeAll(list2);
        linkedList.isEmpty();
        linkedList.contains(2);
        linkedList.containsAll(list2);
        linkedList.get(0);
        linkedList.getLast(); // retorna o ultimo item da lista
        linkedList.getFirst(); // retorna o primeiro item da lista
        linkedList.removeLast(); // remove o ultimo item da lista
        linkedList.removeFirst(); // remove o primerio item da lista
        linkedList.clear();

        linkedList.add(21); // adiciona no fim da linked list
        linkedList.add(13);
        linkedList.add(14);
        linkedList.add(14);
        linkedList.add(14);
        linkedList.add(13);
        linkedList.removeFirstOccurrence(14); // remove a primeiro ocorrencia de um item da lista
        linkedList.removeLastOccurrence(13); // remove a ultima ocorrencia de um item da lista
//        System.out.println(linkedList);
        linkedList.toArray();

        //o set não repete valores, ele elimina repetições
        Set<Integer> set = new HashSet<>(); // cria um Set utilizando o HashSet
        set.add(1);
        set.add(2);
        set.add(2);
        int setLength = set.size();
        set.clear();
        set.addAll(arrayList); // adiciona todos os itens, porém remove os itens duplicados, ficando um de cada item
        set.remove(1);
        set.removeAll(arrayList);
        set.contains(2);
        set.containsAll(arrayList);


        HashSet<Integer> hashSet = new HashSet<>(); // criando um novo HashSet, praticamente identico ao set
        hashSet.add(1);
        hashSet.add(1); // não vai ter duplicados no set
        hashSet.add(2);
        int hashSetLength = hashSet.size();
        hashSet.clear();
        hashSet.addAll(arrayList);
        hashSet.remove(1);
        hashSet.removeAll(arrayList);
        hashSet.contains(2);
        hashSet.containsAll(arrayList);
        hashSet.clone(); // cria um clone vazio

        // é um set organizado(crescente ou decrescente), também elimina repetições
        // por padrão a ordem é ascendente 0-10, A-Z, a-z
        TreeSet<Integer> treeSet = new TreeSet<>(); // Cria um novo TreeSet
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(2);
        treeSet.add(2); // quando adicionamos o mesmo numero novamente ele sobreescreve o numero anterior
        treeSet.add(3);
        treeSet.add(13);
        treeSet.add(33);
        treeSet.add(333);
//        System.out.println(treeSet);T
//        TreeSet<String> treeSetString =new TreeSet<>(); // Exemplo de treeSet com String
//        treeSetString.add("Meu");
//        treeSetString.add("Meu");
//        treeSetString.add("Nome");
//        treeSetString.add("É");
//        treeSetString.add("E");
//        treeSetString.add("Tuh");
//        treeSetString.add("tuh");
//        System.out.println(treeSetString);
        int treeSetLength = treeSet.size();
        treeSet.addAll(arrayList);
        treeSet.remove(1);
        treeSet.removeAll(arrayList);

        NavigableSet<Integer> treeSetInvertido = treeSet.descendingSet(); // retorna um navegableSet na ordem descendente

        treeSet.pollLast(); // retorna e remove o ultimo item do treeSet
        treeSet.last(); // retorn o ultimo item do treeSet
        treeSet.pollFirst(); // retorna e remove o primeiro item do treeSet
        treeSet.first(); // retorn o primeiro item do treeSet

        treeSet.clear();

//      Filas não tem get, elas leem apenas o primeiro item da fila (FIFO)
        Queue<Integer> queue = new LinkedList<>(); // criando uma fila utilizando LinkedList
        queue.add(11); // sempre adiciona no fim da lista
        queue.add(12);
        queue.add(13);
        queue.add(14);
        queue.add(15);
        int queueLength = queue.size();
        queue.addAll(arrayList);
        queue.remove(1);
        queue.removeAll(arrayList);

        queue.element(); // retorna o primiero item de uma fila, ele pode dar erro caso a fila esteja vazia
        queue.poll(); // retorna e remove o primeiro item da fila
        queue.peek(); // retorna o primiero item de uma fila, retorna null caso a fila esteja vazia

        queue.clear();

        //é uma fila que ordena os item por prioridade, no geral ordem ascendente
        // ele apenas organiza os item quando realizamos um peek ou um poll
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(); // cria uma priorityQueue
        priorityQueue.add(11); // adiciona o item em qualquer lugar da memória da fila com base em um algorítimo
        priorityQueue.add(13);
        priorityQueue.add(15);
        priorityQueue.add(14);
        priorityQueue.add(12);
        int priorityQueueLength = priorityQueue.size();

//        for(int i=0; i<priorityQueueLength;i++){
//            System.out.println(priorityQueue.poll()); // ele retorna os item em ordem ascendente
//        }
        priorityQueue.addAll(arrayList);
        priorityQueue.remove(1);
        priorityQueue.removeAll(arrayList);
//        priorityQueue.element(); //da erro caso a fila esteja vazia
        priorityQueue.poll();
        priorityQueue.peek();
        priorityQueue.clear();


        //Deque é uma Double Ended Queue, é uma Fila de Duas Pontas
        // Pode atuar como FIFO ou como LIFO
        // No geral vai ser usada como LIFO, Last In First Out, ou pilha
        Deque<Integer> deque = new LinkedList<>(); // cria uma deque com uma LinkedList
        deque.add(111);
        deque.add(122);
        deque.add(133);
        int dequeLength = priorityQueue.size();
        deque.addAll(arrayList);
        deque.remove(1);
        deque.removeAll(arrayList);

        deque.element(); // le o primeiro item e retorna erro caso a lista esteja vazia
        deque.peek(); // retorna o primeiro item
        deque.peekFirst(); // retorna o valor do primeiro item
        deque.peekLast(); // reotorna o valor do ultimo item

        deque.addFirst(13); // adiciona um item na primeira posição da dequeue
        deque.addLast(12); // adiciona um item na ultima posição da dequeue

        deque.removeFirst(); // remove o item na primeiro posição da dequeue
        deque.removeLast(); // remove o item na ultima posição da dequeue

        deque.removeFirstOccurrence(1); // remove a primeira ocorrencia do valor 1
        deque.removeLastOccurrence(2); // remove a ultima ocorrencia do valor 2

        deque.poll(); // retorna e remove o item na primeiro posição da dequeue
        deque.pollFirst();// retorna e remove o item na primeiro posição da dequeue
        deque.pollLast();// retorna e remove o item na ultima posição da dequeue

        deque.clear();

        // LIFO, ultimo a entrar é o primeiro a sair
        deque.addLast(1);
        deque.addLast(2);
        deque.addLast(3);
        deque.addLast(4);
        deque.addLast(5);
        deque.addLast(10);
        deque.addLast(11);
        deque.addLast(12); // (fim) 12,11,10,5,4,3,2,1 (inicio)
        dequeLength = deque.size();

//        for (int i=0;i<dequeLength;i++)
//            System.out.println(deque.pollLast());
        deque.clear();

        // FIFO, primero a entrar é o primeiro a sair
        deque.addLast(1);
        deque.addLast(2);
        deque.addLast(3);
        deque.addLast(4);
        deque.addLast(5);
        deque.addLast(10);
        deque.addLast(11);
        deque.addLast(12); // (fim) 12,11,10,5,4,3,2,1 (inicio)
        dequeLength = deque.size();

        for (int i=0;i<dequeLength;i++)
            System.out.println(deque.pollFirst()); //leio do inicio


        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>(); //ArrayDeque é identico ao Deque
        arrayDeque.add(1);
        arrayDeque.add(1);
        arrayDeque.add(1);
        int arrayDequeLength = arrayDeque.size();
        arrayDeque.clear();
        arrayDeque.addAll(arrayDeque);
        arrayDeque.remove(1);
        arrayDeque.removeAll(arrayDeque);
        arrayDeque.element();

        arrayDeque.peek();
        arrayDeque.peekFirst();
        arrayDeque.peekLast();

        arrayDeque.addFirst(14);
        arrayDeque.addLast(23);

        arrayDeque.removeFirst();
        arrayDeque.removeLast();

        arrayDeque.removeFirstOccurrence(1);
        arrayDeque.removeLastOccurrence(2);

        arrayDeque.poll();
        arrayDeque.pollFirst();
        arrayDeque.pollLast();
        arrayDeque.toArray();


        ArrayList<Integer> listaExemplo2 = new ArrayList<>();
        listaExemplo2.add(10);
        listaExemplo2.add(11);
        listaExemplo2.add(12);
        listaExemplo2.add(13);
        listaExemplo2.add(14);
        listaExemplo2.add(15);
        listaExemplo2.add(106);
        listaExemplo2.add(1023);
        listaExemplo2.add(1024);
        listaExemplo2.add(4023);

        Collections.sort(listaExemplo2); // organiza a lista que é colocada nele
        System.out.println(listaExemplo2);

//        Collections.reverse(listaExemplo2); // reverte a ordem da lista que é colocada nele

//        Collections.binarySearch(list,1); // procura o indice do valor informado na lista informa
//        , caso o valor não exista na lista ou caso a lista esteja fora de ordem ele retorna um número negativo
//        o numero negativo é igual a => ((lista.size())+1)*(-1)




    }

}
