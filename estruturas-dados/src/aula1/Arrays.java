public class Arrays {
    public static void main(String[] args) {
        int[] numero = {0,1,2,3,3,4,7,10}; // 0 - 7 posições
        int[] numero2 = numero;

        numero2[1] = 10;
        numero2[3] = 20;
//                          8
//        numero.length -> valor do numero de casas de um array
//        System.out.println(numero.length);
//        System.out.println();
        for (int i=0; i < numero.length; i++){
//            System.out.println(numero[i]);
        }


        String[] strings = {"Andre","0","22","aula"};
        for (int i=0; i < strings.length; i++){
//            System.out.println(strings[i]);
        }

//        String andre = "Andre";
//
//        System.out.println(strings[0].length()); // é a mesma coisa que utilizar uma variável direta ou o valor direto
//        System.out.println("Andre".length());
//        System.out.println(andre.length());


        int[] ints = new int[10];
        int i = 0;
        while (i < ints.length){
            ints[i] = i;
            i++;
        }

//               9                   -1      j-1
        for (int j=ints.length - 1; j >= 0; --j){
            System.out.println(ints[j]);
        }
        // mudar para exibir do ultimo ao primiro
//        for (int j=0; j < numeros3.length; j++){
//            System.out.println(numeros3[j]);
//        }
//
//        int num = 10;
//        int num2 = num;
//
//        System.out.println(num);
//        System.out.println(num2);
//        num2 = 11;
//        System.out.println(num);
//        System.out.println(num2);



    }
}
