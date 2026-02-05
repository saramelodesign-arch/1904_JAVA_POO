import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe CesaeDigital - Sistema Central de Gestão Académica
 * 
 * Esta é a classe principal que vai gerir todo o sistema.
 * 
 * TODO: Adicionar as listas de cursos, turmas, UCs, professores e alunos
 * TODO: Implementar os submenus de cada opção
 * 
 * @author Sara Melo
 * @version 1.0
 */
public class CesaeDigital {

    // ========== ATRIBUTOS ==========
    private ArrayList<Curso> cursos;
    private ArrayList<Turma> turmas;
    private ArrayList<UnidadeCurricular> ucs;
    private ArrayList<Professor> professores;
    private ArrayList<Aluno> alunos;

    private Scanner scanner;

    // ========== CONSTRUTOR ==========
    public CesaeDigital() {
        scanner = new Scanner(System.in);

        // Inicialização das listas
        cursos = new ArrayList<>();
        turmas = new ArrayList<>();
        ucs = new ArrayList<>();
        professores = new ArrayList<>();
        alunos = new ArrayList<>();

        // Criar dados iniciais
        carregarDadosIniciais();
    }

    // ========== DADOS INICIAIS ==========
    private void carregarDadosIniciais() {

        // Professores
        Professor p1 = new Professor("Ana Silva", "ana@cesae.pt", "912345678", 35, "Programação");
        Professor p2 = new Professor("João Costa", "joao@cesae.pt", "913456789", 42, "Bases de Dados");

        professores.add(p1);
        professores.add(p2);

        // Unidades Curriculares
        UnidadeCurricular uc1 = new UnidadeCurricular("Programação Java", 100, p1);
        UnidadeCurricular uc2 = new UnidadeCurricular("Bases de Dados", 80, p2);

        ucs.add(uc1);
        ucs.add(uc2);

        // Curso
        Curso curso = new Curso("Desenvolvimento de Software", TipoCurso.FORMACAO);
        curso.adicionarUnidadeCurricular(uc1);
        curso.adicionarUnidadeCurricular(uc2);

        cursos.add(curso);

        // Turma
        Turma turma = new Turma("DS_2024", curso);
        turma.adicionarUnidadeCurricular(uc1);
        turma.adicionarUnidadeCurricular(uc2);

        turmas.add(turma);

        // Alunos
        Aluno a1 = new Aluno("Maria Santos", "maria@email.com", "914567890", 22);
        Aluno a2 = new Aluno("Pedro Rocha", "pedro@email.com", "915678901", 25);

        alunos.add(a1);
        alunos.add(a2);

        turma.adicionarAluno(a1);
        turma.adicionarAluno(a2);
    }

    // ========== MENU PRINCIPAL ==========
    public void menuPrincipal() {
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n╔══════════════════════════════════════════════╗");
            System.out.println("║     CESAE DIGITAL - GESTÃO ACADÉMICA         ║");
            System.out.println("╠══════════════════════════════════════════════╣");
            System.out.println("║  1. Gestão de Cursos                         ║");
            System.out.println("║  2. Gestão de Turmas                         ║");
            System.out.println("║  3. Gestão de Unidades Curriculares          ║");
            System.out.println("║  4. Gestão de Professores                    ║");
            System.out.println("║  5. Gestão de Alunos                         ║");
            System.out.println("║  6. Estatísticas e Relatórios                ║");
            System.out.println("║  0. Sair                                     ║");
            System.out.println("╚══════════════════════════════════════════════╝");
            System.out.print("Escolha uma opção: ");

            opcao = lerInteiro();

            switch (opcao) {
                case 1:
                    menuCursos();
                    break;

                case 2:
                    menuTurmas();
                    break;

                case 3:
                    menuUnidadesCurriculares();
                    break;

                case 4:
                    menuProfessores();
                    break;

                case 5:
                    menuAlunos();
                    break;

                case 6:
                    menuEstatisticas();
                    break;

                case 0:
                    System.out.println("\nObrigado por utilizar o sistema!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    // ========== MÉTODO AUXILIAR ==========
    private int lerInteiro() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.print("Valor inválido! Introduza um número: ");
            }
        }
    }

