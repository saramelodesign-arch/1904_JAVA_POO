package ex02;

public class Gato {

    /**
     * 2. Escreve um programa onde crias uma classe chamada "Gato" com um nome (String), cor do pelo (String) e um
     * som (String) que por defeito deve ser "Miau".
     * -Deve conter um método miar() que imprime na consola o respetivo som.
     * -Deve conter um método brincar() que imprime "[nome do gato] está a brincar!".
     * -Cria duas instâncias da classe "Gato", define os seus atributos usando o construtor.
     * -Modifica o som de um dos gatos usando o setter (por exemplo, para "Mrrr") e invoca os métodos miar()
     * e brincar() para ambos.
     */

    // Atributos
    private String nome;
    private String corPelo;
    private String som;

    /**
     * Construtor da classe Gato
     * @param nome    Nome do gato
     * @param corPelo Cor do pelo do gato
     * @param som     Som do gato
     */

    public Gato(String nome, String corPelo, String som) {
        this.nome = nome;
        this.corPelo = corPelo;
        this.som = "Miau"; // Som por defeito, que é o mesmo para todos os gatos
    }

    /**
     * método miar: Imprime na consola o som do gato e seu som atual
     */
    public void miar() {
        System.out.println(nome + " diz: " + som);
    }

    /**
     * método brincar: Imprime na consola que o gato está a brincar
     */
    public void brincar() {
        System.out.println(nome + " está a brincar!");
    }

    /**
     * Método Getter: permite ler os conteúdos dos atributos privados
     * @return nome do gato
     */
    public String getNome() {
        return nome;
    }

    public String getCorPelo() {
        return corPelo;
    }

    public String getSom() {
        return som;
    }

    /**
     * Método Setter: permite alterar os conteúdos dos atributos privados
     * @param novoSom Novo som do gato
     */
    public void setSom(String novoSom) {
        this.som = novoSom;
    }
}