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


        /*
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
