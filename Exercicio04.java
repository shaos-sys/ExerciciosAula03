import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        // Hélio Cassimiro de Souza Neto
        // Matrícula: 1261940735

     System.out.println("Digite o salário atual: ");
         double salario_atual = scan.nextDouble();

     System.out.println("Salário original: R$: " + salario_atual);

         double salario_reajuste = salario_atual * 1.07;

     System.out.println("Novo salário: R$: " + salario_reajuste);

         scan.close();

     

        
















    }
}
