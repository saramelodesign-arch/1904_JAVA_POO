import java.util.ArrayList;

/**
 * Classe Turma
 * 
 * Representa uma turma de um curso.
 * 
 * @author Sara Melo
 * @version 1.0
 */
public class Turma {

    // ========== ATRIBUTOS ==========
    /** Código ou nome identificador da turma */
    private String codigo;

    /** Curso ao qual a turma pertence */
    private Curso curso;

    /** Lista de alunos da turma */
    private ArrayList<Aluno> alunos;

    /** Lista de unidades curriculares da turma */
    private ArrayList<UnidadeCurricular> unidadesCurriculares;

    // ========== CONSTRUTOR ==========
    /**
     * Construtor da classe Turma
     */
    public Turma(String codigo, Curso curso) {
        this.codigo = codigo;
        this.curso = curso;
        this.alunos = new ArrayList<>();
        this.unidadesCurriculares = new ArrayList<>();
    }

    // ========== MÉTODOS ==========
    /**
     * Adiciona um aluno à turma
     */
    public void adicionarAluno(Aluno aluno) {
        if (aluno != null) {
            alunos.add(aluno);
        }
    }

    /**
     * Adiciona uma unidade curricular à turma
     */
    public void adicionarUnidadeCurricular(UnidadeCurricular uc) {
        if (uc != null) {
            unidadesCurriculares.add(uc);
        }
    }

    /**
     * Mostra os detalhes da turma
     */
    public void mostrarDetalhes() {
        System.out.println("Turma: " + codigo);
        System.out.println("Curso: " + curso.getNome());

        System.out.println("\nAlunos:");
        if (alunos.isEmpty()) {
            System.out.println("  (Sem alunos)");
        } else {
            for (Aluno aluno : alunos) {
                System.out.println("--------------------");
                aluno.mostrarDetalhes();
            }
        }

        System.out.println("\nUnidades Curriculares:");
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
    public String getCodigo() {
        return codigo;
    }

    public Curso getCurso() {
        return curso;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public ArrayList<UnidadeCurricular> getUnidadesCurriculares() {
        return unidadesCurriculares;
    }
}
