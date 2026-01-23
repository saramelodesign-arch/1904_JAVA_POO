package ex06;
/**
 * A classe operacoesMatematicas só nos vai fornecer métodos para calculos comuns.
 * Esta classe demonstra o uso de métodos que não usam atributis
 * e que retornam valores (using return)
 */


public class OperacoesMatematicas {
    
    /**
     * construtor da classe
     * Mesmo que a classe não tenha atributos vamos precisar de um construtor para crar um objeto
     * sem este construtor, não podemos criar objectos desta classe
     */

    public OperacoesMatematicas() {
        //Vazio pois não há atributos para inicializar
    }

    /**
     * Calcular a potência e um número
     * 
     * @param base a base da potencia
     * @param expoente o expoente da potencia
     * @return resultado da potencia
     */

    public double potencia(double base, double expoente) {
        return Math.pow(base, expoente);
    }
}
