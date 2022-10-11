import java.util.Scanner;

public class ProgramaHelloWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade;
        String nome;

        System.out.println("digite sua idade");
        idade = input.nextInt();

        System.out.println("digite seu nome");
        nome = input.nextLine();

        System.out.println("Olá " + nome + " você tem " + idade + " anos");

        input.close();
    }
    
    
}
