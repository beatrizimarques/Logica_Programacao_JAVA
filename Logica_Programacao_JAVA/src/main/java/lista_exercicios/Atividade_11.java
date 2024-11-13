package lista_exercicios;
import java.util.Scanner;

public class Atividade_11 {

    public static void main(String[] args) {

        //11) Escreva um programa que calcule a média aritmética entre três números reais inseridos pelo usuário.

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o primeiro número: ");
        float n1 = entrada.nextFloat();
        System.out.println("Entre com o segundo número:");
        float n2 = entrada.nextFloat();
        System.out.println("Entre com o terceiro número:");
        float n3 = entrada.nextFloat();

        float media = ((n1 + n2 + n3) / 3);

        System.out.println("A média dos números é: " + media);
    }
}
