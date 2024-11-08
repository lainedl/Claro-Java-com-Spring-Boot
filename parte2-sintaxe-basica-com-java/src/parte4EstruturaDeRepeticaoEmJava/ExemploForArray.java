package parte4EstruturaDeRepeticaoEmJava;

// ExemploFor.java
// ExemploFor.java
public class ExemploForArray {
    public static void main(String[] args) {
        // Em arrays o índice sempre se inicia em "zero"
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }
        // Forma abreviada
        for (String aluno : alunos) {
            System.out.println("Nome do aluno é: "+aluno);
        }

    }
}