import java.util.Scanner;

public class ProgramaConverterTemp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //variaveis
        int tempC5;
        int tempF;
        int tempK;
        int resp;

        System.out.println("Digite a temperatura em celsios ");
        tempC5 = input.nextInt();

        System.out.println("Digite para qual medida você deseja converter");
        System.out.println("1- Fahrenheit");
        System.out.println("2- Kelvin");
        resp  = input.nextInt();

        tempK = tempC5 + 273;
        tempF = tempC5 - 329;

        if (resp == 1){
            System.out.println("O resultado é " + tempF + "°F");
        } 
        if (resp == 2){
            System.out.println("O resultado é " + tempK + "K");
        }else{
            System.out.println("Não foi possível achar seu resultado");
        }
        input.close();


    }
    
}
