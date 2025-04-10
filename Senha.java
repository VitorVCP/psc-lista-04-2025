
import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome, senha;
        System.out.println("Digite o nome para o usuário.");
        nome = sc.nextLine();
        System.out.println("Digite a senha para a conta.");
        senha = sc.nextLine();
        while (nome.equals(senha)) {
             System.out.println("Sua senha é identica a seu nome, por favor, reescreva seu nome e sua senha.\n");
             System.out.println("Digite o nome para o usuário.");
             nome = sc.nextLine();
             System.out.println("Digite a senha para a conta.");
             senha = sc.nextLine();
        }
        System.out.println("Usuário e senha cadastrados com sucesso!");
    }
}