import java.util.Scanner;

public class ArrayLeitura {
    public static void main(String[] args) {
        int[] listaNumeros = new int[2];

        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva um valor: ");
        listaNumeros[0] = scanner.nextInt();

        System.out.print("Escreva outro valor: ");
        listaNumeros[1] = scanner.nextInt();

        for(int numero: listaNumeros){
            // numero existe
            System.out.println(numero);
        }



        // numero não existe
        int numero2 = 20;

        if(true){
            String nome="Pedro";
        }else {
            String nome = "Andre";
        }


    }
}
