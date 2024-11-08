package parte4EstruturaDeRepeticaoEmJava;

// ExemploFor.java
public class ExemploFor {
	public static void main(String[] args) {
		// estrutura 1
		for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {
			System.out.println(carneirinhos + " - Carneirinho(s) 1");
		}

		// Outra estrutura
		// estrutura 2
		// o que importa é somente o bloco condicional
		int carneirinhos = 1;
		for (; carneirinhos <= 20;) {
			System.out.println(carneirinhos + " - Carneirinho(s) 2");
			carneirinhos++;
		}

		// for( somente 1x ; deve ser uma expresão boolean; acontecerá a cada final da
		// execução ) { }
	}
}
