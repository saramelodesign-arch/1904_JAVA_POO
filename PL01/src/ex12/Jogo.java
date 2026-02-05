package ex12;
public class Jogo {

    // ---------- ATRIBUTOS ----------

    private String titulo;
    private String plataforma;
    private double preco;
    private int horasJogadas;
    private int classificacao;

        // ---------- CONSTRUTOR ----------

    public Jogo(String titulo, String plataforma, double preco) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.preco = preco;
        this.horasJogadas = 0;
        this.classificacao = 0;
    }

        // ---------- MÉTODO JOGAR ----------

    public void jogar(int horas) {
        if (horas <= 0) {
            return;
        }
        this.horasJogadas += horas;
    }

        // ---------- MÉTODO AVALIAR ----------

    public void avaliar(int classificacao) {
        if (classificacao < 0 || classificacao > 10) {
            return;
        }
        this.classificacao = classificacao;
    }

        // ---------- MÉTODO CALCULAR VALOR POR HORA ----------

    public double calcularValorPorHora() {
        if (horasJogadas == 0) {
            return -1;
        }
        return preco / horasJogadas;
    }

        // ---------- MOSTRAR DETALHES ----------

    public void mostrarDetalhes() {
        System.out.println("Jogo: " + titulo);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Preço: " + preco + " €");
        System.out.println("Horas jogadas: " + horasJogadas);
        System.out.println("Classificação: " + classificacao + "/10");

        double valorHora = calcularValorPorHora();
        if (valorHora == -1) {
            System.out.println("Valor por hora: ainda não jogado");
        } else {
            System.out.printf("Valor por hora: %.2f €%n", valorHora);
        }
        System.out.println("---------------------------");
    }

        // ---------- GETTERS NECESSÁRIOS ----------

    public double getValorPorHora() {
        return calcularValorPorHora();
    }


}

