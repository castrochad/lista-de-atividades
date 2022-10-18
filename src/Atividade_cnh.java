import java.util.Scanner;

public class Atividade_cnh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System. in);
 
        // variaveis 
        float quantidade_rodas;
        float peso_veicuo;
        float quantidade_pessoas;

        // categorias
        String categoria;
        String acc;
        String A;
        String B;
        String C;


        System.out.println("informe a quantitade de rodas do veiculo");
        quantidade_rodas = input.nextFloat();

        System.out.println("informe o peso do veiculo");
        peso_veicuo = input.nextFloat();

        System.out.println("informe a quantitade de pessoas comportadas no veiculo");
        quantidade_pessoas = input.nextFloat();
         
        input.close();


        if (quantidade_rodas == 2) {
            categoria = "A";
        }

        else if (quantidade_rodas == 4) {
            if (peso_veicuo <= 3.500) {
                categoria = "B";
            }
        }

        else if ( quantidade_rodas == 4) {
            if (quantidade_rodas >= 4){
                if (peso_veicuo >= 3.500){
                    categoria = "C";
                }
            }
        }


        System.out.println("voce precisa da categoria " );

        input.close();




    }
    
}
