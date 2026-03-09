import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) throws Exception {
      Scanner scan = new Scanner(System.in);

     // Hélio Cassimiro de Souza neto
     // Matrícula: 1261940735
       
     System.out.println("Distância (km): ");
     double distancia = scan.nextDouble();

     System.out.println("Velocidade média (km/h): ");
     double velocidade_media = scan.nextDouble();

         double tempo = distancia / velocidade_media;

             int horas = (int) (tempo);
             int minutos = (int) ((tempo - horas) * 60);

         System.out.println("Tempo estimado: " + horas + " horas e " + minutos + " minutos" );
    
             scan.close();
    }
}
