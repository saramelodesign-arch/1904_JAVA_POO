package ex10;

public class Jogador {

    // Atributos
    private String nome;
    private int pontos;
    private int nivel;
    private String equipa;

    /**
     * Construtor da classe Jogador
     * @param nome Nome do jogador
     * @param equipa Equipa do jogador
     */
    public Jogador(String nome, String equipa) {
        this.nome = nome;
        this.equipa = equipa;
        this.pontos = 0;
        this.nivel = 0;
    }

    /**
     * Adiciona pontos ao jogador e atualiza o nível
     * O nível aumenta 1 por cada 100 pontos acumulados
     */
    public void ganharPontos(int quantidade) {
        if (quantidade > 0) {
            pontos += quantidade;
            nivel = pontos / 100;

            System.out.println(
                "Jogador " + nome + " ganhou " + quantidade +
                " pontos. Total: " + pontos +
                " pontos. Nível: " + nivel
            );
        }
    }

    // Método para exibir as estatísticas do jogador
    public void mostrarEstatisticas() {
        System.out.println("Estatísticas do Jogador:");
        System.out.println("   | Nome: " + nome);
        System.out.println("   | Equipa: " + equipa);
        System.out.println("   | Pontos totais: " + pontos);
        System.out.println("   | Nível: " + nivel);
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getEquipa() {   
        return equipa;
    }

    public int getPontos() {
        return pontos;
    }

    public int getNivel() {
        return nivel;
    }
}
