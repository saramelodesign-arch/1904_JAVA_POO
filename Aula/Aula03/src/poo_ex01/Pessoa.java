package poo_ex01;

/*
*Classe que representa uma pessoa.
*Este é um exemplo simples de uma classe em Java

*Dica:
* Começamos por criar esta classe (Pessoa) antes da classe Main
* Faz mais sentido definir "o que é uma Pessoa"(o molde) antes de
* criar objetos dessa classe na Main.
* É a analogia da planta da casa vs aconstrução da casa.
*/
public class Pessoa {
    //Atributos da classe Pessoa
    private String nome; //Private: só pode ser acessado dentro desta classe
    private int idade;
    private double altura;

    /**
     * *Construtor da classe Pessoa
     * o construtor é um método especial usado para criar objetos da classe
     * É chamado quando criamos um novo objeto da classe com o operador 'new'
     * 
     * @param nome  Nome da pessoa
     * @param idade Idade da pessoa
     * @param altura Altura da pessoa
     **/
    
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    //Métodos getters para obter os valores dos atributos privados
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }
}