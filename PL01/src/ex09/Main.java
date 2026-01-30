public class Main {

    public static void main(String[] args) {
        //1 Criar Objecto Restaurante com capacidade máxima de 50 lugares
        Restaurante restaurante = new Restaurante("Restaurante A", 50);

        //2 Reservar 20 lugares
        restaurante.reservarMesa(20);
        System.out.println("Lugares ocupados atualmente: " + restaurante.getLugaresOcupados());

        //3 Libertar 5 lugares
        restaurante.libetarMesa(5);
        System.out.println("Lugares ocupados após saída: " + restaurante.getLugaresOcupados());

        //4 Reservar 40 lugares (deve falhar, pois 15+40=55 > 50 da capacidade máxima)
        restaurante1.reservarMesa(40);
        System.out.println("Lugares ocupados no final: " + restaurante.getLugaresOcupados());
    }
}
