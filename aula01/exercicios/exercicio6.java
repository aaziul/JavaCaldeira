package aula01.exercicios;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        System.out.println("Escreva um programa que leia a idade do usuário e imprima respostas diferentes dependendo do número colocado:\n" +
                "i. Se for menor de 16 anos, avisar que não pode votar;\n" +
                "ii. Se tiver 16 ou 17, avisar que o voto é facultativo;\n" +
                "iii. Se tiver mais de 65, avisar que também é facultativo o voto;\n" +
                "iv. De 18 até 65, é obrigatório votar.");

        Scanner ent = new Scanner(System.in);

        int idade;

        System.out.println("Informe sua idade: ");
        idade = ent.nextInt();

        if ((idade >= 18)&&(idade<65)){
            System.out.println("Seu voto é obrigatório!");
        } else if (idade<16){
            System.out.println("Não é permitido votar!");
        } else {
            System.out.println("Seu voto é facultativo!");
        }
    }
}
