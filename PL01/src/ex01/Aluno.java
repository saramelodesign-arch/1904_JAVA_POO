package ex01;

public class Aluno {

    /**
     * Escreve um programa onde crias uma classe chamada "Aluno" com atributos de nome, número de estudante e 
média. Cria três instâncias da classe "Aluno", define os seus atributos usando o construtor e imprime os dados de 
cada aluno formatados (por exemplo: "Aluno: João Silva | Nº: 12345 | Média: 15.5").
     */

//Atributos
    private String nome;
    private int numeroEstudante;
    private double media;

    /**
     * Construtor da classe Aluno
     * @param nome              Nome do aluno
     * @param numeroEstudante   Número de estudante do aluno
     * @param media             Média do aluno
     */

    public Aluno(String nome, int numeroEstudante, double media) {
        this.nome = nome;
        this.numeroEstudante = numeroEstudante;
        this.media = media;
    }

    //Métodos Getters para aos dados de fora da classe
    public String getNome() {
        return nome;
    }

    public int getNumeroEstudante() {
        return numeroEstudante;
    }

    public double getMedia() {
        return media;
    }
}