package lista_exercicios;
import java.util.Scanner;

public class Atividade_06 {

    public static void main(String[] args) {

        //6) Crie um programa que leia um número inteiro e exiba se ele é par ou ímpar.

        int numero;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite um número e verifique se ele é par ou ímpar: ");
        numero = entrada.nextInt();

        if(numero%2==0){
            System.out.println("Este número é par");
        } else{
            System.out.println("Este número é impar");
        }
    }
}
