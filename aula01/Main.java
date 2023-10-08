package aula1;
public class Main {
    public static void main(String... args) {
        System.out.println("Hello World!");

        System.out.println("----------------------");

        int age = 19;
        double altura = 1.65;
        String nome = "Luiza";
        boolean comFome = true;
        System.out.println(nome);

        System.out.println("-------------------------");

        System.out.println("Operadores Lógicos e Relacionais");

        int x = 5;
        int y = 10;
        boolean igual = (x == y); // false
        boolean diferente = (x != y); // true
        boolean maior = (x > y); // false
        boolean menor = (x < y); // true
        boolean maiorOuIgual = (x >= y); // false
        boolean menorOuIgual = (x <= y); // true

        System.out.println(igual);

        System.out.println("-------------------------");

        System.out.println("Operadores Lógicos");

        //&&: (E lógico) retorna verdadeiro se ambas as expressões forem verdadeiras
        //||: (OU lógico) retorna verdadeiro se pelo menos uma das expressões for verdadeira
        //!: (NÃO lógico) inverte o valor de uma expressão booleana, ou seja, se for verdadeira se torna falsa, e vice-versa

        boolean a = true;
        boolean b = false;

        boolean resultadoE = (a && b); //false
        boolean resultadoOU = (a || b); // true
        boolean resultadoNaoA = !a; //false
        boolean resultadoNaoB = !b; //true

        System.out.println(resultadoOU);

        System.out.println("-------------------------");

        System.out.println("Estruturas Condicionais");

        //if-else
        int idade = 19;

        if (idade >= 18) {
            System.out.println("É maior de idade.");
        } else {
            System.out.println("É menor de idade.");
        }

        //if-else if-else
        int nota = 75;

        if (nota >= 90) {
            System.out.println("Aprovado com distinção.");
        } else if (nota >= 60) {
            System.out.println("Aprovado.");
        } else {
            System.out.println("Reprovado.");
        }

        System.out.println("-----------------------------");

        System.out.println("Controle de Fluxo Condicional com switch-case");

        int opcao = 2;

        switch (opcao) {
            case 1:
                System.out.println("Opção 1 selecionada.");
                break;
            case 2:
                System.out.println("Opção 2 selecionada.");
                break;
            case 3:
                System.out.println("Opção 3 selecionada.");
                break;
            default:
                System.out.println("Opção inválida.");
        }

        System.out.println("-------------------");

        System.out.println("Estruturas de repetição: FOR");
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteração #" + i);
        }

        System.out.println("-----------------------------");

        System.out.println("Estruturas de repetição: WHILE");
        int contador = 0;
        while (contador < 5) {
            System.out.println("Iteração #" + contador);
            contador++;
        }

        //IMPORTANTE: Embora o uso de break seja válido em algumas situações, como dentro de um switch-case, geralmente não é aconselhado usá-lo em estruturas de repetição while. A razão é que o break interrompe abruptamente a execução do loop, tornando o código menos legível e mais propenso a erros.

        System.out.println("-----------------------------");

        System.out.println("Estruturas de repetição: DO-WHILE");
        int numero = 0;
        do {
            System.out.println("Iteração #" + numero);
            numero++;
        } while (numero < 5);

        System.out.println("#################################");
    }

    //definindo uma receita (função)
    public static int somar(int a, int b){
        return a + b;
    }

    //usando a receita
    int resultado = somar(3,5);


}
