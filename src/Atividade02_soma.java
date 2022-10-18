import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Atividade02_soma {
  public static void main(String[] args) {
    Scanner input = new Scanner(System. in);

    // variaveis 
    float primeiro_numero;
    float segundo_numero;
    float soma;

    System.out.println("digite o primeiro numero");
     primeiro_numero = input.nextFloat();

     System.out.println("digite o segundo numero");
     segundo_numero = input.nextFloat();

     input.close();

    // soma dos numeros
    soma = primeiro_numero + segundo_numero;

    System.out.println("o resultado e " + soma );
    input.close();
    }
}
