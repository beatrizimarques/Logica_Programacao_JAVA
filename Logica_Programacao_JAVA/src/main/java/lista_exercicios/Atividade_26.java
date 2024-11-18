package lista_exercicios;

import java.util.Scanner;

public class Atividade_26 {

    public static void main(String[] args) {

        //26) Escreva um programa que leia o código de um produto e a quantidade comprada, e exiba o valor total a ser pago. Considere que cada produto tem um preço diferente.

        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com o código:");
        int codigo = entrada.nextInt();
        System.out.println("Entre com o preço:");
        int preco = entrada.nextInt();
        System.out.println("Entre com a quantidade:");
        int quantidade = entrada.nextInt();

        int total = (preco*quantidade);

        System.out.println("O total a ser pago é: " + total + "reais");
    }

}
