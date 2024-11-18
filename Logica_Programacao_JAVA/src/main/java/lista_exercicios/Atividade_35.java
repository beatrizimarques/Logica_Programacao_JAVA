package lista_exercicios;
import java.util.Scanner;

public class Atividade_35 {

    public static void main(String[] args) {

    //35) Escreva um programa que leia três números inteiros e exiba a média aritmética. Se a média for maior ou
     // igual a 7, exiba a mensagem "Aprovado", caso contrário, exiba a mensagem "Reprovado".

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
