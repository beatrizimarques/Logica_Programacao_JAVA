package lista_exercicios;
import java.util.Scanner;

public class Atividade_19 {

    public static void main(String[] args) {

        //19) Faça um programa que receba três notas de um aluno e exiba se ele foi aprovado ou reprovado. A média para aprovação é 7.

        Scanner notas = new Scanner(System.in);

        System.out.println("Entre com a primeira nota: ");
        float nota1 = notas.nextFloat();
        System.out.println("Entre com a segunda nota:");
        float nota2 = notas.nextFloat();
        System.out.println("Entre com a terceira nota:");
        float nota3 = notas.nextFloat();

        float media = ((nota1 + nota2 + nota3) /3);

        System.out.println("A média das notas é: " + media);

        if(media >=7){
            System.out.println("Está aprovado!");
        }else{
            System.out.println("Está reprovado!");
        }

    }
}
