import java.util.Scanner;

public class AtividadeParImpar03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //variaveis
        int numero;

        int cont=0;
        while (cont < 5) {
            
        System.out.println("digite um numero");
        numero = input.nextInt();

        if (numero%2 == 0){
            System.out.println("o numero " + numero + " é par!");
        } else {
            System.out.println("o numero " + numero + " é impar!");
        }
        }

        input.close();
    }
}
