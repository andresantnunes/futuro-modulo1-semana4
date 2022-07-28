import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class ArrayListAula3 {
    public static void main(String[] args) {
//        String[] array = new String[1000];
//        array[0] = "10-array";
//        System.out.println(array[0]);

        ArrayList<String> arrayList = new ArrayList<>(); // cria uma nova lista
        arrayList.add("10-arrayList"); // adiciona novo item ao final da fila
        arrayList.add("20-arrayList"); // adiciona novo item ao final da fila
        arrayList.add("30-arrayList"); // adiciona novo item ao final da fila
        arrayList.add("40-arrayList"); // criar o index 3 e vai adicionar o valor no final do array
        System.out.println(arrayList); // printa a lista
        System.out.println(arrayList.size()); // retorna o tamanho de uma lista

        arrayList.remove(1); // remove o valor que está no index 1
        System.out.println(arrayList);

        arrayList.add(0,"80-array list"); // adiciona o item no indice 0 e move os outros para frente
        System.out.println(arrayList);

        arrayList.clear(); // limpa a lista

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Nome");
        arrayList2.add("Idade");
        arrayList2.add("Estado");

        arrayList.addAll(arrayList2); // copia todos os elementos da arrayList2 para dentro da arrayList
        System.out.println(arrayList);

//        arrayList = arrayList2; // mudando a referencia da arrayList para a arrayList2
        arrayList2.add("Formato");
        System.out.println(arrayList2);
        System.out.println(arrayList);




    }
}
