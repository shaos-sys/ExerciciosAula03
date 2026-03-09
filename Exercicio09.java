import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

     // Hélio Cassimiro de Souza Neto
     // Matrícula: 1261940735

     System.out.print("Preço do produto R$: " );
     double valor_produto = scan.nextDouble();

     System.out.print("Valor pago R$: " );
     double valor_pago = scan.nextDouble();

             if (valor_pago >= valor_produto) {
                 double troco = (valor_pago - valor_produto);
                 System.out.println("Troco: R$: " + troco);
                                
            }else {
                 double restante = (valor_produto - valor_pago);
                 System.out.println("Para concluir a compra, restam R$: " + restante); }
        
                 scan.close();
             }

    }

