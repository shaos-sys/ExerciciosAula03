import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

     // Hélio Cassimiro de Souza Neto
     // Matrícula: 1261940735

     System.out.println("Distância percorrida (em km): ");
     double distancia = scan.nextDouble();

     System.out.println("Combustível gasto (litros): ");
     double combustivel = scan.nextDouble();

           double consumo_medio = distancia / combustivel;

           System.out.println("Consumo médio: " + consumo_medio + "km/l");

           scan.close();
 
    }
}
