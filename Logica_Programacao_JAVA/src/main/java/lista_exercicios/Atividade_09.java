package lista_exercicios;
import java.util.Scanner;

public class Atividade_09 {

    //9) Crie um programa que leia o valor do depósito mensal em uma poupança e a taxa de juros mensal, e calcule o montante após 12 meses.

    public static void main(String[] args) {

        Float deposito, juros, montante;

        Scanner entrada = new Scanner (System.in);
        System.out.println("Indique o valor do seu depósito:");
        deposito = entrada.nextFloat();
        Scanner entrada1 = new Scanner (System.in);
        System.out.println("Indique o valor do seu juros:");
        juros = entrada1.nextFloat()/100;

        System.out.println("A sua poupança com a taxa de juros, é no valor de: " + (deposito+(deposito*juros)));


    }

}
