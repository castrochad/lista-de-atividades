import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

import javax.imageio.stream.ImageInputStream;
import javax.lang.model.util.ElementScanner6;

public class zodiaco {
    
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // variaveis pelo user 
    String name;
    int dia_niver;
    int mes_niver;
    int ano_niver;
    float altura;
    float peso;
    char sexo;

    // variaveis calculadas
    float imc;
    String signo;
    String titulo;
    int idade;


    // pegando dados do terminal
    System.out.println("digite o nome do candidado a cavaleiro");
    name = input.nextLine();

    System.out.println("digite o dia de nascimento");
    dia_niver = input.nextInt();

    System.out.println("digite o mes de nascimento");
    mes_niver = input.nextInt();

    System.out.println("digite o ano de nascimento");
    ano_niver = input.nextInt();

    System.out.println("digite a altura");
    altura = input.nextFloat();

    System.out.println("digite o peso");
    peso = input.nextFloat();

    System.out.println("digite o sexo");
    sexo = input.next().charAt(0);

    input.close();

    // calculando imc
    imc = peso/ (altura * altura);

    //definindo o titulo 
    if (sexo == 'm') {
        titulo = "cavaleiro";
    } else {
        titulo = "amazona";
    }

    // definindo signo 
    if (mes_niver == 1) {
        if (dia_niver <= 20) {
            signo = "capricornio";
        } else {
            signo = "aquario";
        } 
    } else if (mes_niver == 2) {
        if (dia_niver <= 19) {
            signo = "aquario";
        } else {
            signo = "peixes";
        }
    } else if (mes_niver == 3) {
        if (dia_niver <= 20) {
            signo = "aries";
        }
    } else if (mes_niver == 4) {
        if (dia_niver <= 20) {
            signo = "aries";
        } else {
            signo = "touro";
        }
    } else if (mes_niver == 5) {
        if (dia_niver <= 20) {
            signo = "touro";
        } else {
            signo = "gemeos";
        }
    } else if (mes_niver == 6) {
        if (dia_niver <= 21){
            signo = "Gemeos";
        } else {
            signo = "cancer";
        }
    } else if (mes_niver == 7) {
        if (dia_niver <= 22){
            signo = "Cancer";
        } else {
            signo = "leao";
        }
    } else if (mes_niver == 8) {
        if (dia_niver <= 22){
            signo = "Leao";
        } else {
            signo = "virgem";
        }
    } else if (mes_niver == 9) {
        if (dia_niver <= 22) {
            signo = "virgem";
        } else {
            signo = "Libra";
        }
    }  else if (mes_niver == 10) {
        if (dia_niver <= 20) {
            signo = "libra";
        } else {
            signo = "escorpiao";
        }
    } else if (mes_niver == 11) {
        if (dia_niver <= 21) {
            signo = "Escorpiao";
        } else {
            signo = "sargiario";
        }
    } else if (mes_niver == 12) {
        if (dia_niver <= 21) {
            signo = "Sagitario";
        } else {
            signo = "capricornio";
        }
    } else {
        signo = "nao identificado";
    }

    // calculando idade
    idade = 2022 - ano_niver;

    if (imc > 18.5 && imc < 24.9) {
        System.out.println("Bem vindo " + name + ", " + titulo + " de ouro de " );
            System.out.println("Voce tem " + idade + " anos");
            System.out.println("Prepare-se para a Guerra Santa!");
    } else {
        System.out.println("Sinto muito, mas voce precisa treinar mais!");
    }
    

} }
 