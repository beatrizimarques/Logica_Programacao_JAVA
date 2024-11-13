package lista_exercicios;
import java.util.Scanner;

public class Atividade_03 {

    public static void main(String[] args) {

        //3) Crie um programa que leia a base e a altura de um triângulo e calcule sua área.

        int base, altura;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite a base:");
        base = entrada.nextInt();
        Scanner entrada1 = new Scanner (System.in);
        System.out.println("Digite a altura:");
        altura = entrada.nextInt();

        System.out.println("A área do triângulo é: " + ((base*altura)/2));

    }
}
