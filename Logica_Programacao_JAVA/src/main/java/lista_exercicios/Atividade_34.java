package lista_exercicios;
import java.util.Scanner;

public class Atividade_34 {

    public static void main(String[] args) {

        //34) Faça um programa que leia a idade de uma pessoa e exiba se ela pode ou não votar.
        // O voto é obrigatório para pessoas entre 18 e 70 anos, e facultativo para pessoas entre 16 e 18 anos
        // e com mais de 70 anos.

        int idade;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com a sua idade:");
        idade =  entrada.nextInt();

        if( idade >= 18 && idade <= 69){
            System.out.println("Voto obrigatório!");
        }else if (idade >= 16 || idade > 69){
            System.out.println("Voto opcional!");
        } else{
            System.out.println("Não pode votar!");
        }



    }
}
