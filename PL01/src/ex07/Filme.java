package ex07;

public class Filme {
    //Atributos
    private String titulo;
    private String realizador;
    private String genero;
    private int duracao; // em minutos
    private int classificacaoEtaria; // em anos

    /**
     * Construtor da classe Filme
     * 
     * @param titulo titulo do filme
     * @param realizador realizador do filme
     * @param genero genero do filme
     * @param duracao duracao do filme em minutos
     * @param classificacaoEtaria classificacao etaria do filme em anos
     */

    public Filme(String titulo, String realizador, String genero, int duracao, int classificacaoEtaria) {
        this.titulo = titulo;
        this.realizador = realizador;
        this.genero = genero;
        this.duracao = duracao;
        this.classificacaoEtaria = classificacaoEtaria;
    }

    //Imprimo os detalhes do filme
    public void mostrarInformacao() {
        System.out.println("Filme: " + titulo);
            System.out.println("  » Realizador: " + realizador);
            System.out.println("  » Gênero: " + genero);
            System.out.println("  » Duração: " + duracao + " minutos");
            System.out.println("  » Classificação Etária: " + classificacaoEtaria + " anos");
    }

    // Verificar se um espectador pode ver o filme com base na sua idade
    public boolean podeVerFilme(int idade) {
        return idade >= classificacaoEtaria;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    
}