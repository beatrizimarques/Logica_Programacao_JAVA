package lista_exercicios;
import java.util.Scanner;

public class Atividade_20 {

    public static void main(String[] args) {

        //20) Escreva um programa que leia um número inteiro e exiba se ele é par ou ímpar.

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com um número:");
        int numero = entrada.nextInt();

        if(numero % 2 == 0){
            System.out.println("Este número é par!");
        }else{
            System.out.println("Este número é impar!");
        }
    }
}
