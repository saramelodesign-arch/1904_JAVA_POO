import java.util.ArrayList;

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
    private static int contadorProfessores = 500;

    private int numeroProfessor;
    private String areaEspecializacao;

    // Lista de UCs atribuídas ao professor
    private ArrayList<UnidadeCurricular> unidadesCurriculares;

    // ========== CONSTRUTOR ==========
    public Professor(String nome, String email, String telefone, int idade, String areaEspecializacao) {
        super(nome, email, telefone, idade);

        this.numeroProfessor = ++contadorProfessores;
        this.areaEspecializacao = areaEspecializacao;
        this.unidadesCurriculares = new ArrayList<>();
    }

    // ========== MÉTODOS ==========

    @Override
    public void mostrarDetalhes() {
        System.out.println("Professor Nº: " + numeroProfessor);
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Idade: " + getIdade());
        System.out.println("Área de Especialização: " + areaEspecializacao);
        System.out.println("Número de UCs: " + unidadesCurriculares.size());
    }

    /**
     * Associa uma UC ao professor
     */
    public void adicionarUc(UnidadeCurricular uc) {
        if (uc != null && !unidadesCurriculares.contains(uc)) {
            unidadesCurriculares.add(uc);
        }
    }

    /**
     * Remove UC do professor
     */
    public void removerUc(UnidadeCurricular uc) {
        unidadesCurriculares.remove(uc);
    }

    /**
     * Número total de UCs (usado nas estatísticas)
     */
    public int getNumeroUcs() {
        return unidadesCurriculares.size();
    }

    // ========== GETTERS ==========
    public int getNumeroProfessor() {
        return numeroProfessor;
    }

    public String getAreaEspecializacao() {
        return areaEspecializacao;
    }

    public ArrayList<UnidadeCurricular> getUnidadesCurriculares() {
        return unidadesCurriculares;
    }

    // ========== SETTERS ==========
    public void setAreaEspecializacao(String areaEspecializacao) {
        if (areaEspecializacao != null && !areaEspecializacao.trim().isEmpty()) {
            this.areaEspecializacao = areaEspecializacao;
        }
    }
}
