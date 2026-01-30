public class ContaBancaria {
    // Atributos privados
    private String titular;
    private String numeroConta;
    private double saldo;
    private boolean ativa;

    // Construtor
    public ContaBancaria(String titular, String numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
        this.ativa = true;
    }

    // Método que retorna o estado de conta com base no saldo
    public String estadoConta() {
        if (saldo > 0) {
            return "Conta Positiva";
            } else if (saldo == 0) {
                return "Conta a Zero";
            } else {
                return "Conta Negativa";
            }
    }

    // Método depositar na conta se activa
    public void depositar(double valor) {
        if (ativa && valor > 0) {
            saldo += valor;
            System.out.println("Depósito de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Acção impossível. Conta do titular " + titular + " não está activa ou valor inválido.");
        }
    }

    //Getters
    get estadoConta {
        return estadoConta();
    }

    get saldo {
        return saldo;
    }

    public String getEstadoConta() {
        return estadoConta();
    }

    public double getSaldo() {
        return saldo;
    }

}
