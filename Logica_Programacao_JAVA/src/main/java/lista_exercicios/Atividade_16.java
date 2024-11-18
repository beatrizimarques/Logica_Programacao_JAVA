package lista_exercicios;
import java.util.Scanner;

public class Atividade_16 {

    public static void main(String[] args) {

        //16) Faça um programa que verifique se um número é positivo, negativo ou zero.

        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com um número:");
        int numero = entrada.nextInt();

        if(numero<0){
            System.out.println("Este número é negativo!");
        } else if (numero>0){
            System.out.println("Este número é positivo!");
        } else{
            System.out.println("Este número é zero!");
        }

    }
}
