import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio4 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(20);
        lista.add(40);
        lista.add(30);
        lista.add(60);
        lista.add(10);
        lista.add(50);
        lista.add(100);

        System.out.println(lista);

        Collections.sort(lista);
        Collections.reverse(lista);

        System.out.println(lista);

        lista.clear();
        Collections.sort(lista);
        Collections.reverse(lista);

        System.out.println(lista);

    }
}
