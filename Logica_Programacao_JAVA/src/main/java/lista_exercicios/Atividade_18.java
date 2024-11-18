package lista_exercicios;
import  java.util.Scanner;

public class Atividade_18 {

    public static void main(String[] args) {

        //18) Crie um programa que leia dois números inteiros e exiba o maior deles.

        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com um número:");
        int numero = entrada.nextInt();
        System.out.println("Entre com um número:");
        int numero1 = entrada.nextInt();

        if(numero>numero1){
            System.out.println("O maior número é:" + numero);
        }else{
            System.out.println("O maior número é:" + numero1);
        }
    }
}
