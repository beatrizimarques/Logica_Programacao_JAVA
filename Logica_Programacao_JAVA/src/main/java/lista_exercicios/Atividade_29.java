package lista_exercicios;
import java.util.Scanner;

public class Atividade_29 {

    public static void main(String[] args) {

        //29) Escreva um programa que leia o nome e a nota de um aluno e exiba sua situação na disciplina. Se a nota for maior ou igual a 7, o aluno está aprovado. Caso contrário, está em recuperação.

        Scanner entrada = new Scanner(System.in);


        System.out.println("Entre com o seu nome:");
        String nome = entrada.nextLine();
        System.out.println("Entre com a sua nota: ");
        float nota = entrada.nextFloat();

        System.out.println("O aluno: " + nome);

        if(nota >=7){
            System.out.println("Está aprovado!");
        }else{
            System.out.println("Está reprovado!");
        }
    }
}
