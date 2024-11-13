package lista_exercicios;
import java.util.Scanner;

public class Atividade_04 {

    //4) Faça um programa que receba três notas de um aluno (cada nota de 0 a 10) e calcule a média ponderada considerando pesos 2, 3 e 5 para as notas, respectivamente.

    public static void main(String[] args) {

        int nota1, nota2, nota3;

        Scanner entrada1 = new Scanner(System.in);
        System.out.println("Digite a primeira nota:");
        nota1 = entrada1.nextInt();
        Scanner entrada2 = new Scanner(System.in);
        System.out.println("Digite a segunda nota:");
        nota2 = entrada2.nextInt();
        Scanner entrada3 = new Scanner(System.in);
        System.out.println("Digite a terceira nota:");
        nota3 = entrada3.nextInt();

        System.out.println("A média ponderada das notas é: " + ((nota1*2)+(nota2*3)+(nota3*5)/2+3+5));

    }
}
