import java.util.Scanner;

public class Escadas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("digite um numero");


        int linhas = input.nextInt();
        int i;
        

        for(i = 1; i<= linhas; i++ ){

            for(int j = 1; j <=i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    input.close();
}
}
