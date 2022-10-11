import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //variaveis
        int soma;
        int subtracao;
        int divisao;
        int multiplicacao;
        int numero1;
        int numero2;
        int resp;


        System.out.println("Digite o primeiro numero da operação");
        numero1 = input.nextInt();

        System.out.println("Digite o segundo numero da operação");
        numero2 = input.nextInt();

        System.out.println("Digite a operação que você deseja realizar");
        System.out.println("1- Soma");
        System.out.println("2- Subtração");
        System.out.println("3- Divisão");
        System.out.println("4- Multiplicação");
        resp = input.nextInt();

        soma = numero1 + numero2;
        subtracao = numero1 - numero2;
        divisao = numero1 / numero2;
        multiplicacao = numero1 * numero2;

        if ( resp == 1){
            System.out.println(soma);
        }

        if ( resp == 2){
            System.out.println(subtracao);
        }

        if ( resp == 3){
            System.out.println(divisao);
        }

        if ( resp == 4){
            System.out.println(multiplicacao);
        } else {
            System.out.println("Não encontramos sua resposta");
        }
        input.close();


    }
    
}
