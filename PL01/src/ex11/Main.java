public class Main {
    public static void main(String[] args) {
        // 1 Cria um objeto da classe CarteiraDigital
        CarteiraDigital carteira1 = new CarteiraDigital("Alice", "USD");

        //Método para adicionar 500 EUR e consultar saldo
        carteira1.adicionarSaldo(500);
        carteira1.consultarSaldo();

        //Método para gastar 75 EUR e exibe o saldo
        carteira1.gastar(75);
        carteira1.consultarSaldo();
        System.out.println("O saldo atual é: " + carteira1.consultarSaldo());
        

    }
}