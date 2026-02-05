# Projeto Final – Java POO  
Sistema de Gestão Académica – CESAE Digital

## Descrição
Projeto desenvolvido no âmbito da unidade curricular de Programação Orientada a Objetos (Java).  
O sistema permite gerir alunos, professores, cursos, turmas e unidades curriculares, recorrendo a conceitos fundamentais de POO.

## Funcionalidades
- Listagem de alunos
- Listagem de professores
- Listagem de cursos
- Listagem de turmas
- Listagem de unidades curriculares
- Estatísticas simples (totais)

## Conceitos Aplicados
- Classes e Objetos
- Encapsulamento
- Herança
- Classe abstracta
- Polimorfismo
- Enums
- ArrayList
- Menus com `while` e `switch`

## Estrutura do Projeto
- `App` – ponto de entrada da aplicação
- `CesaeDigital` – gestão do sistema e menus
- `Pessoa` – classe abstracta base
- `Aluno` e `Professor` – subclasses
- `Curso`, `Turma`, `UnidadeCurricular` – entidades académicas
- `EstadoAluno`, `TipoCurso` – enums

## Execução
Compilar e executar a partir da pasta do projeto:

```bash
javac -d bin src/*.java
java -cp bin App
