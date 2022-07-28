import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetAula3 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>(); //Cria um ser Ordenado
        treeSet.add("O");
        treeSet.add("Rato");
        treeSet.add("Roeu");
        treeSet.add("A");
        treeSet.add("Roupa");
        treeSet.add("Do");
        treeSet.add("Rei");
        treeSet.add("Roma");


        System.out.println("primeiro item do Set: "+treeSet.first()); // retorna a primeria posição do sortedSet
        System.out.println("ultimo item do Set: "+treeSet.last()); // retorna a ultima posição do sortedSet
        System.out.println("itens a partir do Rato: "+treeSet.tailSet("Rato")); // retorna os valores a partir do valor Rato
        System.out.println("itens a partir do O: "+treeSet.tailSet("O")); // retorna os valores a partir do valor O
        System.out.println("itens antes do Rato: "+treeSet.headSet("Rato")); // retorna os valores a antes do valor Rato

        System.out.println("Set completo: "+treeSet);

        System.out.println("Set invertido: "+ treeSet.descendingSet());
    }
}
