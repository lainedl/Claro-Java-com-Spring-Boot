package parte3IntroducaoEEstruturasCondicionaisEmJava;

// CaixaEletronico.java
public class CaixaEletronicoCondicionalSimples {
    public static void main(String[] args) {

       double saldo = 25.0;
       double valorSolicitado = 17.0;
       
       /* Cenário Inicial
       if(valorSolicitado < saldo)
        saldo = saldo - valorSolicitado;

        System.out.println(saldo);
        */

        //Cenário Proposto
        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Novo saldo: " +saldo);
        }
        else
            System.out.println("Saldo insuficiente");

        System.out.println(saldo);

    }
}