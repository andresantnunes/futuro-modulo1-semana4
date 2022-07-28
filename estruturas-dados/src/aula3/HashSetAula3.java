import java.util.HashSet;

public class HashSetAula3 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>(); // cria um novo set

        hashSet.add("Valor 1"); // adiciona valor ao set
        hashSet.add("Valor 2"); // adiciona valor ao set
        hashSet.add("Valor 2."); // adiciona valor ao set
        hashSet.add("Valor 3"); // adiciona valor ao set
        hashSet.add("Valor 3"); // adiciona valor ao set

        System.out.println("Size: "+hashSet.size()); // tamanho do set
        System.out.println("HashSet: "+hashSet); // printa o set
        System.out.println("is Empty: "+hashSet.isEmpty()); // valida se o set está vazio
        System.out.println("Contains Valor 4: "+hashSet.contains("Valor 4")); // valida se o set tem um determinado valor
        System.out.println("Contains Valor 1: "+hashSet.contains("Valor 1")); // valida se o set tem um determinado valor
        hashSet.remove("Valor 2");
        System.out.println("Contains Valor 2: "+hashSet.contains("Valor 2")); // valida se o set tem um determinado valor
        System.out.println("HashSet: "+hashSet); // printa o set

        if(hashSet.contains("Valor 1")) // o contains pode ser usado no if, pois retorna booleano
            System.out.println("O hashSet contem o valor 1");


        hashSet.clear(); // limpa o set
        System.out.println("is Empty: "+hashSet.isEmpty()); // valida se o set está vazio
        if(hashSet.isEmpty()){ // podemos usar o isEmpty porque ele retorna boolean(true/false)
            System.out.println("Set vazio");
        }

    }
}
