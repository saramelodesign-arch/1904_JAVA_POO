package ex03;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        //Iniciar o Scanner
        Scanner Scanner = new Scanner(System.in);

        int opcao;

        do {
            // Imprint as opções do menu
        System.out.println("=== Menu ===");
        System.out.println("1. Opção 1");
        System.out.println("2. Opção 2");
        System.out.println("3. Opção 3");
        System.out.print("0. Sair");

        // Ler a escolha do utilizador
        System.out.print("Escolha uma opção: ");
        opcao = Scanner.nextInt();

        switch (opcao) {
            case 1 -> System.out.println("Você escolheu a Opção 1");

            case 2 -> System.out.println("Você escolheu a Opção 2");

            case 3 -> System.out.println("Você escolheu a Opção 3");

            case 0 -> System.out.println("A sair...");

            default -> System.out.println("Opção inválida.");
        }

        } while (opcao != 0);
        
        // Fechar o Scanner
        Scanner.close();
    }
    }

