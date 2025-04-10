
import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;
         System.out.println("Escolha uma nota entre 0 a 10.");
        nota = sc.nextInt();
        while (nota < 0 || nota > 10) {
            System.out.println("Valor invalido, envie novamente.");
        System.out.println("Escolha uma nota entre 0 a 10.");
        nota = sc.nextInt();
        }
    }
}