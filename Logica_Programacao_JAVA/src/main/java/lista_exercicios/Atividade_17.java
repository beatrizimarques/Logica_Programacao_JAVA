package lista_exercicios;
import java.util.Scanner;

public class Atividade_17 {

    public static void main(String[] args) {

        //17) Escreva um programa que leia a idade de uma pessoa e exiba uma mensagem indicando se ela é criança, adolescente, adulto ou idoso.

        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com sua idade:");
        int idade = entrada.nextInt();

        if(idade<=12){
            System.out.println("Você é uma criança!");
        } else if( idade>=13 && idade<=17){
            System.out.println("Você é um adolescente!");
        }else if(idade>=18 && idade<=64){
            System.out.println("Você é um adulto!");
        }else{
            System.out.println("Você é um idoso!");
        }
    }
}
