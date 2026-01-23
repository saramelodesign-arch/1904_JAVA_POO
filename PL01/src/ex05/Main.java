package ex05;

public class Main {
    public static void main(String[] args) {
        
        //1. Criar dois objetos Telemovel com diferentes marcas, modelos e níveis de bateria.
        Telemovel t1 = new Telemovel("Apple", "iPhone 16", 100);
        Telemovel t2 = new Telemovel("Samsung", "Galaxy S24", 5);

        //2. Cenário 1: Ligar e usar o primeiro telemóvel.
        System.out.println("--- Cenário 1---");
        t1.ligar();
        t1.usarTelemovel(50); // deve gastar 5% de bateria
        t1.desligar();
        t1.usarTelemovel(10); // não deve funcionar, telemóvel desligado
        System.out.println("O nível de bateria do " + t1.getMarca()+ " " + t1.getModelo() + " é " + t1.getBateria() + "% e encontra-se " + (t1.isLigado() ? "ligado" : "desligado"));

        //3. Cenário 2: 
        System.out.println("---Cenário 2---");
        t2.ligar();
        t2.usarTelemovel(60); //deve gastar 6% da bateria
        t2.ligar();
        System.out.println("O nível de bateria do " + t2.getMarca()+ " " + t2.getModelo() + " é " + t1.getBateria() + "% e encontra-se " + (t2.isLigado() ? "ligado" : "desligado"));
    }

}


