# Exercício – Classes Abstractas e Polimorfismo (Java)

## Descrição
Exercício desenvolvido no âmbito da Programação Orientada a Objetos em Java, com o objetivo de demonstrar a utilização de **classes abstractas**, **herança** e **polimorfismo**.

O sistema representa diferentes tipos de veículos que partilham um comportamento comum.

## Estrutura do Projeto
- `Veiculo.java` – classe abstracta que define o método abstracto `andar()`
- `Carro.java` – subclasse de `Veiculo` que implementa o método `andar()`
- `Bicicleta.java` – subclasse de `Veiculo` que implementa o método `andar()`
- `Main.java` – classe principal que demonstra polimorfismo através de uma `ArrayList`

## Funcionamento
No programa principal:
- é criada uma `ArrayList<Veiculo>`
- são adicionados objetos das subclasses `Carro` e `Bicicleta`
- a lista é percorrida com um ciclo `for-each`
- o método `andar()` é chamado para cada objeto, sendo o comportamento decidido em tempo de execução

## Conceitos Aplicados
- Programação Orientada a Objetos
- Classe abstracta
- Método abstracto
- Herança (`extends`)
- Override de métodos
- Polimorfismo
- `ArrayList`
- Ciclo `for-each`

## Execução
Compilar e executar a partir da pasta do exercício:

```bash
javac *.java
java Main
