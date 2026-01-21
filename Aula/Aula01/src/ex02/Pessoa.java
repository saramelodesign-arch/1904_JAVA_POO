package ex02;

//Definição da classe Pública Pessoa
public class Pessoa {
    //Método main: ponto de entrada para a execução do programa em java
    public static void main(String[] args) {
        
        //Declaração e inicialização de variáveis
        String nome = "Sara Melo"; //Variável nome do tipo String
        int idade = 45; //Variável idade do tipo inteiro
        double altura = 1.70; //Variável altura do tipo double

        //Imprime uma mensagem na consola concatenando o texto com valores das variáveis
        System.out.println(
            "Olá, meu nome é " + nome + 
            ", tenho " + idade + 
            " anos e minha altura é " + altura + " metros.");
}
}