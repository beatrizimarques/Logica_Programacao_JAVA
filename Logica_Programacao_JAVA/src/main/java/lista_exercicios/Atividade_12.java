package lista_exercicios;
import java.util.Scanner;

public class Atividade_12 {

    public static void main(String[] args) {

        // Calcule o IMC e verifique a classificação

        float peso, altura, imc;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu peso:");
        peso = entrada.nextFloat();
        System.out.println("Digite sua altura:");
        altura = entrada.nextFloat();

        imc = (peso / (altura * altura));

        System.out.println("O seu IMC é no total de: " + imc);
    }
}
