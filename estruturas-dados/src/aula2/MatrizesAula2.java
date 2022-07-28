public class MatrizesAula2 {
    public static void main(String[] args) {
        int[][] matrizNumeros = new int[2][2];
        matrizNumeros[0][0] = 1;
        matrizNumeros[0][1] = 2;
        matrizNumeros[1][0] = 3;
        matrizNumeros[1][1] = 4;

        for(int l = 0; l< matrizNumeros.length;l++){ //linha 0, 1

            for (int c = 0; c < matrizNumeros[0].length; c++){ // coluna 0, 1
                // l = 0, c = 0 => 1
                // l = 0, c = 1 => 2
                // l = 1, c = 0 => 3
                // l = 1, c = 1 => 4

                System.out.println(matrizNumeros[l][c]);
            }

        }
        int[][] matrizNumeros2 = matrizNumeros.clone();
        matrizNumeros2[0][0] = 10;

        for(int j = 0; j< matrizNumeros.length;j++){ //podemos pegar o tamanho do vetor correspondente a "linha" 0
            for (int i = 0; i < matrizNumeros[0].length; i++){
                System.out.println(matrizNumeros[j][i]);
            }
        }

    }
}
