package ex02;

public class Main {

    //Classe principal para executar o exercício
    public static void main(String[] args) {
        // CRIAR OS OBJETOS
        Gato gato1 = new Gato("Fiona", "Amarela", "Miau");
        Gato gato2 = new Gato("Bartolomeu", "Preto", "Miau");

        //Fazer o gato1 miar e brincar
        gato1.miar();
        gato1.brincar();

        System.out.println("----------------");

        //Modificar o som do gato2
        gato2.setSom("Mrrrrr");

        gato2.miar();
        gato2.brincar();
        gato1.miar();
    }
        

}