package lista_exercicios;
import java.util.Scanner;

public class Atividade_13 {

    public static void main(String[] args) {

        //13) Faça um programa que leia dois números inteiros e verifique se o primeiro é múltiplo do segundo.

        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com o número:");
        int numero = entrada.nextInt();

        System.out.println("Entre com o número:");
        int numero1 = entrada.nextInt();

        if(numero%numero1== 0){
            System.out.println("O primeiro é múltiplo do segundo!");
        }else{
            System.out.println("Eles não são múltiplos!");
        }

    }
}