    // ====== GESTÃO DE ALUNOS ======
    private void menuAlunos() {
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n--- GESTÃO DE ALUNOS ---");
            System.out.println("1. Listar alunos");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");

            opcao = lerInteiro();

            switch (opcao) {
                case 1:
                    listarAlunos();
                    break;
                case 0:
                    System.out.println("A voltar ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private void listarAlunos() {
        System.out.println("\n--- LISTA DE ALUNOS ---");

        if (alunos.isEmpty()) {
            System.out.println("Não existem alunos registados.");
        } else {
            for (Aluno aluno : alunos) {
                System.out.println("--------------------");
                aluno.mostrarDetalhes();
            }
        }
    }

    // ========== GESTÃO DE PROFESSORES ==========
    private void menuProfessores() {
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n--- GESTÃO DE PROFESSORES ---");
            System.out.println("1. Listar professores");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");

            opcao = lerInteiro();

            switch (opcao) {
                case 1:
                    listarProfessores();
                    break;
                case 0:
                    System.out.println("A voltar ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    // ========== LISTAR PROFESSORES ==========
    private void listarProfessores() {
        System.out.println("\n--- LISTA DE PROFESSORES ---");

        if (professores.isEmpty()) {
            System.out.println("Não existem professores registados.");
        } else {
            for (Professor professor : professores) {
                System.out.println("--------------------");
                professor.mostrarDetalhes();
            }
        }
    }

    // ========== GESTÃO DE CURSOS ==========
    private void menuCursos() {
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n--- GESTÃO DE CURSOS ---");
            System.out.println("1. Listar cursos");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");

            opcao = lerInteiro();

            switch (opcao) {
                case 1:
                    listarCursos();
                    break;
                case 0:
                    System.out.println("A voltar ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    // ========== LISTAR CURSOS ==========
    private void listarCursos() {
        System.out.println("\n--- LISTA DE CURSOS ---");

        if (cursos.isEmpty()) {
            System.out.println("Não existem cursos registados.");
        } else {
            for (Curso curso : cursos) {
                System.out.println("--------------------");
                curso.mostrarDetalhes();
            }
        }
    }

    // ========== GESTÃO DE TURMAS ==========
    private void menuTurmas() {
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n--- GESTÃO DE TURMAS ---");
            System.out.println("1. Listar turmas");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");

            opcao = lerInteiro();

            switch (opcao) {
                case 1:
                    listarTurmas();
                    break;
                case 0:
                    System.out.println("A voltar ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    // ========== LISTAR TURMAS ==========
    private void listarTurmas() {
        System.out.println("\n--- LISTA DE TURMAS ---");

        if (turmas.isEmpty()) {
            System.out.println("Não existem turmas registadas.");
        } else {
            for (Turma turma : turmas) {
                System.out.println("--------------------");
                turma.mostrarDetalhes();
            }
        }
    }

    // ========== GESTÃO DE UNIDADES CURRICULARES ==========
    private void menuUnidadesCurriculares() {
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n--- GESTÃO DE UNIDADES CURRICULARES ---");
            System.out.println("1. Listar unidades curriculares");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");

            opcao = lerInteiro();

            switch (opcao) {
                case 1:
                    listarUnidadesCurriculares();
                    break;
                case 0:
                    System.out.println("A voltar ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    // ========== LISTAR UNIDADES CURRICULARES ==========
    private void listarUnidadesCurriculares() {
        System.out.println("\n--- LISTA DE UNIDADES CURRICULARES ---");

        if (ucs.isEmpty()) {
            System.out.println("Não existem unidades curriculares registadas.");
        } else {
            for (UnidadeCurricular uc : ucs) {
                System.out.println("--------------------");
                uc.mostrarDetalhes();
            }
        }
    }

    // ========== ESTATÍSTICAS ==========
    private void menuEstatisticas() {
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n--- ESTATÍSTICAS E RELATÓRIOS ---");
            System.out.println("1. Número total de alunos");
            System.out.println("2. Número total de professores");
            System.out.println("3. Número total de cursos");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");

            opcao = lerInteiro();

            switch (opcao) {
                case 1:
                    mostrarTotalAlunos();
                    break;
                case 2:
                    mostrarTotalProfessores();
                    break;
                case 3:
                    mostrarTotalCursos();
                    break;
                case 0:
                    System.out.println("A voltar ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    // ========== ESTATÍSTICAS INDIVIDUAIS ==========
    private void mostrarTotalAlunos() {
        System.out.println("Total de alunos: " + alunos.size());
    }

    private void mostrarTotalProfessores() {
        System.out.println("Total de professores: " + professores.size());
    }

    private void mostrarTotalCursos() {
        System.out.println("Total de cursos: " + cursos.size());
    }

}
