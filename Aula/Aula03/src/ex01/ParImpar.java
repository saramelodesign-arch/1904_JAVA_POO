package ex01;

//Importar a classe Scanner
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        //Inicializar o Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");

        //Variável para armazenar o número digitado
        int numero = scanner.nextInt();

        //Verificar se o resto da divisão por 2 é igual a zero (indica que é par)
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }
        //Fechar o Scanner
        scanner.close();
    }
    
}
