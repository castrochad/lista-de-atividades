import java.util.Scanner;

public class atividade01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System. in);
         

        // variaveis pelo uer
        String nome;
        int dia_niver;
        int mes_niver;
        int ano_niver;

        // variaveis calculadas
        int idade;

        // pegando dados do terminal
        System.out.println("digite o seu nome");
        nome = input.nextLine();

        System.out.println("digite o dia do seu aniversario");
        dia_niver = input.nextInt();

        System.out.println("digite o mes do seu aniversario");
        mes_niver = input.nextInt();

        System.out.println("digite o ano que voce nasceu");
        ano_niver = input.nextInt();

        input.close();

        // calculando idade
        idade = 2022 - ano_niver;

        System.out.println(nome + " voce tem " + idade + " anos");

    }
    
}
