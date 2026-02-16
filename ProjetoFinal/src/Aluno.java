import java.util.HashMap;
import java.util.Map;

/**
 * Classe Aluno
 * 
 * Representa um aluno do sistema académico.
 * Herda da classe abstracta Pessoa.
 * 
 * @author Sara Melo
 * @version 1.0
 */
public class Aluno extends Pessoa {

    // ========== ATRIBUTOS ==========
    private static int contadorAlunos = 1000;

    private int numeroAluno;
    private EstadoAluno estado;

    // Mapa de notas por Unidade Curricular
    private Map<UnidadeCurricular, Double> notas;

    // ========== CONSTRUTOR ==========
    public Aluno(String nome, String email, String telefone, int idade) {
        super(nome, email, telefone, idade);

        this.numeroAluno = ++contadorAlunos;
        this.estado = EstadoAluno.ATIVO;
        this.notas = new HashMap<>();
    }

    // ========== MÉTODOS ==========

    @Override
    public void mostrarDetalhes() {
        System.out.println("Aluno Nº: " + numeroAluno);
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Idade: " + getIdade());
        System.out.println("Estado: " + estado);
        System.out.println("Média: " + calcularMedia());
    }

    /**
     * Regista nota numa unidade curricular
     */
    public void registarNota(UnidadeCurricular uc, double nota) {

        if (uc == null) return;

        if (nota >= 0 && nota <= 20) {
            notas.put(uc, nota);
        } else {
            System.out.println("Nota inválida (0-20).");
        }
    }

    /**
     * Calcula média do aluno
     */
    public double calcularMedia() {

        if (notas.isEmpty()) return 0;

        double soma = 0;

        for (double nota : notas.values()) {
            soma += nota;
        }

        return soma / notas.size();
    }

    /**
     * Lista todas as notas do aluno
     */
    public void listarNotas() {

        if (notas.isEmpty()) {
            System.out.println("Sem notas registadas.");
        } else {
            for (Map.Entry<UnidadeCurricular, Double> entry : notas.entrySet()) {
                System.out.println(
                        entry.getKey().getNome() + " -> " + entry.getValue());
            }
        }
    }

    // ========== GETTERS ==========
    public int getNumeroAluno() {
        return numeroAluno;
    }

    public EstadoAluno getEstado() {
        return estado;
    }

    public Map<UnidadeCurricular, Double> getNotas() {
        return notas;
    }

    // ========== SETTERS ==========
    public void setEstado(EstadoAluno estado) {
        if (estado != null) {
            this.estado = estado;
        }
    }
}
