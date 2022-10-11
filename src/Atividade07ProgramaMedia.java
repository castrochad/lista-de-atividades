import java.util.Scanner;

public class Atividade07ProgramaMedia {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);


        //variaveis
        float nota_1;
        float nota_2;
        float nota_3;
        float media;
        String conceito;
        

        System.out.println("digite a primeira nota do aluno");
         nota_1 = input.nextFloat();

        System.out.println("digite a segunda nota do aluno");
         nota_2 = input.nextFloat();
         
        System.out.println("digite a terceira nota do aluno");
         nota_3 = input.nextFloat();  

        //variaveis calculavei
        media = (nota_1 + nota_2*2 + nota_3*3) / 6;

        if ( media > 90f){
            conceito = ("A");
            System.out.println("sua nota foi " + conceito + " aprovado");
        }
        if (media > 75f); {
            conceito = ("B");
            System.out.println("sua nota foi " + conceito + " aprovado");
        }
        if (media > 60){
            conceito = ("C");
            System.out.println("sua nota foi " + conceito + " aprovado");
        }
        if (media > 40){
            conceito = ("D");
            System.out.println("sua nota foi " + conceito + " reprovado");
        } 
        if (media < 40) {
            conceito = ("E");
            System.out.println("sua nota foi " + conceito + " reprovado");
        }
        input.close();

        
        

    }
}
