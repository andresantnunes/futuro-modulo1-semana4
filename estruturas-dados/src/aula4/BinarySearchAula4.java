package aula4;

import java.util.*;
import java.io.*;


public class BinarySearchAula4 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>(); // cria lista
        lista.add(2); // adiciona item a lista
        lista.add(3); // adiciona item a lista
        lista.add(11); // adiciona item a lista


        Collections.sort(lista); // ordena a lista, é necessário para realizar o binary search

        System.out.println("Resultado de busca binária: "
                +Collections.binarySearch(lista, 7)); //procurando na lista o valor 1 com o algoritimo binary search
                // se o binary search não encontra o valor ele retorna ((o ultimo endereço) + 1) *(-1)
        lista.add(10);
        System.out.println("Resultado de busca binária: "
                +Collections.binarySearch(lista, 10));
        if(Collections.binarySearch(lista,10) <= -1){
            Collections.sort(lista);
            if(Collections.binarySearch(lista,10) <= -1)
                System.out.println("Valor 10 não encontrado na lista");
            else
                System.out.println("Valor 10 encontrado na lista");
        }

//        for (Integer item: lista){ // executa para cada item da lista
//            System.out.println(item);
//        }
    }
}
