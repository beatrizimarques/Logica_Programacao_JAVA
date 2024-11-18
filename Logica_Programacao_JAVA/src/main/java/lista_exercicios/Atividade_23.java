package lista_exercicios;
import java.util.Scanner;

public class Atividade_23 {

    public static void main(String[] args) {

        //23) Escreva um programa que leia o nome de um mês e exiba a quantidade de dias que ele possui. Considere apenas meses válidos.

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o mês:");
        String mes = entrada.nextLine();
        int dias = 0;

        switch (mes) {
            case "janeiro":
            case "março":
            case "maio":
            case "julho":
            case "agosto":
            case "outubro":
            case "dezembro":
               dias = 31;
                break;
            case "abril":
            case "junho":
            case "setembro":
            case "novembro":
                dias = 30;
                break;
            case "fevereiro":
                dias = 28;
                break;
            default:
                System.out.println("Mês inválido!");
        }

        System.out.println("O total de dias desse mês é de:" + dias);
    }
}
