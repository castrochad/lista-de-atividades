import java.util.Scanner;

public class Atividade05DobroTriplo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //variaveis 
        float numero;

        int cont=0;
        while (cont < 5){

        System.out.println("digite um numero");
        numero = input.nextFloat();

        if ( numero > 1){
            numero = numero*2;
            System.out.println("o resultado é " + numero);
        } 
        if ( numero < -1){
            numero = numero*3;
            System.out.println("o resoltado é " + numero);
        } else {
            System.out.println("resultado não encontrado");
        }
        }
        input.close();




    }
}
