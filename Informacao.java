
import java.util.Scanner;

public class Informacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome, genero, civil;
        int idade;
        double salario;
        System.out.println("Escreva seu nome:");
        nome = sc.nextLine();
        while (nome.length()<=3) {
            System.out.println("Seu nome deve ter mais de 3 digitos.");
            System.out.println("Escreva seu nome:");
            nome = sc.nextLine();
        }
        System.out.println("Digite sua idade:");
        idade = sc.nextInt();
        
        while (idade < 0 || idade > 150) {
            System.out.println("Idade invalida, digite novamente.");
            idade = sc.nextInt();
        }
        System.out.println("Digite seu salário:");
        salario = sc.nextDouble();
        
        while (salario <= 0) {
            System.out.println("Salario invalido, digite novamente.");
            salario = sc.nextDouble();
        }
        System.out.println("Qual seu gênero: \n[F] Feminino.\n[M] Masculino.");
        genero = sc.nextLine();
        System.out.println("Seu gênero é: " + genero);

        System.out.println("Qual seu estado civil: \n[S] Solteiro.\n[C] Casado.\n[V] Viuvo\n [D] Divorciado");
        civil = sc.nextLine();
        System.out.println("Seu estado civil é: " + civil);
    }
}