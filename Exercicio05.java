import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

      // Hélio Cassimiro de Souza Neto
      // Matrícula: 1261940735

      System.out.println("Digite a primeira nota: ");
      double nota01 = scan.nextDouble();

      System.out.println("Digite a segunda nota: ");
      double nota02 = scan.nextDouble();

      System.out.println("Digite a terceira nota: ");
      double nota03 = scan.nextDouble();

         double media = (nota01 + nota02 + nota03) / 3;

      System.out.printf("Média: %.2f" , media);
        
         scan.close();

     /*
       Ao rodar o código e colocar as notas, o sistema dava erro ao colocar os número com . ao invés de ,
       Exemplo: 7.5 surgia um erro, mas ao colocar 7,5 o sistema funcionava. Porém, nas instruções da
       lista de exercícios, o exemplo está 7.5 e não 7,5.
     */ 


    }
}
