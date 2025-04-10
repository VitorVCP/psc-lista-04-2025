
import java.util.Scanner;

public class Paises2 {
    public static void main(String[] args) {
        int a, b, ano = 0;
        double taxaA, taxaB;
        System.out.println("Insira a população do primeiro país e sua porcentagem de crescimento.");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt(); 
        taxaA = sc.nextDouble();
        System.out.println("Agora insira a população do segundo país e sua porcentagem de crescimento.");
        b = sc.nextInt();
        taxaB = sc.nextDouble();

        if (taxaA != taxaB) {
            if (a < b) {
                while (a <= b) {
                    a += a * (taxaA / 100);
                    b += b * (taxaB / 100);
                    ano ++;
                    } 
                System.out.println("Irá demorar " + ano + " anos para que o primeiro país ultrapasse o outro.");
            } else if (a > b) {
                while (a >= b) {
                    a += a * (taxaA / 100);
                    b += b * (taxaB / 100);
                    ano ++;
                    } 
                System.out.println("Irá demorar " + ano + " anos para que o segundo país ultrapasse o outro.");
            }

        } else {
            System.out.println("As taxas de crescimento são idênticas, portanto nunca haverá cruzamento de populações.");
        }  
    }
}