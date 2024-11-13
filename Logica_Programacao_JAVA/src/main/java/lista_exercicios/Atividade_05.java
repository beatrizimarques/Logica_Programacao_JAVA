package lista_exercicios;
import java.util.Scanner;

public class Atividade_05 {

    public static void main(String[] args) {

        //5) Escreva um programa que leia o preço de um produto e a quantidade comprada, e calcule o valor total a ser pago com desconto de 10% se a quantidade for maior que 10 unidades.

        Float preco; int quantidade;

        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite o preço do produto:");
        preco = entrada.nextFloat();

        Scanner entrada1 = new Scanner (System.in);
        System.out.println("Digite a quantidade de peças:");
        quantidade = entrada.nextInt();

        if(quantidade>=10){
            System.out.println("O total a ser pago é: " + (preco*quantidade-(preco*quantidade)*0.1));
        }else{
            System.out.println("O total a ser pago é: " + (preco*quantidade));
        }


    }
}
