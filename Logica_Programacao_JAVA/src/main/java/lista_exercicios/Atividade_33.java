package lista_exercicios;
import java.util.Scanner;

public class Atividade_33 {

    public static void main(String[] args) {

        //33) Crie um programa que leia o nome e o turno (M ou V) de um aluno e exiba uma mensagem de
        // saudação de acordo com o turno. Matutino: "Bom dia, aluno", Vespertino: "Boa tarde, aluno".

        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com seu nome:");
        String nome = entrada.nextLine();
        System.out.println("Entre com o seu turno (M ou V):");
        char turno = entrada.next().toUpperCase().charAt(0);

        if(turno == 'M'){
            System.out.println("Bom dia, " + nome );
        }else{
            System.out.println("Boa noite, " + nome );
        }
    }
}
