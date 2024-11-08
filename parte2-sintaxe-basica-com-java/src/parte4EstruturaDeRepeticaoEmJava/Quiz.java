package parte4EstruturaDeRepeticaoEmJava;

public class Quiz {

    public static void main(String[] args) {

        /*
         * //Exercicio1
         * int num = 5, count = 1; do {
         * num += count;
         * System.out.println(num);
         * }while (count <= 3); //Loop infinito
         * }
         */

        // Exercicio2
        String[] nomes = { "Camila", "Venilton", "Leonardo", "Renan", "Rafael" };
        System.out.println(nomes.length);

        // Exercicio3
        int numero = 1;
        for (int x = 1; x < 2; x++) {
            numero = numero + x;
        }
        System.out.println("O valor de número é: " + numero);

        // Exercicio4
        boolean condicao = false;
        while (condicao) {
            System.out.println("executou ... ");
        }

        for (int x = 1; x <= 10; x++) {
            if (x % 2 == 0) // % operador que representa módulo de uma divisão
                System.out.println(x);
        }
    }
}
