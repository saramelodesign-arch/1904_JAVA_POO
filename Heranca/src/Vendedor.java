/**
 * Classe Vendedor - subclasse de Funcionario
 * 
 * Representa um vendedor que herda de funcionário e adiciona funcionalidades específicas de vendas e bónus.
 * 
 * @Author Sara Melo
 * @version 1.0
 */

public class Vendedor extends Funcionario {

    //Atributos privado adicional
    private double vendas;

    /**
     * Construtor da classe Vendedor
     * @param nome Nome do vendedor
     * @param salario Salário do vendedor
     * @param departamento Departamento do vendedor
     */

    public Vendedor(String nome, double salario, String departamento) {
        super(nome, salario, departamento);
        this.vendas = 0.0; //Inicializa vendas como 0
    }

    //Métodos getters
    public double getVendas() {
        return vendas;
    }

    //Métodos de funcionamento
    /**
     * Realiza o registo de uma venda e adiciona o valor ao total
     * @param valor Valor da venda a ser registada
     */

    public void registrarVenda(double valor) {
        if (valor >= 0) {
            this.vendas += valor;
        System.out.println(this.getNome() + " registou uma venda de: " + valor + "euros. Total de vendas: " + this.vendas);
        this.vendas + " euros.";
        }
    }
/**
 * Calcula o bónus do vendedor com base nas vendas realizadas
 */@returns O valor do bónus calculado
 */
    @Override
    public bonus() {
        double bonus = (vendas * 0.05) //5% das vendas como bónus
        return this.getSalario() + bonusVendas;
    }

    /**
     * 
     * Apresenta um relatório das vendas realizadas pelo vendedor
     */

    public void relatorioVendas() {
        System.out.println("Relatório de Vendas do Vendedor: " + this.getNome());
        System.out.println("Total de Vendas: " + this.vendas + " euros.");
    }

    //Método toString
    @Override
    public String toString() {
        return super.toString() + " -Vendas: " + vendas + " euros";
    }

}
