package lista_exercicios;
import java.util.Scanner;

public class Atividade_25 {

    public static void main(String[] args) {

        //25) Faça um programa que leia o número de faltas de um aluno em uma disciplina e exiba sua situação. Se o número de faltas for maior que 15, ele é reprovado por falta.

        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com o número de faltas:");
        int numero = entrada.nextInt();

        if(numero>=15){
            System.out.println("Você está reprovado por falta!");
        }else{
            System.out.println("Você não está reprovado!");
        }
    }
}
