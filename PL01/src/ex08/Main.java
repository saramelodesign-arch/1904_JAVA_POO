public class Main {

    public static void main(String[] args) {
        // Criar um objeto ContaBancaria
        ContaBancaria conta1 = new ContaBancaria("Sara Melo", "PT50 003 002 00123456789 01");

        System.out.println("Titular: " + conta1.getTitular());
        System.out.println("Saldo inicial: " + conta1.getSaldo() + " EUR");
        System.out.println("Estado inicial: " + conta1.getEstadoConta());

        System.out.println("______________________________");

        //2. Fazer depósito de 1000 EUR
        conta1.depositar(1000.0);

        //3. Mostrar saldo e estado da conta
        System.out.println("Saldo atual: " + conta1.getSaldo());
        System.out.println("Estado atual: " + conta1.getEstadoConta());

        //4. Fazer depósito de -500 EUR
        conta1.depositar(-500);
    }

}
