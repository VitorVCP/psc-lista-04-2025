import java.util.Scanner;

    public class CincoNumeros2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Por favor, insira 5 números.");
            int maior = Integer.MIN_VALUE, soma = 0;
            
            for (int i = 1; i <= 5; i++) {
                System.out.print("Número " + i + ": ");
                int numero = sc.nextInt();
                soma += numero;

                if ( numero > maior) {
                    maior = numero;
                }
            }
            double media = soma / 5;
            System.out.println("O maior número digitado foi: " + maior);
            System.out.println("A soma deles são: " + soma);
            System.out.println("E sua média é: " + media);
        }
    }