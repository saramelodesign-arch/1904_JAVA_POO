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
    /** Contador estático para gerar números de aluno */
    private static int contadorAlunos = 1000;

    /** Número único do aluno */
    private int numeroAluno;

    /** Estado atual do aluno */
    private EstadoAluno estado;

    // ========== CONSTRUTOR ==========
    /**
     * Construtor da classe Aluno
     */
    public Aluno(String nome, String email, String telefone, int idade) {
        // Chama o construtor da classe Pessoa
        super(nome, email, telefone, idade);

        // Gera número automático de aluno
        this.numeroAluno = ++contadorAlunos;

        // Estado inicial do aluno
        this.estado = EstadoAluno.ATIVO;
    }

    // ========== MÉTODOS ==========
    /**
     * Implementação do método abstracto mostrarDetalhes()
     */
    @Override
    public void mostrarDetalhes() {
        System.out.println("Aluno Nº: " + numeroAluno);
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Idade: " + getIdade());
        System.out.println("Estado: " + estado);
    }

    // ========== GETTERS ==========
    public int getNumeroAluno() {
        return numeroAluno;
    }

    public EstadoAluno getEstado() {
        return estado;
    }

    // ========== SETTER ==========
    public void setEstado(EstadoAluno estado) {
        if (estado != null) {
            this.estado = estado;
        }
    }
}
