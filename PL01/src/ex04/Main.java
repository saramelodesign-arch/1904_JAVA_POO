package ex04;

public class Main {
    public static void main(String[] args) {
        // Instancia um cilindro
        Cilindro cilindro = new Cilindro(5.0, 10.0);
        System.out.println(cilindro);

        //imprime os resultados formatados com 2 casas decimais
    System.out.println(String.format("Volume do cilindro: %.2f", cilindro.calcularVolume()));
    System.out.println(String.format("Área da superfície lateral do cilindro: %.2f", cilindro.calcularAreaSuperficie()));

    }

}
