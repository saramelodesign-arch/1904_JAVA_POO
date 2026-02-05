/**
 * Classe Professor
 * 
 * Representa um professor do sistema académico.
 * Herda da classe abstracta Pessoa.
 * 
 * @author Sara Melo
 * @version 1.0
 */
public class Professor extends Pessoa {

    // ========== ATRIBUTOS ==========
    /** Contador estático para gerar números de professor */
    private static int contadorProfessores = 500;

    /** Número único do professor */
    private int numeroProfessor;

    /** Área de especialização do professor */
    private String areaEspecializacao;

    // ========== CONSTRUTOR ==========
    /**
     * Construtor da classe Professor
     */
    public Professor(String nome, String email, String telefone, int idade, String areaEspecializacao) {
        // Chama o construtor da classe Pessoa
        super(nome, email, telefone, idade);

        // Gera número automático de professor
        this.numeroProfessor = ++contadorProfessores;

        // Define a área de especialização
        this.areaEspecializacao = areaEspecializacao;
    }

    // ========== MÉTODOS ==========
    /**
     * Implementação do método abstracto mostrarDetalhes()
     */
    @Override
    public void mostrarDetalhes() {
        System.out.println("Professor Nº: " + numeroProfessor);
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Idade: " + getIdade());
        System.out.println("Área de Especialização: " + areaEspecializacao);
    }

    // ========== GETTERS ==========
    public int getNumeroProfessor() {
        return numeroProfessor;
    }

    public String getAreaEspecializacao() {
        return areaEspecializacao;
    }

    // ========== SETTER ==========
    public void setAreaEspecializacao(String areaEspecializacao) {
        if (areaEspecializacao != null && !areaEspecializacao.trim().isEmpty()) {
            this.areaEspecializacao = areaEspecializacao;
        }
    }
}
