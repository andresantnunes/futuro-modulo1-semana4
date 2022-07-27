import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExerciciosSemana3ComplexoNaoRepetir {
    public static void main(String[] args) {
        //             0,1,2,3,4,5 - endereços/indexador
        int[] vetor = {1,1,2,3,2,1};// - valores

//   chave-unica   valor-Lista[um vetor de tamanho variável]
        Map<Integer, List<Integer>> contadorLista = new LinkedHashMap<>();

        for (int indexador = 0; indexador < vetor.length; indexador++) {
            int valor = vetor[indexador]; // valor do item a partir do endereço

            if (!contadorLista.containsKey(valor)) {
                contadorLista.put(valor, new ArrayList<>());
                //                  1 - Lista Vazia // {0,1,5} // tamanho = 3
                //                  2 - Lista Vazia // {2,4} // tamanho = 2
                //                  3 - Lista Vazia // {3}   // tamanho = 1
            }
            contadorLista.get(valor).add(indexador);
            //             Lista 1.add(0)
            //             Lista 1.add(1)
        }

        for (Map.Entry<Integer, List<Integer>> item : contadorLista.entrySet()) {
            List<Integer> listaPosicoes = item.getValue();
            if (listaPosicoes.size() > 1) {
                System.out.printf("Número"+ item.getKey() +" se repete "+ listaPosicoes.size()+" vezes nas posições:" + listaPosicoes);
            }
        }
    }
}
