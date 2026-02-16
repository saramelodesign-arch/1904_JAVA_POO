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
    private String nome;
    private int cargaHoraria;
    private Professor professorResponsavel;

    // ========== CONSTRUTOR ==========
    public UnidadeCurricular(String nome, int cargaHoraria, Professor professorResponsavel) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.professorResponsavel = professorResponsavel;
    }

    // ========== MÉTODOS ==========

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

    /**
     * Getter adicional para compatibilidade com o CRUD
     */
    public Professor getProfessor() {
        return professorResponsavel;
    }

    // ========== SETTERS ==========

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        }
    }

    public void setCargaHoraria(int cargaHoraria) {
        if (cargaHoraria > 0) {
            this.cargaHoraria = cargaHoraria;
        }
    }

    /**
     * Setter compatível com CRUD
     */
    public void setProfessor(Professor professor) {
        this.professorResponsavel = professor;
    }

    /**
     * Mantido para compatibilidade com código anterior
     */
    public void setProfessorResponsavel(Professor professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }
}
