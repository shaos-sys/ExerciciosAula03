import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) throws Exception {
           Scanner scan = new Scanner(System.in);
  
     // Hélio Cassimiro de Souza Neto
     // Matrícula: 1261940735

     System.out.println("Digite a base (em cm): ");
     double base = scan.nextDouble();

     System.out.println("Digite a altura (em cm): ");
     double altura = scan.nextDouble();

         double area = base * altura;
 
         System.out.println("Área do retângulo: " + area + "cm²");

         scan.close();

     
    }
}
