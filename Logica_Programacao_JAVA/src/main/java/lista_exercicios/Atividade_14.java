package lista_exercicios;
import java.util.Scanner;

public class Atividade_14 {

    public static void main(String[] args) {

        //14) Escreva um programa que leia a idade de uma pessoa em anos, meses e dias, e calcule quantos dias de vida ela tem.

        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com sua idade:");
        int idade = entrada.nextInt();

        int dias = 0;

        for(int cont = 1; cont<=idade; cont++){
            dias += 365;
        }

        System.out.println("Seus dias de vida são:" + dias);

    }
}
