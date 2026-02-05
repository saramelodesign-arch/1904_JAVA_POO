/**
 * Classe UnidadeCurricular
 * 
 * Representa uma unidade curricular de um curso.
 * 
 * @author Sara Melo
 * @version 1.0
 */
public class UnidadeCurricular {

    // ========== ATRIBUTOS ==========
    /** Nome da unidade curricular */
    private String nome;

    /** Número de horas da unidade curricular */
    private int cargaHoraria;

    /** Professor responsável pela unidade curricular */
    private Professor professorResponsavel;

    // ========== CONSTRUTOR ==========
    /**
     * Construtor da classe UnidadeCurricular
     */
    public UnidadeCurricular(String nome, int cargaHoraria, Professor professorResponsavel) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.professorResponsavel = professorResponsavel;
    }

    // ========== MÉTODOS ==========
    /**
     * Mostra os detalhes da unidade curricular
     */
    public void mostrarDetalhes() {
        System.out.println("Unidade Curricular: " + nome);
        System.out.println("Carga Horária: " + cargaHoraria + " horas");

        if (professorResponsavel != null) {
            System.out.println("Professor Responsável:");
            professorResponsavel.mostrarDetalhes();
        } else {
            System.out.println("Professor Responsável: não atribuído");
        }
    }

    // ========== GETTERS ==========
    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public Professor getProfessorResponsavel() {
        return professorResponsavel;
    }

    // ========== SETTER ==========
    public void setProfessorResponsavel(Professor professorResponsavel) {
        if (professorResponsavel != null) {
            this.professorResponsavel = professorResponsavel;
        }
    }
}
