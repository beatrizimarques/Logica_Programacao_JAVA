package lista_exercicios;
import java.util.Scanner;

public class Atividade_21 {

    public static void main(String[] args) {

        //21) Crie um programa que leia a idade de um grupo de pessoas e exiba quantas são menores de idade e quantas são maiores de idade.

        Scanner entrada = new Scanner(System.in);
        int maior = 0, menor = 0;

        for( int cont = 1; cont<5; cont++){
            System.out.println("Entre com sua idade:");
            int idade = entrada.nextInt();
            if(idade<18){
                menor++;
            }else{
                maior++;
            }
        }

        System.out.println("O número de pessoas maiores de idade é de: " + maior);
        System.out.println("O número de pessoas menores de idade é de: " + menor);

    }
}
