package aula01.exercicios;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
    System.out.println("EXERCÍCIO 08: Criar um algoritmo para definir as filas prioritárias. Seu programa deve exibir um menu de opções, perguntando se a pessoa é Gestante, Idosa, PCD ou Nenhuma das alternativas. Se ela for PCD, Idosa ou Gestante, tem direito a fila prioritária. Se não, não tem direito.");

    Scanner ent = new Scanner(System.in);

    int sim = 1;
    int nao = 0;
    int resposta;

    System.out.println("Você é gestante, idoso ou PCD? Responda com 1 para SIM e 0 para NÃO.");
    resposta = ent.nextInt();

    if (resposta == 0) {
        System.out.println("Você não pode participar da fila prioritária!");
} else if (resposta == 1) {
    System.out.println("Você pode participar da fila prioritária!");
} else {
    System.out.println("Número inválido, tente novamente respondendo com 1 para SIM e 0 para NÃO."); 
}

}}