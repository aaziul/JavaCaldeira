package aula01.exercicios;

import java.util.Scanner;

public class exercicio4 {
    public static void main (String... args){
        System.out.println("EXERCÍCIO 04: Crie um programa que leia o valor do salário mínimo e o valor do salário de um usuário, calcule a quantidade de salários mínimos que esse usuário ganha e imprima o resultado, assuma que o salário mínimo é R$1.320.");
        Scanner ent = new Scanner(System.in);

        double salarioRecebido, salarioMinimo, quantSalarios;

        salarioMinimo = 1320.00;

        System.out.println("O valor do salário mínimo atual é de R$" + salarioMinimo);

        System.out.println("Informe o salário que você recebe (sem adicionar a opção R$, apenas números): ");
        salarioRecebido = ent.nextInt();

        System.out.println("Seu salário é de R$" + salarioRecebido);

        quantSalarios = salarioRecebido / salarioMinimo;

        System.out.println("Você recebe o total de " + quantSalarios + " salários mínimos.");

    }
}
