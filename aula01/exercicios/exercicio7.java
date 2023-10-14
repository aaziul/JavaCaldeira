package aula01.exercicios;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        System.out.println("Criar para uma empresa de consórcio. No teste inicial, você deve perguntar para o usuário a idade dele e o seu salário. A pessoa só pode comprar um automóvel se for de maior e ganhar mais de R$ 2.000,00.");

        Scanner ent = new Scanner(System.in);

        int idade;
        double salario;

        System.out.println("Informe sua idade: ");
        idade = ent.nextInt();

        System.out.println("Informe seu salário:");
        salario = ent.nextDouble();

        if ((idade >= 18)&&(salario >= 2000)){
            System.out.println("Você pode comprar um automóvel!");
        } else {
            System.out.println("Você não pode comprar um automóvel.");
        }
        
    }
}
