import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
    
        // Hélio Cassimiro de Souza Neto
        // Matrícula: 1261940735

        
     System.out.println("Digite X: ");
     int x = scan.nextInt();

     System.out.println("Digite Y: ");
     int y = scan.nextInt();

     double resto_divisao = x % y;
 
     System.out.println("Resultado do resto da divisão entre X e Y: " + resto_divisao);
    
     scan.close();

    }
}
