import java.util.ArrayList;

/**
 * Classe Curso
 * 
 * Representa um curso do CESAE Digital.
 * 
 * @author Sara Melo
 * @version 1.0
 */
public class Curso {

    // ========== ATRIBUTOS ==========
    private String nome;
    private TipoCurso tipo;
    private ArrayList<UnidadeCurricular> unidadesCurriculares;

    // ========== CONSTRUTOR ==========
    public Curso(String nome, TipoCurso tipo) {
        this.nome = nome;
        this.tipo = tipo;
        this.unidadesCurriculares = new ArrayList<>();
    }

    // ========== MÉTODOS ==========

    public void adicionarUnidadeCurricular(UnidadeCurricular uc) {
        if (uc != null && !unidadesCurriculares.contains(uc)) {
            unidadesCurriculares.add(uc);
        }
    }

    /**
     * Remove uma UC por referência
     */
    public void removerUcPorReferencia(UnidadeCurricular uc) {
        unidadesCurriculares.remove(uc);
    }

    /**
     * Remove UC por índice
     */
    public void removerUcPorIndice(int indice) {
        if (indice >= 0 && indice < unidadesCurriculares.size()) {
            unidadesCurriculares.remove(indice);
        }
    }

    /**
     * Mostra detalhes do curso
     */
    public void mostrarDetalhes() {
        System.out.println("Curso: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Unidades Curriculares:");

        if (unidadesCurriculares.isEmpty()) {
            System.out.println("  (Sem unidades curriculares)");
        } else {
            for (int i = 0; i < unidadesCurriculares.size(); i++) {
                System.out.println((i + 1) + " --------------------");
                unidadesCurriculares.get(i).mostrarDetalhes();
            }
        }
    }

    // ========== GETTERS ==========
    public String getNome() {
        return nome;
    }

    public TipoCurso getTipo() {
        return tipo;
    }

    public ArrayList<UnidadeCurricular> getUnidadesCurriculares() {
        return unidadesCurriculares;
    }

    // ========== SETTERS ==========
    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        }
    }

    public void setTipo(TipoCurso tipo) {
        if (tipo != null) {
            this.tipo = tipo;
        }
    }
}
