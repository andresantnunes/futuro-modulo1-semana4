import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i<= 48; i++){ //leitura dos 50 numeros
//            System.out.println("Escreva um numero:");
            numeros.add(i); // adicionar os numeros a lista
        }

        numeros.add(83);
        numeros.add(83);

        Collections.sort(numeros); // ordenar os itens
        int valorAnterior = Integer.MIN_VALUE;
        ArrayList<Integer> enderecoDuplicado = new ArrayList<>();

        for(int i = 0; i< numeros.size(); i++){
            if(numeros.get(i) == valorAnterior){ // valor anterior vai ter o valor do item de i-1
                enderecoDuplicado.add(i);
            }
            valorAnterior = numeros.get(i);//vai guarda o valor do indice
        }

        System.out.println(enderecoDuplicado);

    }
}
