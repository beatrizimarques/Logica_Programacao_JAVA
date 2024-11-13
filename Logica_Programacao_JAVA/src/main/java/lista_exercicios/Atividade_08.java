package lista_exercicios;
import java.util.Scanner;

public class Atividade_08 {

    public static void main(String[] args) {

        //8) Escreva um programa que leia dois números inteiros e troque os seus valores, ou seja, o primeiro deve ficar com o valor do segundo e vice-versa.

        int numero1, numero2;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        numero1 = entrada.nextInt();

        Scanner entrada1 = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        numero2 = entrada1.nextInt();

        System.out.println("Antes da troca:");
        System.out.println("Primeiro número: " + numero1);
        System.out.println("Segundo número: " + numero2);

        int temp = numero1;
        numero1 = numero2;
        numero2 = temp;

        System.out.println("Depois da troca:");
        System.out.println("Primeiro número: " + numero1);
        System.out.println("Segundo número: " + numero2);

    }
}
