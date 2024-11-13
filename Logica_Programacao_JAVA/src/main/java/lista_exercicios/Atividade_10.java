package lista_exercicios;
import java.util.Scanner;

public class Atividade_10 {

    public static void main(String[] args) {

        //10) Faça um programa que leia um número inteiro e exiba a sua tabuada de multiplicação até o décimo valor.

        int numero;

        Scanner entrada = new Scanner (System.in);
        System.out.println("Entre com o número que deseja ver a tabuada: ");
        numero = entrada.nextInt();

        for( int cont = 0; cont<=10; cont++){
            System.out.println(numero + " x " + cont + " = " + (numero*cont));
        }
    }
}
