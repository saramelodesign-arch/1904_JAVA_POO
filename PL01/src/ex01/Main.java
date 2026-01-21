package ex01;

//Classe principal para executar o exercício
public class Main {
    public static void main(String[] args) {
        // CRIAR OS OBJETOS
        Aluno aluno1 = new Aluno("Ana Costa", 101, 15.5);
        Aluno aluno2 = new Aluno("Bruno Lima", 102, 12.0);
        Aluno aluno3 = new Aluno("Carla Dias", 103, 18.0);

        // Imprimir os dados do primeiro aluno
        System.out.println("==== Aluno 1 ====");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Número: " + aluno1.getNumeroEstudante());
        System.out.println("Média: " + aluno1.getMedia());

        System.out.println();

        // Imprimir os dados do segundo aluno
        System.out.println("==== Aluno 2 ====");
        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Número: " + aluno2.getNumeroEstudante());
        System.out.println("Média: " + aluno2.getMedia());

        System.out.println();

        // Imprimir os dados do terceiro aluno
        System.out.println("==== Aluno 3 ====");
        System.out.println("Nome: " + aluno3.getNome());
        System.out.println("Número: " + aluno3.getNumeroEstudante());
        System.out.println("Média: " + aluno3.getMedia());
    }
    
}
