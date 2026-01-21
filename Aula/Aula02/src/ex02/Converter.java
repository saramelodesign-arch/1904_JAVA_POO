package ex02;

public class Converter {
    public static void main(String[] args) {
        
        //Declarar a variavel preço
        double preco = 19.99;

        //Declarar a variavel int precoInteiro
        int precoInteiro = (int) preco;

        System.out.println("Preço original: " + preco);
        System.out.println("Preço inteiro: " + precoInteiro);

        System.out.println("Preço arredondado para cima: " + Math.ceil(preco));
        System.out.println("Preço arredondado para baixo: " + Math.floor(preco));
        System.out.println("Preço arredondado: " + Math.round(preco));

        int precoInteiro2 = (int) Math.round(preco);

        System.out.println("Preço arredondado: " + precoInteiro2);
    }
}