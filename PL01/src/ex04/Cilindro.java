package ex04;

public class Cilindro {
    
    /**
     *  Escreve um programa onde crias uma classe chamada "Cilindro" com atributos raio e altura.
     * Instância um cilindro.
     * Cria métodos para calcular o volume (π × raio² × altura) e a área da superfície lateral (2 × π × raio × altura)
     * do cilindro.  
     * Imprime os resultados formatados com 2 casas decimais. 
     */

    // Atributos privados
    private double raio;
    private double altura;

    /**
     * Construtor da classe Cilindro
     * @param raio
     * @param altura
     */

    public Cilindro(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    /**
     * Método para calcular o volume do cilindro
     * @return volume do cilindro
     */

    public double calcularVolume() {
        return Math.PI * Math.pow(raio, 2) * altura;
    }

    /**
     * Método para calcular a área da superfície lateral do cilindro
     * @return área da superfície lateral do cilindro
     */

    public double calcularAreaSuperficie() {
        return 2 * Math.PI * raio * altura;
    }

    // Getters
    public double getAltura() {
        return altura;
    }
    public double getRaio() {
        return raio;
    }        
}
