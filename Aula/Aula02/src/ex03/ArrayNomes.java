package ex03;

public class ArrayNomes {
    public static void main(String[] args) {

        String[] nomes = { "Ana", "Bruno", "Carla" };

        // Imprimir o primeiro nome do array
        System.out.println("Primeiro nome: " + nomes[0]);

        // Imprimir o último nome do array
        System.out.println("Último nome: " + nomes[nomes.length - 1]);

        //Descobrir o tamanho da String do segundo nome
        System.out.println("Tamanho do segundo nome: " + nomes[1].length());
    }
}
