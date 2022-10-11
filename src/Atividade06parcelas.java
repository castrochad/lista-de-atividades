import java.util.Scanner;

public class Atividade06parcelas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    //variaveis
    float valor;
    int parcelas;
    float taxa;
    int forma_pagamento;
    float juros;
    float valor_parcela;


    valor = 1000;

    System.out.println("o valor do produto e 1.000,00");

    System.out.println("qual sera a forma de pagamento?");

    System.out.println("1 - a vista");
    System.out.println("2 - pix");
    System.out.println("3 - debido");
    System.out.println("4 - credito a vista");
    System.out.println("5 - credito parcelado");
     forma_pagamento = input.nextInt();

    if (forma_pagamento == 1 || forma_pagamento == 2 || forma_pagamento == 3 ){
        valor = valor - (valor * 0.01f);
    }

    else if (forma_pagamento == 4){
        valor = 1000;
    }
    else if (forma_pagamento == 5){
        valor = valor + (valor * 0.01f);
    } else {
        System.out.println("forma de pagamento nao encontrada");
    }
    if (forma_pagamento == 5){
        System.out.println("em quantas parcelas voce quer dividir?");
        parcelas = input.nextInt(); 
        taxa = 0.01f;
        juros = valor * taxa * parcelas;
        valor = valor + juros;
        valor_parcela = (valor / parcelas);
        System.out.println("seu pedido ficou de " + parcelas + " vezes de " + valor_parcela );

    }
    System.out.println("seu pedido ficou de " + valor + " reais");
    input.close();


    }
}