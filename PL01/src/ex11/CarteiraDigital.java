package ex11;

public class CarteiraDigital {

    // Atributos
    private String proprietario;
    private double saldo;
    private String moeda;
    private boolean ativa;

    // Construtor
    public CarteiraDigital(String proprietario, String moeda) {
        this.proprietario = proprietario;
        this.moeda = moeda;
        this.saldo = 0.0;
        this.ativa = true;
    }

    // Enviar dinheiro para outra carteira
    public void enviarDinheiro(double valor, CarteiraDigital carteiraDestino) {
        if (this.ativa && carteiraDestino.ativa && this.moeda.equals(carteiraDestino.moeda)) {
            if (valor > 0 && valor <= this.saldo) {
                this.saldo -= valor;
                carteiraDestino.saldo += valor;
                System.out.println(
                    "Enviado " + valor + " " + moeda + " para " + carteiraDestino.proprietario
                );
            } else {
                System.out.println("Saldo insuficiente ou valor inválido.");
            }
        } else {
            System.out.println("Carteiras inativas ou moedas incompatíveis.");
        }
    }

    // Adicionar saldo
    public void adicionarSaldo(double valor) {
        if (ativa && valor > 0) {
            saldo += valor;
            System.out.println("Adicionado " + valor + " " + moeda);
        } else {
            System.out.println("Valor inválido.");
        }
    }

    // Gastar saldo
    public void gastar(double valor) {
        if (ativa && valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Gasto " + valor + " " + moeda);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    // Consultar saldo
    public double consultarSaldo() {
        System.out.printf("Saldo atual: %.2f %s%n", saldo, moeda);
        return saldo;
    }

    // Getters úteis
    public String getProprietario() {
        return proprietario;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getMoeda() {
        return moeda;
    }

    public boolean isAtiva() {
        return ativa;
    }
}
