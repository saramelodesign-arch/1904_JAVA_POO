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
    /** Nome do curso */
    private String nome;

    /** Tipo do curso (Formação, Pós-graduação, Workshop) */
    private TipoCurso tipo;

    /** Lista de unidades curriculares do curso */
    private ArrayList<UnidadeCurricular> unidadesCurriculares;

    // ========== CONSTRUTOR ==========
    /**
     * Construtor da classe Curso
     */
    public Curso(String nome, TipoCurso tipo) {
        this.nome = nome;
        this.tipo = tipo;
        this.unidadesCurriculares = new ArrayList<>();
    }

    // ========== MÉTODOS ==========
    /**
     * Adiciona uma unidade curricular ao curso
     */
    public void adicionarUnidadeCurricular(UnidadeCurricular uc) {
        if (uc != null) {
            unidadesCurriculares.add(uc);
        }
    }

    /**
     * Mostra os detalhes do curso
     */
    public void mostrarDetalhes() {
        System.out.println("Curso: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Unidades Curriculares:");

        if (unidadesCurriculares.isEmpty()) {
            System.out.println("  (Sem unidades curriculares)");
        } else {
            for (UnidadeCurricular uc : unidadesCurriculares) {
                System.out.println("--------------------");
                uc.mostrarDetalhes();
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
}
