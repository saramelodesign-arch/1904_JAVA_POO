package ex05;

/**
 * Cria uma classe chamada "Telemovel" com os seguintes atributos: marca,
 * modelo, bateria (percentagem, valor
 * entre 0-100) e ligado (boolean).
 * Cria um método "ligar()" que verifica se há bateria (>0%) e altera o estado
 * para ligado, imprimindo
 * mensagens apropriadas.
 * Cria um método "desligar()" que altera o estado para desligado.
 * Cria um método "usarTelemovel(int minutos)" que consome 1% de bateria por
 * cada 10 minutos de uso
 * (só funciona se estiver ligado).
 * Cria dois objetos da classe "Telemovel" e testa todos os métodos, simulando
 * diferentes cenários de uso.
 */

public class Telemovel {

     // Atributos Privados

     private String marca;

     private String modelo;

     private int bateria; // 0 - 100

     private boolean ligado;

     /**
      * 
      * Construtor da classe Telemovel
      * 
      * 
      * 
      * @param marca   Marca do telemóvel
      * 
      * @param modelo  Modelo do telemóvel
      * 
      * @param bateria Nível de bateria inicial (0-100)
      * 
      *                Não necessitamos de usar a variável ligado no construtor, pois
      *                o telemóvel começa desligado
      * 
      */

     public Telemovel(String marca, String modelo, int bateria) {

          this.marca = marca;

          this.modelo = modelo;

          // this.bateria = Math.max(0, Math.min(100, bateria)); // Garantir que a bateria
          // está entre 0 e 100

          if (bateria > 100) {

               this.bateria = 100;

          } else if (bateria < 0) {

               this.bateria = 0;

          } else {

               this.bateria = bateria;

          }

          this.ligado = false; // Telemóvel começa desligado

     }

     // Método para ligar o telemóvel

     public void ligar() {

          if (bateria > 0) {

               ligado = true;

               System.out.println(marca + " " + modelo + " ligado com sucesso (" + bateria + "% de bateria).");

          } else {

               System.out.println("Não é possível ligar o " + marca + " " + modelo + ": Bateria a 0%.");

          }

     }

     // Método para desligar o telemóvel

     public void desligar() {

          if (!ligado) {

               System.out.println("O " + marca + " " + modelo + " já está desligado.");

          } else {

               ligado = false;

               System.out.println(marca + " " + modelo + " desligado com sucesso.");

          }

     }

     /**
      * simula o uso do telemóvel, consumindo bateria
      * consome 1% de bateria por cada 10 minutos de uso
      * 
      * NOTA: A variável 'minutos' alor quando o método é chamado.
      * Ex. t1.usarTelemovel(50); inicia os minutos com o valor 50.
      * 
      * @param minutos Tempo de uso em minutos (fornecido ao chamar o método)
      */

     public void usarTelemovel(int minutos) {
          if (!ligado) {

               System.out.println("O " + marca + " " + modelo + " Está desligado.");
          }

          // Calculo do consumo de bateria
          int consumo = minutos / 10;

          if (consumo == 0 && minutos > 0) {
               System.out.println(
                         marca + " " + modelo + "foi usado por " + minutos + " minutos e não consumiu bateria.");
          }

          // Subtrai o consumo calculado da bateria atual
          bateria -= consumo;
          if (bateria <= 0) {
               bateria = 0;
               ligado = false;
               System.out.println(marca + " " + modelo + " usado por " + minutos
                         + " minutos. Bateria esgotada e telemóvel desligado.");
          } else {
               System.out.println(marca + " " + modelo + " usado por " + minutos + " minutos. Bateria atual: " + bateria + "%.");
          }
     }

     //Métodos Getters para consulta
     public String getMarca() {
          return marca;
     }

     public String getModelo() {
          return modelo;
     }

     public int getBateria() {
          return bateria;
     }

     public boolean isLigado() {
          return ligado;
     }

}