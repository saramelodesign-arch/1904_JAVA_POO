package ex07;

public class Main {

    //1. Criar dois filmes: filme1 e filme2, com classificações etárias diferentes
    public static void main(String[] args) {
        Filme filme1 = new Filme("Máquina do Tempo", "John Doe", "Ficção Científica", 120, 12);
        Filme filme2 = new Filme("Divertidamente", "Jane Smith", "Animação", 90, 6);

        //2. Mostrar informações de cada filme
        System.out.println("Informações dos Filmes:");
        filme1.mostrarInformacao();
        System.out.println();
        filme2.mostrarInformacao();
        System.out.println();

        //3. Verificar se espectador de 10 anos pode ver cada filme
        System.out.println("---Teste de Acesso (idade 10):");
        int idadeEspectador = 10;
        System.out.println("Idade do espectador: " + idadeEspectador + " anos");

        // System.out.println("Pode ver o filme '" + filme1.getTitulo() + "'? " + (filme1.podeVerFilme(idadeEspectador) ? "Sim" : "Não"));
        // System.out.println("Pode ver o filme '" + filme2.getTitulo() + "'? " + (filme2.podeVerFilme(idadeEspectador) ? "Sim" : "Não"));

        //4.Testar o acesso usando o método auxiliar
        testarAcesso(filme1, idadeEspectador);
        testarAcesso(filme2, idadeEspectador);
    }

    /**
     * Método auxiliar para verificar e imprimir se um espectador pode ver um filme com base na sua idade
     * 
     */
    public static void testarAcesso(Filme f, int idade) {
        if (f.podeVerFilme(idade)) {
            System.out.println("Pode ver o filme '" + f.getTitulo() + "'.");
        } else {
            System.out.println("Não pode ver o filme '" + f.getTitulo() + " - Classificação demasiado alta.'");
        }
    }

}
