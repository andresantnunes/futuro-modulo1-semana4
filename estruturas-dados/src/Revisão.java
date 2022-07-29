import java.util.*;

public class Revisão {
    public static void main(String[] args) {
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 1;
        array[2] = 1;
        int length = array.length;

        int[][] matriz = new int[3][3];
        matriz[0][0] = 1;
        matriz[1][0] = 1;
        matriz[2][0] = 1;
        int lengthMatriz1 = matriz.length;
        int lengthMatriz2 = matriz[0].length;

        Collection<Integer> collection = new ArrayList<>();
        collection.add(1);
        collection.add(1);
        collection.add(1);
        int listLength = collection.size();
        collection.clear();
        collection.addAll();
        collection.remove(1);
        collection.removeAll();
        collection.containsAll();
        collection.contains();


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
        linkedList.toArray()

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(1);
//        int listLength = set.size();
        set.clear();
        set.addAll();
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


    }

}
