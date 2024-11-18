package lista_exercicios;
import java.util.Scanner;

public class Atividade_24 {

    public static void main(String[] args) {

        //24) Crie um programa que leia três números inteiros e exiba-os em ordem crescente.

        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com um número:");
        int numero = entrada.nextInt();
        System.out.println("Entre com um número:");
        int numero1 = entrada.nextInt();
        System.out.println("Entre com um número:");
        int numero2 = entrada.nextInt();

        if(numero>numero1 && numero>numero2 && numero1>numero2){
            System.out.println(numero + numero1 + numero2);
        }else if(numero1>numero && numero1>numero2 && numero>numero2){
            System.out.println(numero1 + numero + numero2);
        }else if(numero2>numero && numero2>numero && numero1>numero2){
            System.out.println(numero2 + numero1 + numero);
        }
    }
}
