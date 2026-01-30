public class Main {
    public static void main(String[] args) {
        // 1 Criar um objeto Jogador
        Jogador jogador1 = new Jogador("GamerPro", "EquipaX");

        // 2 O jaogador ganha pontos em várias ocsasiões
        jogador1.ganharPontos(50);
        jogador1.ganharPontos(80);
        jogador1.ganharPontos(70);

        //3 Mostrar as estatísticas do jogador
        jogador1.mostrarEstatisticas();

    }

}
