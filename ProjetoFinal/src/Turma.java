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
    private String codigo;
    private Curso curso;
    private ArrayList<Aluno> alunos;
    private ArrayList<UnidadeCurricular> unidadesCurriculares;

    // Capacidade máxima (necessária para estatísticas)
    private int capacidadeMaxima = 30;

    // ========== CONSTRUTOR ==========
    public Turma(String codigo, Curso curso) {
        this.codigo = codigo;
        this.curso = curso;
        this.alunos = new ArrayList<>();
        this.unidadesCurriculares = new ArrayList<>();
    }

    // ========== MÉTODOS ==========

    public void adicionarAluno(Aluno aluno) {
        if (aluno != null && !alunos.contains(aluno)) {
            alunos.add(aluno);
        }
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public void adicionarUnidadeCurricular(UnidadeCurricular uc) {
        if (uc != null && !unidadesCurriculares.contains(uc)) {
            unidadesCurriculares.add(uc);
        }
    }

    public void removerUnidadeCurricular(int indice) {
        if (indice >= 0 && indice < unidadesCurriculares.size()) {
            unidadesCurriculares.remove(indice);
        }
    }

    public void removerUcPorReferencia(UnidadeCurricular uc) {
        unidadesCurriculares.remove(uc);
    }

    public void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("(Sem alunos)");
        } else {
            for (int i = 0; i < alunos.size(); i++) {
                System.out.println((i + 1) + " --------------------");
                alunos.get(i).mostrarDetalhes();
            }
        }
    }

    public void listarUnidadesCurriculares() {

    if (unidadesCurriculares.isEmpty()) {
        System.out.println("(Sem unidades curriculares)");
    } else {
        for (int i = 0; i < unidadesCurriculares.size(); i++) {
            System.out.println((i + 1) + " --------------------");
            unidadesCurriculares.get(i).mostrarDetalhes();
        }
    }
}


    public int getNumeroAlunos() {
        return alunos.size();
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    /**
     * Calcula média da turma
     */
    public double calcularMediaTurma() {

        if (alunos.isEmpty()) return 0;

        double soma = 0;

        for (Aluno aluno : alunos) {
            soma += aluno.calcularMedia();
        }

        return soma / alunos.size();
    }

    /**
     * Mostra detalhes completos
     */
    public void mostrarDetalhes() {

        System.out.println("Turma: " + codigo);
        System.out.println("Curso: " + curso.getNome());

        System.out.println("\nAlunos:");
        if (alunos.isEmpty()) {
            System.out.println("  (Sem alunos)");
        } else {
            for (int i = 0; i < alunos.size(); i++) {
                System.out.println((i + 1) + " --------------------");
                alunos.get(i).mostrarDetalhes();
            }
        }

        System.out.println("\nUnidades Curriculares:");
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

    // ========== SETTERS ==========

    public void setNome(String codigo) {
        if (codigo != null && !codigo.trim().isEmpty()) {
            this.codigo = codigo;
        }
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        if (capacidadeMaxima > 0) {
            this.capacidadeMaxima = capacidadeMaxima;
        }
    }
}
