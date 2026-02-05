public class Funcionario {

    /**
     * Classe Funcionário - superclasse para o sistema de Gestão de Funcionários
     * 
     * Representa um funcionário com informações sobre o nome, salário, departamento e horas de trabalho.
     * Serve como base para outras subclasses especializadas (Vendedor, Gerente)
     * 
     * @Author Sara Melo
     * @version 1.0
     */

    public class Funcionario {
        private String nome;
        private double salario;
        private String departamento;
        private int horas_trabalho;

        /**
         * Construtor da classe Funcionario
         * @param nome Nome do funcionário
         * @param salario Salário do funcionário
         * @param departamento Departamento do funcionário
         */
public Funcionario(String nome, double salario, String departamento) {
            this.nome = nome;
            this.salario = salario;
            this.departamento = departamento;
            this.horas_trabalho = 0; //Inicializa horas trabalhadas como 0
}
 //Métodos getters
        public String getNome() {
            return nome;
        }
        public double getSalario() {
            return salario;
        }
        public String getDepartamento() {
            return departamento;
        }
        public int getHorasTrabalho() {
            return horas_trabalho;
        }
 //Métodos setters
        public void setNome(String nome) {
            this.nome = nome;
        }
        public void setSalario(double salario) {
            this.salario = salario;
        }
        public void setDepartamento(String departamento) {
            this.departamento = departamento;
        }
        public void setHorasTrabalho(int horas_trabalho) {
            this.horas_trabalho = horas_trabalho;
        }

        //Métodos de funcionamento
        /**
         * Registar as horas de trabalho do funcionário
         * Adiciona as horas ao contador total
         * @param horas Número de horas a adicionar
         */

        public void trabalhar(int horas) {
            if (horas >= 0) {
                this.horas_trabalho += horas;
            System.out.println(nome + " trabalhou " + horas + " horas. Total de horas: " + this.horas_trabalho);
            }
        }

        /**
         * Calcula o búnus do funcionário
         * Na classe base, o bónus é o salário + 100 euros
         * 
         * @return Valor do bónus
         */

        public double bonus() {
            return salario + 100;
        }

        /**
         * Método para exibir informações do funcionário
         * @return String com as informações formatadas
         */
        @Override
        public String toString() {
            return "Nome: " + nome + " Departamento: " + departamento + " Salário: " + salario + " Horas de Trabalho: " + horas_trabalho;
        }
            
}
