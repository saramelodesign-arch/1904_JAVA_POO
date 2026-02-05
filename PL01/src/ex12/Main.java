package ex12;
public class Main {

    public static void main(String[] args) {

        
        // 1. CRIAR OS JOGOS (estado inicial)
        // Cada objeto Jogo começa com:
        // - 0 horas jogadas
        // - classificação 0
        // Estes valores são definidos no construtor da classe Jogo

        Jogo jogo1 = new Jogo("Elden Ring", "PC", 60);
        Jogo jogo2 = new Jogo("Zelda BOTW", "Switch", 70);
        Jogo jogo3 = new Jogo("Stardew Valley", "PC", 15);

        
        // 2. SIMULAR SESSÕES DE JOGO
        // Aqui estamos a simular o uso real dos jogos.
        // Cada chamada a jogar() acrescenta horas ao total.

        jogo1.jogar(40);   // primeira sessão
        jogo1.jogar(20);   // segunda sessão (total: 60 horas)

        jogo2.jogar(10);   // poucas horas jogadas

        jogo3.jogar(50);   // jogo longo
        jogo3.jogar(50);   // mais uma sessão (total: 100 horas)

        
        // 3. AVALIAR OS JOGOS
        // A avaliação é uma atribuição controlada (0 a 10).
        // Não soma, não calcula, apenas define o valor.

        jogo1.avaliar(9);
        jogo2.avaliar(8);
        jogo3.avaliar(10);

        // 4. MOSTRAR OS DETALHES DE CADA JOGO
        // O Main NÃO sabe como mostrar um jogo.
        // Apenas pede ao próprio objeto para se apresentar.

        System.out.println("=== DETALHES DOS JOGOS ===");
        jogo1.mostrarDetalhes();
        jogo2.mostrarDetalhes();
        jogo3.mostrarDetalhes();

        // 5. COMPARAR CUSTO-BENEFÍCIO
        // Melhor custo-benefício = menor valor por hora jogada.
        // O Main NÃO calcula fórmulas.
        // Apenas pede o valor ao objeto e compara resultados.

        Jogo melhorCustoBeneficio = jogo1;

        if (jogo2.getValorPorHora() != -1 &&
            jogo2.getValorPorHora() < melhorCustoBeneficio.getValorPorHora()) {
            melhorCustoBeneficio = jogo2;
        }

        if (jogo3.getValorPorHora() != -1 &&
            jogo3.getValorPorHora() < melhorCustoBeneficio.getValorPorHora()) {
            melhorCustoBeneficio = jogo3;
        }


        // 6. MOSTRAR O RESULTADO FINAL
        // Reutilizamos o método mostrarDetalhes().

        System.out.println("=== MELHOR CUSTO-BENEFÍCIO ===");
        melhorCustoBeneficio.mostrarDetalhes();
    }
}

