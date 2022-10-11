import java.util.Scanner;

public class Idade {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        //variaveis
        int idade;
        int max;
        int i;
        int min;

        max = 0;
        min = 100;


        for(i = 0; i <= 3; i++){

            System.out.println("digite a idade da pessoa");
            idade = input.nextInt();
            


            if(idade > max){
                max = idade;
            }
            if(idade < min){
                min = idade;
            }
            }

            System.out.println("o mais novo é " + min + " e o mais velho é " + max);
        
    }
}
