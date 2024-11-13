package lista_exercicios;
import java.util.Scanner;

public class Atividade_07 {

    //7) Faça um programa que receba o salário base de um funcionário e calcule o seu salário líquido, considerando que o funcionário recebe 5% de comissão sobre o salário base.

    public static void main(String[] args) {

        Float salario;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor do seu salário líquido:");
        salario = entrada.nextFloat();

        System.out.println("O salário base é: " + (salario+(salario*0.05)));
    }
}
