package lista_exercicios;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade_02 {

    public static void main(String[] args) {

        //2) Escreva um programa que leia o raio de um círculo e calcule sua área e perímetro.

        int raio;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com o raio do círculo:");
        raio = entrada.nextInt();

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println(" A área do círculo é de: " + df.format(Math.PI *(raio*raio)));
        System.out.println(" O perímetro do círculo é de: " + df.format( 2*Math.PI* raio));


    }
}
