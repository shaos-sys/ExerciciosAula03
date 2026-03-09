import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

     // Hélio Cassimiro de Souza Neto
     // Matrícula: 1261940735

     System.out.println("Digite a temperatura em celcius: ");
     double celcius = scan.nextDouble();

         double fahrenheit = (celcius * 9.0/5) + 32;
         double kelvin = (celcius + 273.15);

     System.out.println("Fahrenheit: " + fahrenheit + " °F");
     System.out.println("Kelvin " + kelvin + " K");

     scan.close();
     
    }
}
