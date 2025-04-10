import java.util.Scanner;

public class Meio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite dois números.");
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        if (a < b) {
            for (int i = 1 + a; i < b; i++) {
                System.out.println(i);
            }
        } else if (a > b) {
           for (int i = 1 + b; i < a; i++) {
                System.out.println(i); 
           }
        } else {
            System.out.println("Os números não podem ser iguais.");
        }
    }
}