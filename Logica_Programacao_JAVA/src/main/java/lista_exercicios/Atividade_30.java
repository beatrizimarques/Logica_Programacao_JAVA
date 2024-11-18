package lista_exercicios;
import java.util.Scanner;

public class Atividade_30 {

    public static void main(String[] args) {

        //30) Crie um programa que leia o número de maçãs compradas e exiba o
        // valor total a ser pago. O preço das maçãs é de R$ 0,50 cada se a quantidade for menor que 12
        // e R$ 0,40 cada se a quantidade for igual ou maior que 12.

        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com a quantidade:");
        int quantidade = entrada.nextInt();

        if(quantidade<=12){
            System.out.println("O valor total será de:" + (quantidade*0.5));
        }else{
            System.out.println("O valor total será de:" + (quantidade*0.4));
        }

    }
    }

