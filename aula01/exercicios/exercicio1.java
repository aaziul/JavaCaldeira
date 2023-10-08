package aula01.exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String... args) {
        System.out.println("EXERCÍCIO 01: Crie um programa que leia seu nome e imprima na tela.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Olá, " + nome + "!");
    }
}
