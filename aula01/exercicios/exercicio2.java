package aula01.exercicios;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String... args){
        System.out.println("EXERCÍCIO 02: Crie um programa que receba  números e imprima na tela.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe dois números: ");
        String num1 = scanner.nextLine();
        String num2 = scanner.nextLine();
        System.out.println("Os números informados são: " + num1 + " e " + num2);
    }
}
