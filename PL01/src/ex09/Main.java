public class Main {

    public static void main(String[] args) {

        // 1. Criar objeto Restaurante com capacidade máxima de 50 lugares
        Restaurante restaurante = new Restaurante("Restaurante A", 50);

        // 2. Reservar 20 lugares
        restaurante.reservarMesa(20);
        System.out.println("Lugares ocupados atualmente: " + restaurante.getLugaresOcupados());

        // 3. Libertar 5 lugares
        restaurante.libertarMesa(5);
        System.out.println("Lugares ocupados após saída: " + restaurante.getLugaresOcupados());

        // 4. Reservar 40 lugares (deve falhar: 15 + 40 > 50)
        restaurante.reservarMesa(40);
        System.out.println("Lugares ocupados no final: " + restaurante.getLugaresOcupados());
    }
}
