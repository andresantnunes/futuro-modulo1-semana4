package aula4;

import java.util.*;
import java.io.*;


public class BinarySearchAula4 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>(); // cria lista
        lista.add(2); // adiciona item a lista
        lista.add(3); // adiciona item a lista
        lista.add(11); // adiciona item a lista
        lista.add(10); //adionando item fora de ordem

        if(Collections.binarySearch(lista,10) <= -1){ // se o valor não existe ou está fora de ordem ele retorna um numero negativo
            Collections.sort(lista);                    // realiza a organização da lista em ordem do menor para o maior
            if(Collections.binarySearch(lista,10) <= -1)  // se o valor não existe ou está fora de ordem ele retorna um numero negativo
                System.out.println("Valor 10 não encontrado na lista");
            else
                System.out.println("Valor 10 encontrado na lista");
        }

        System.out.println("Resultado de busca binária: "
                +Collections.binarySearch(lista, 7)); // retorna o endereço do valor 7 na lista "lista"
        // se o binary search não encontra o valor ele retorna um valor negativo
        // ((lista.size()) + 1) *(-1),
    }
}
