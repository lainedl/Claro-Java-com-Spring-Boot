package parte3IntroducaoEEstruturasCondicionaisEmJava;

public class ResultadoEscolarCondicionalTernaria2 {
    // Cenário 2
	public static void main(String[] args) {
		int nota = 6;
		String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado);
	}
}

