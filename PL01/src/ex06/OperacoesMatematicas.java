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

    /**
     * Calcula a raiz quadrada de um número
     * 
     * @param num o número para o qual queremos a raiz
     * @return o resultado da raiz quadrada
     */
    public double raizQuadrada (double num) {
        return Math.sqrt(num);
    }

    /**
     * Calcula a média aritmética de 3 números
     * 
     * @param n1 o primeiro número
     * @param n2 o segundo número
     * @param n3 o terceiro némero
     * @return a média aritmética dos 3 números
     */

    public double media(double n1, double n2, double n3) {
        return (n1+n2+n3) / 3;
    }
}
