package aula01.exercicios;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String... args){
        System.out.println("EXERCÍCIO 03: Crie um programa que leia 3 números, imprima o maior, o menor e a média aritmética.");
        Scanner ent = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("Informe o primeiro número: ");
        num1 = ent.nextInt();

        System.out.println("Informe o segundo número: ");
        num2 = ent.nextInt();

        System.out.println("Informe o terceiro número: ");
        num3 = ent.nextInt();

        if (num1>num2 && num1>num3){
            System.out.println("O número " + num1 + " é o maior número entre os informados.");
        } else if (num2>num1 && num2>num3) {
            System.out.println("O número " + num2 + " é o maior número entre os informados.");
        } else {
            System.out.println("O número " + num3 + " é o maior número entre os informados.");
        }

        if (num1<num2 && num1<num3){
            System.out.println("O número " + num1 + " é o menor número entre os informados.");
        } else if (num2<num1 && num2<num3){
            System.out.println("O número " + num2 + " é o menor número entre os informados.");
        } else {
            System.out.println("O número " + num3 + " é o menor número entre os informados.");
        }

        int media;

        media = (num1 + num2 + num3) / 3;

        System.out.println("A média aritmética dos números informados é igual a: " + media + ".");

    }
}
