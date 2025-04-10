
import java.util.Scanner;

    public class CincoNumeros {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Por favor, insira 5 números.");
            int maior = Integer.MIN_VALUE;
            
            for (int i = 1; i <= 5; i++) {
                System.out.print("Número " + i + ": ");
                int numero = sc.nextInt();

                if ( numero > maior) {
                    maior = numero;
                }
            }
            System.out.println("O maior número digitado foi: " + maior);
        }
    }