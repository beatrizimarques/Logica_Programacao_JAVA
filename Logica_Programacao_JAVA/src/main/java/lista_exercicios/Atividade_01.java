package lista_exercicios;
import java.util.Scanner;

public class Atividade_01 {

    public static void main(String[] args) {

        //1) Faça um programa que solicite dois números inteiros e exiba a soma, subtração, multiplicação e divisão entre eles.

        int n, n1;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com um número inteiro:");
        n = entrada.nextInt();

        Scanner entrada1 = new Scanner(System.in);
        System.out.println("Entre com um número inteiro:");
        n1 = entrada1.nextInt();


        System.out.println("A soma de " + n + " + " + n1 + " é: " + (n+n1));
        System.out.println("A subtração de " + n + " - " + n1 + " é: " + (n-n1));
        System.out.println("A multiplicação de " + n + " x " + n1 + " é: " + (n*n1));
        System.out.println("A divisão de " + n + " / " + n1 + " é: " + (n/n1));

    }
}
