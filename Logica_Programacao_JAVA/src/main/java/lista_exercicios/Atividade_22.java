package lista_exercicios;
import java.util.Scanner;

public class Atividade_22 {

    public static void main(String[] args) {

        //22) Faça um programa que receba o salário de um funcionário e exiba o valor do seu bônus. Se o salário for maior que R$ 2000, o bônus é de 10%, caso contrário, é de 5%.

        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com seu salário:");
        Float salario = entrada.nextFloat();

        if(salario<=2000){
            System.out.println("Seu bônus é de 5% e seu novo salário tem o valor de: " + (salario+(salario*0.05f)));
        }else{
            System.out.println("Seu bônus é de 10% e seu novo salário tem o valor de: " + (salario+(salario*0.10f)));
        }
    }
}
