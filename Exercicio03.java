import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

      //Hélio Cassimiro de Souza Neto
      // Matrícula: 1261940735

       final double cotacao = 4.95;
         
     System.out.println("Digite o valor em dólar: ");
     double dolar = scan.nextDouble();

       double reais = cotacao * dolar;

     System.out.println("Valor em reais: R$: " + reais);
     
       
    }
}
