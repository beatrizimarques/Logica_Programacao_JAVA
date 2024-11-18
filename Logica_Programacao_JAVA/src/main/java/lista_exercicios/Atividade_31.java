package lista_exercicios;
import java.util.Scanner;

public class Atividade_31 {

    public static void main(String[] args) {

        //31) Faça um programa que leia o valor do salário-mínimo e o salário de um funcionário,
        // e exiba quantos salários-mínimos ele recebe.

        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com seu salario:");
        Float salario = entrada.nextFloat();
        System.out.println("Entre com o valor do salario mínimo:");
        Float minimo = entrada.nextFloat();

        Float media = (salario/minimo);
        System.out.println("Você recebe o total de " + media + "salários mínimos");
    }
}
