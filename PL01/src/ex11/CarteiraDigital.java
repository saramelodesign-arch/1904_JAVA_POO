package ex11;
public class CarteiraDigital {
    //1  Atributos
    private String proprietario;
    private double saldo;
    private String moeda;
    private boolean ativa;

    /**
     * Construtor da classe enviarDinheiro
     * @param valor Valor a ser enviado
     * @param carteiraDestino Carteira digital de destino
     */
    public CarteiraDigital(String proprietario, String moeda) {
        this.proprietario = proprietario;
        this.moeda = moeda;
        this.saldo = 0.0;
        this.ativa = true;

        //2 Método enviarDinheiro que tem como valor a enviar ea carteira de destino
        //Ambas as carteiras devem estar ativas e usar a mesma moeda
        public void enviarDinheiro(double valor, CarteiraDigital carteiraDestino) {
            if (this.ativa && carteiraDestino.ativa && this.moeda.equals(carteiraDestino.moeda)) {
                if (valor > 0 && valor <= this.saldo) {
                    this.saldo -= valor;
                    carteiraDestino.saldo += valor;
                    System.out.println("Enviado " + valor + " " + moeda + " para " + carteiraDestino.proprietario);
                } else {
                    System.out.println("Saldo insuficiente ou valor inválido.");
                }
            } else {
                System.out.println("Carteiras inativas ou moedas incompatíveis.");
            }
        }

        //3 Método adicionarSaldo para aumentar o saldo, este método deve receber um valor como parâmetro e atualizar o saldo
        public void adicionarSaldo(double valor) {
            if (this.ativa && valor > 0) {
                this.saldo += valor;
                System.out.println("Adicionado " + valor + " " + moeda);
            } else {
                System.out.println("Valor inválido.");
            }
        }

        // Método gastar para diminuir o saldo, deve receber um valor como parâmetro e verificar se é possível a operação
        //considerando o saldo disponível, de seguida atualizar o saldo se a transação for possível
        public void gastar(double valor) {
            if (this.ativa && valor > 0 && valor <= this.saldo) {
                this.saldo -= valor;
                System.out.println("Gasto " + valor + " " + moeda);
            } else {
                System.out.println("Saldo insuficiente ou valor inválido.");
            }
        }
        // Método consultarSaldo para retornar o saldo atual e exibir na consla o saldo da carteira de forma formatada
        public double consultarSaldo() {
            System.out.printf("Saldo atual: %.2f %s%n", saldo, moeda);
            return saldo;
    }
    }
}
