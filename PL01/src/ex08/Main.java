public class Main {

    public static void main(String[] args) {
        ContaBancaria conta1 =
            new ContaBancaria("Sara Melo", "PT50 003 002 00123456789 01");

        System.out.println("Titular: " + conta1.getTitular());
        System.out.println("Saldo inicial: " + conta1.getSaldo() + " EUR");
        System.out.println("Estado inicial: " + conta1.estadoConta());

        System.out.println("______________________________");

        conta1.depositar(1000.0);

        System.out.println("Saldo atual: " + conta1.getSaldo() + " EUR");
        System.out.println("Estado atual: " + conta1.estadoConta());

        conta1.depositar(-500);
    }
}
