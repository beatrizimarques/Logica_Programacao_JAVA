package lista_exercicios;
import java.util.Scanner;

public class Atividade_15 {

    public static void main(String[] args) {

        //15) Crie um programa que leia o salário de um funcionário e calcule o novo salário com um aumento de 15%.

        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com seu salário:");
        int salario = entrada.nextInt();

        float aumento = (salario+(salario*0.15f));
        System.out.println("Seu salário é:" + aumento);



    }
}
