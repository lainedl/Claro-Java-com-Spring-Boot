package parte4EstruturaDeRepeticaoEmJava;

// ExemploDoWhile.java //Faça enquanto. Testando a condição posteriormente, 
//ele executa pelo menos 1 vez, depois verifica se continua, ou não.

import java.util.Random;
public class ExemploDovWhile {
	public static void main(String[] args) {
		System.out.println("Discando...");
		
		do {
			//excutando repetidas vezes até alguém atender
			System.out.println("Telefone tocando");
		
		}while(tocando());
		
		System.out.println("Alô !!!");
	}
	private static boolean tocando() {
		boolean atendeu = new Random().nextInt(3)==1;
		System.out.println("Atendeu? " + atendeu);
		//negando o ato de continuar tocando
		return ! atendeu;
	}
}
