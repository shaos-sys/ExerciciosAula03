import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) throws Exception {   
     Scanner scan = new Scanner(System.in);

     // Hélio Cassimiro de Souza Neto
     // Matrícula: 1261940735

     System.out.println("Digite o primeiro número: ");
     double num01 = scan.nextDouble();

     System.out.println("Digite o segundo número: ");
     double num02 = scan.nextDouble();

        double adicao = num01 + num02;
        double subtracao = num01 - num02;
        double multiplicacao = num01 * num02;
        double divisao = num01 / num02;

        System.out.println("Adição: " + adicao);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);   

     scan.close(); 
    
    }
}
