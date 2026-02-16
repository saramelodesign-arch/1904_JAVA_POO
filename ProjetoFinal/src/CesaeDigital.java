import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe CesaeDigital - Sistema Central de Gestão Académica
 * 
 * Esta é a classe principal que vai gerir todo o sistema.
 * 
 * TODO: Adicionar as listas de cursos, turmas, UCs, professores e alunos TODO:
 * Implementar os submenus de cada opção
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

        cursos = new ArrayList<>();
        turmas = new ArrayList<>();
        ucs = new ArrayList<>();
        professores = new ArrayList<>();
        alunos = new ArrayList<>();

        carregarDadosIniciais();
    }

    // ========== DADOS INICIAIS ==========
    private void carregarDadosIniciais() {

        Professor p1 = new Professor("Ana Silva", "ana@cesae.pt", "912345678", 35, "Programação");
        Professor p2 = new Professor("João Costa", "joao@cesae.pt", "913456789", 42, "Bases de Dados");

        professores.add(p1);
        professores.add(p2);

        UnidadeCurricular uc1 = new UnidadeCurricular("Programação Java", 100, p1);
        UnidadeCurricular uc2 = new UnidadeCurricular("Bases de Dados", 80, p2);

        ucs.add(uc1);
        ucs.add(uc2);

        Curso curso = new Curso("Desenvolvimento de Software", TipoCurso.FORMACAO);
        curso.adicionarUnidadeCurricular(uc1);
        curso.adicionarUnidadeCurricular(uc2);

        cursos.add(curso);

        Turma turma = new Turma("DS_2024", curso);
        turma.adicionarUnidadeCurricular(uc1);
        turma.adicionarUnidadeCurricular(uc2);

        turmas.add(turma);

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

    private int lerInteiro() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.print("Valor inválido! Introduza um número: ");
            }
        }
    }

    // GESTÃO DE CURSOS
    // MENU
    private void menuCursos() {
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n--- GESTÃO DE CURSOS ---");
            System.out.println("1. Criar curso");
            System.out.println("2. Listar cursos");
            System.out.println("3. Editar curso");
            System.out.println("4. Remover curso");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");

            opcao = lerInteiro();

            switch (opcao) {
            case 1:
                criarCurso();
                break;
            case 2:
                listarCursos();
                break;
            case 3:
                editarCurso();
                break;
            case 4:
                removerCurso();
                break;
            case 0:
                System.out.println("A voltar ao menu principal...");
                break;
            default:
                System.out.println("Opção inválida!");
            }
        }
    }

    // CREATE
   private void criarCurso() {
    System.out.println("\n--- CRIAR CURSO ---");

    System.out.print("Nome do curso: ");
    String nome = scanner.nextLine();

    System.out.println("Tipo de curso:");
    System.out.println("1. Formação");
    System.out.println("2. Pós-Graduação");
    System.out.println("3. Workshop");

    int tipoOpcao = lerInteiro();
    TipoCurso tipo;

    switch (tipoOpcao) {
        case 1:
            tipo = TipoCurso.FORMACAO;
            break;
        case 2:
            tipo = TipoCurso.POS_GRADUACAO;
            break;
        case 3:
            tipo = TipoCurso.WORKSHOP;
            break;
        default:
            System.out.println("Tipo inválido. Curso não criado.");
            return;
    }

    Curso novoCurso = new Curso(nome, tipo);
    cursos.add(novoCurso);

    System.out.println("Curso criado com sucesso!");
}

//READ
private void listarCursos() {
    System.out.println("\n--- LISTA DE CURSOS ---");

    if (cursos.isEmpty()) {
        System.out.println("Não existem cursos registados.");
    } else {
        for (int i = 0; i < cursos.size(); i++) {
            System.out.println((i + 1) + " --------------------");
            cursos.get(i).mostrarDetalhes();
        }
    }
}


    // UPDATE
   private void editarCurso() {

    listarCursos();

    if (cursos.isEmpty()) return;

    System.out.print("Escolha o número do curso a editar: ");
    int indice = lerInteiro() - 1;

    if (indice >= 0 && indice < cursos.size()) {

        Curso curso = cursos.get(indice);

        System.out.print("Novo nome: ");
        String novoNome = scanner.nextLine();
        curso.setNome(novoNome);

        System.out.println("Novo tipo:");
        System.out.println("1. Formação");
        System.out.println("2. Pós-Graduação");
        System.out.println("3. Workshop");

        int tipoOpcao = lerInteiro();

        switch (tipoOpcao) {
            case 1:
                curso.setTipo(TipoCurso.FORMACAO);
                break;
            case 2:
                curso.setTipo(TipoCurso.POS_GRADUACAO);
                break;
            case 3:
                curso.setTipo(TipoCurso.WORKSHOP);
                break;
            default:
                System.out.println("Tipo inválido. Mantido o tipo anterior.");
        }

        System.out.println("Curso atualizado com sucesso!");

    } else {
        System.out.println("Curso inválido!");
    }
}


    // DELETE
private void removerCurso() {

    listarCursos();

    if (cursos.isEmpty()) return;

    System.out.print("Escolha o número do curso a remover: ");
    int indice = lerInteiro() - 1;

    if (indice >= 0 && indice < cursos.size()) {

        Curso cursoRemovido = cursos.remove(indice);

        // Remover turmas associadas ao curso
        turmas.removeIf(t -> t.getCurso().equals(cursoRemovido));

        System.out.println("Curso removido com sucesso!");

    } else {
        System.out.println("Curso inválido!");
    }
}


    // GESTÃO DE TURMAS
    //MENU
    private void menuTurmas() {
    int opcao = -1;

    while (opcao != 0) {
        System.out.println("\n--- GESTÃO DE TURMAS ---");
        System.out.println("1. Criar turma");
        System.out.println("2. Listar turmas");
        System.out.println("3. Editar turma");
        System.out.println("4. Remover turma");
        System.out.println("5. Associar UC à turma");
        System.out.println("6. Remover UC da turma");
        System.out.println("0. Voltar");
        System.out.print("Escolha uma opção: ");

        opcao = lerInteiro();

        switch (opcao) {
            case 1:
                criarTurma();
                break;
            case 2:
                listarTurmas();
                break;
            case 3:
                editarTurma();
                break;
            case 4:
                removerTurma();
                break;
            case 5:
                associarUcTurma();
                break;
            case 6:
                removerUcTurma();
                break;
            case 0:
                System.out.println("A voltar ao menu principal...");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}

    // CREATE
 private void criarTurma() {

    if (cursos.isEmpty()) {
        System.out.println("Não existem cursos. Crie primeiro um curso.");
        return;
    }

    System.out.println("\n--- CRIAR TURMA ---");

    System.out.print("Nome da turma: ");
    String nome = scanner.nextLine();

    listarCursos();

    System.out.print("Escolha o número do curso: ");
    int indiceCurso = lerInteiro() - 1;

    if (indiceCurso >= 0 && indiceCurso < cursos.size()) {

        Curso cursoSelecionado = cursos.get(indiceCurso);
        Turma novaTurma = new Turma(nome, cursoSelecionado);

        turmas.add(novaTurma);

        System.out.println("Turma criada com sucesso!");

    } else {
        System.out.println("Curso inválido.");
    }
}
//READ
private void listarTurmas() {

    System.out.println("\n--- LISTA DE TURMAS ---");

    if (turmas.isEmpty()) {
        System.out.println("Não existem turmas registadas.");
    } else {
        for (int i = 0; i < turmas.size(); i++) {
            System.out.println((i + 1) + " --------------------");
            turmas.get(i).mostrarDetalhes();
        }
    }
}

    // UPDATE
private void editarTurma() {

    listarTurmas();

    if (turmas.isEmpty()) return;

    System.out.print("Escolha o número da turma a editar: ");
    int indice = lerInteiro() - 1;

    if (indice >= 0 && indice < turmas.size()) {

        Turma turma = turmas.get(indice);

        System.out.print("Novo nome da turma: ");
        String novoNome = scanner.nextLine();
        turma.setNome(novoNome);

        System.out.println("Turma atualizada com sucesso!");

    } else {
        System.out.println("Turma inválida.");
    }
}

    // DELETE
private void removerTurma() {

    listarTurmas();

    if (turmas.isEmpty()) return;

    System.out.print("Escolha o número da turma a remover: ");
    int indice = lerInteiro() - 1;

    if (indice >= 0 && indice < turmas.size()) {

        turmas.remove(indice);
        System.out.println("Turma removida com sucesso!");

    } else {
        System.out.println("Turma inválida.");
    }
}

//Associar UC à Turma
private void associarUcTurma() {

    if (turmas.isEmpty() || ucs.isEmpty()) {
        System.out.println("Necessita de turmas e UCs criadas.");
        return;
    }

    listarTurmas();
    System.out.print("Escolha a turma: ");
    int indiceTurma = lerInteiro() - 1;

    if (indiceTurma < 0 || indiceTurma >= turmas.size()) {
        System.out.println("Turma inválida.");
        return;
    }

    listarUnidadesCurriculares();
    System.out.print("Escolha a UC: ");
    int indiceUc = lerInteiro() - 1;

    if (indiceUc < 0 || indiceUc >= ucs.size()) {
        System.out.println("UC inválida.");
        return;
    }

    turmas.get(indiceTurma).adicionarUnidadeCurricular(ucs.get(indiceUc));

    System.out.println("UC associada com sucesso!");
}

//Remover UC da Turma
private void removerUcTurma() {

    listarTurmas();

    if (turmas.isEmpty()) return;

    System.out.print("Escolha a turma: ");
    int indiceTurma = lerInteiro() - 1;

    if (indiceTurma < 0 || indiceTurma >= turmas.size()) {
        System.out.println("Turma inválida.");
        return;
    }

    Turma turma = turmas.get(indiceTurma);

    turma.listarUnidadesCurriculares();

    System.out.print("Escolha a UC a remover: ");
    int indiceUc = lerInteiro() - 1;

    turma.removerUnidadeCurricular(indiceUc);

    System.out.println("UC removida com sucesso!");
}



// GESTÃO DE UNIDADES CURRICULARES
//MENU
private void menuUnidadesCurriculares() {
    int opcao = -1;

    while (opcao != 0) {
        System.out.println("\n--- GESTÃO DE UNIDADES CURRICULARES ---");
        System.out.println("1. Criar UC");
        System.out.println("2. Listar UCs");
        System.out.println("3. Editar UC");
        System.out.println("4. Remover UC");
        System.out.println("5. Alterar Professor da UC");
        System.out.println("0. Voltar");
        System.out.print("Escolha uma opção: ");

        opcao = lerInteiro();

        switch (opcao) {
            case 1:
                criarUc();
                break;
            case 2:
                listarUnidadesCurriculares();
                break;
            case 3:
                editarUc();
                break;
            case 4:
                removerUc();
                break;
            case 5:
                alterarProfessorUc();
                break;
            case 0:
                System.out.println("A voltar ao menu principal...");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}

//CREATE — Criar UC
private void criarUc() {

    if (professores.isEmpty()) {
        System.out.println("Não existem professores registados.");
        return;
    }

    System.out.println("\n--- CRIAR UNIDADE CURRICULAR ---");

    System.out.print("Nome da UC: ");
    String nome = scanner.nextLine();

    System.out.print("Carga horária: ");
    int cargaHoraria = lerInteiro();

    listarProfessores();
    System.out.print("Escolha o número do professor: ");
    int indiceProf = lerInteiro() - 1;

    if (indiceProf >= 0 && indiceProf < professores.size()) {

        Professor professor = professores.get(indiceProf);
        UnidadeCurricular novaUc = new UnidadeCurricular(nome, cargaHoraria, professor);

        ucs.add(novaUc);

        System.out.println("UC criada com sucesso!");

    } else {
        System.out.println("Professor inválido.");
    }
}

//READ — Listar UCs (numerado)
private void listarUnidadesCurriculares() {

    System.out.println("\n--- LISTA DE UNIDADES CURRICULARES ---");

    if (ucs.isEmpty()) {
        System.out.println("Não existem unidades curriculares registadas.");
    } else {
        for (int i = 0; i < ucs.size(); i++) {
            System.out.println((i + 1) + " --------------------");
            ucs.get(i).mostrarDetalhes();
        }
    }
}

//UPDATE — Editar UC
private void editarUc() {

    listarUnidadesCurriculares();

    if (ucs.isEmpty()) return;

    System.out.print("Escolha o número da UC a editar: ");
    int indice = lerInteiro() - 1;

    if (indice >= 0 && indice < ucs.size()) {

        UnidadeCurricular uc = ucs.get(indice);

        System.out.print("Novo nome: ");
        uc.setNome(scanner.nextLine());

        System.out.print("Nova carga horária: ");
        uc.setCargaHoraria(lerInteiro());

        System.out.println("UC atualizada com sucesso!");

    } else {
        System.out.println("UC inválida.");
    }
}

//DELETE — Remover UC
private void removerUc() {

    listarUnidadesCurriculares();

    if (ucs.isEmpty()) return;

    System.out.print("Escolha o número da UC a remover: ");
    int indice = lerInteiro() - 1;

    if (indice >= 0 && indice < ucs.size()) {

        UnidadeCurricular ucRemovida = ucs.remove(indice);

        // Remover UC de todas as turmas
        for (Turma turma : turmas) {
            turma.removerUcPorReferencia(ucRemovida);
        }

        // Remover UC de todos os cursos
        for (Curso curso : cursos) {
            curso.removerUcPorReferencia(ucRemovida);
        }

        System.out.println("UC removida com sucesso!");

    } else {
        System.out.println("UC inválida.");
    }
}

//ALTERAR PROFESSOR DA UC
private void alterarProfessorUc() {

    listarUnidadesCurriculares();

    if (ucs.isEmpty()) return;

    System.out.print("Escolha a UC: ");
    int indiceUc = lerInteiro() - 1;

    if (indiceUc < 0 || indiceUc >= ucs.size()) {
        System.out.println("UC inválida.");
        return;
    }

    listarProfessores();
    System.out.print("Escolha o novo professor: ");
    int indiceProf = lerInteiro() - 1;

    if (indiceProf < 0 || indiceProf >= professores.size()) {
        System.out.println("Professor inválido.");
        return;
    }

    ucs.get(indiceUc).setProfessor(professores.get(indiceProf));

    System.out.println("Professor alterado com sucesso!");
}


// GESTÃO DE PROFESSORES
//MENU
private void menuProfessores() {
    int opcao = -1;

    while (opcao != 0) {
        System.out.println("\n--- GESTÃO DE PROFESSORES ---");
        System.out.println("1. Criar professor");
        System.out.println("2. Listar professores");
        System.out.println("3. Editar professor");
        System.out.println("4. Remover professor");
        System.out.println("5. Associar UC ao professor");
        System.out.println("6. Remover UC do professor");
        System.out.println("0. Voltar");
        System.out.print("Escolha uma opção: ");

        opcao = lerInteiro();

        switch (opcao) {
            case 1:
                criarProfessor();
                break;
            case 2:
                listarProfessores();
                break;
            case 3:
                editarProfessor();
                break;
            case 4:
                removerProfessor();
                break;
            case 5:
                associarUcProfessor();
                break;
            case 6:
                removerUcProfessor();
                break;
            case 0:
                System.out.println("A voltar ao menu principal...");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}

//CREATE
private void criarProfessor() {

    System.out.println("\n--- CRIAR PROFESSOR ---");

    System.out.print("Nome: ");
    String nome = scanner.nextLine();

    System.out.print("Email: ");
    String email = scanner.nextLine();

    System.out.print("Telefone: ");
    String telefone = scanner.nextLine();

    System.out.print("Idade: ");
    int idade = lerInteiro();

    System.out.print("Especialidade: ");
    String especialidade = scanner.nextLine();

    Professor novoProfessor = new Professor(nome, email, telefone, idade, especialidade);
    professores.add(novoProfessor);

    System.out.println("Professor criado com sucesso!");
}

//READ
private void listarProfessores() {

    System.out.println("\n--- LISTA DE PROFESSORES ---");

    if (professores.isEmpty()) {
        System.out.println("Não existem professores registados.");
    } else {
        for (int i = 0; i < professores.size(); i++) {
            System.out.println((i + 1) + " --------------------");
            professores.get(i).mostrarDetalhes();
        }
    }
}

//UPDATE
private void editarProfessor() {

    listarProfessores();

    if (professores.isEmpty()) return;

    System.out.print("Escolha o número do professor a editar: ");
    int indice = lerInteiro() - 1;

    if (indice >= 0 && indice < professores.size()) {

        Professor professor = professores.get(indice);

        System.out.print("Novo nome: ");
        professor.setNome(scanner.nextLine());

        System.out.print("Novo email: ");
        professor.setEmail(scanner.nextLine());

        System.out.print("Novo telefone: ");
        professor.setTelefone(scanner.nextLine());

        System.out.print("Nova idade: ");
        professor.setIdade(lerInteiro());

        System.out.print("Nova especialidade: ");
        professor.setAreaEspecializacao(scanner.nextLine());

        System.out.println("Professor atualizado com sucesso!");

    } else {
        System.out.println("Professor inválido.");
    }
}

//DELETE
private void removerProfessor() {

    listarProfessores();

    if (professores.isEmpty()) return;

    System.out.print("Escolha o número do professor a remover: ");
    int indice = lerInteiro() - 1;

    if (indice >= 0 && indice < professores.size()) {

        Professor professorRemovido = professores.remove(indice);

        // Remover professor das UCs
        for (UnidadeCurricular uc : ucs) {
            if (uc.getProfessor().equals(professorRemovido)) {
                uc.setProfessor(null);
            }
        }

        System.out.println("Professor removido com sucesso!");

    } else {
        System.out.println("Professor inválido.");
    }
}

//Associar UC ao Professor
private void associarUcProfessor() {

    if (professores.isEmpty() || ucs.isEmpty()) {
        System.out.println("Necessita de professores e UCs criadas.");
        return;
    }

    listarProfessores();
    System.out.print("Escolha o professor: ");
    int indiceProf = lerInteiro() - 1;

    if (indiceProf < 0 || indiceProf >= professores.size()) {
        System.out.println("Professor inválido.");
        return;
    }

    listarUnidadesCurriculares();
    System.out.print("Escolha a UC: ");
    int indiceUc = lerInteiro() - 1;

    if (indiceUc < 0 || indiceUc >= ucs.size()) {
        System.out.println("UC inválida.");
        return;
    }

    ucs.get(indiceUc).setProfessor(professores.get(indiceProf));

    System.out.println("UC associada ao professor com sucesso!");
}

//Remover UC do Professor
private void removerUcProfessor() {

    listarUnidadesCurriculares();

    if (ucs.isEmpty()) return;

    System.out.print("Escolha a UC: ");
    int indiceUc = lerInteiro() - 1;

    if (indiceUc < 0 || indiceUc >= ucs.size()) {
        System.out.println("UC inválida.");
        return;
    }

    ucs.get(indiceUc).setProfessor(null);

    System.out.println("UC removida do professor com sucesso!");
}


// GESTÃO DE ALUNOS
//MENU
private void menuAlunos() {
    int opcao = -1;

    while (opcao != 0) {
        System.out.println("\n--- GESTÃO DE ALUNOS ---");
        System.out.println("1. Criar aluno");
        System.out.println("2. Listar alunos");
        System.out.println("3. Editar aluno");
        System.out.println("4. Remover aluno");
        System.out.println("5. Alterar estado");
        System.out.println("6. Associar aluno a turma");
        System.out.println("7. Registar nota");
        System.out.println("8. Listar alunos por turma");
        System.out.println("0. Voltar");
        System.out.print("Escolha uma opção: ");

        opcao = lerInteiro();

        switch (opcao) {
            case 1: criarAluno(); break;
            case 2: listarAlunos(); break;
            case 3: editarAluno(); break;
            case 4: removerAluno(); break;
            case 5: alterarEstadoAluno(); break;
            case 6: associarAlunoTurma(); break;
            case 7: registarNota(); break;
            case 8: listarAlunosPorTurma(); break;
            case 0: System.out.println("A voltar..."); break;
            default: System.out.println("Opção inválida!");
        }
    }
}

//CREATE
private void criarAluno() {

    System.out.println("\n--- CRIAR ALUNO ---");

    System.out.print("Nome: ");
    String nome = scanner.nextLine();

    System.out.print("Email: ");
    String email = scanner.nextLine();

    System.out.print("Telefone: ");
    String telefone = scanner.nextLine();

    System.out.print("Idade: ");
    int idade = lerInteiro();

    Aluno novoAluno = new Aluno(nome, email, telefone, idade);
    alunos.add(novoAluno);

    System.out.println("Aluno criado com sucesso!");
}

//READ
private void listarAlunos() {

    System.out.println("\n--- LISTA DE ALUNOS ---");

    if (alunos.isEmpty()) {
        System.out.println("Não existem alunos.");
    } else {
        for (int i = 0; i < alunos.size(); i++) {
            System.out.println((i + 1) + " --------------------");
            alunos.get(i).mostrarDetalhes();
        }
    }
}

//UPDATE
private void editarAluno() {

    listarAlunos();
    if (alunos.isEmpty()) return;

    System.out.print("Escolha o número do aluno: ");
    int indice = lerInteiro() - 1;

    if (indice >= 0 && indice < alunos.size()) {

        Aluno aluno = alunos.get(indice);

        System.out.print("Novo nome: ");
        aluno.setNome(scanner.nextLine());

        System.out.print("Novo email: ");
        aluno.setEmail(scanner.nextLine());

        System.out.print("Novo telefone: ");
        aluno.setTelefone(scanner.nextLine());

        System.out.print("Nova idade: ");
        aluno.setIdade(lerInteiro());

        System.out.println("Aluno atualizado!");

    } else {
        System.out.println("Aluno inválido.");
    }
}

//DELETE
private void removerAluno() {

    listarAlunos();
    if (alunos.isEmpty()) return;

    System.out.print("Escolha o número do aluno: ");
    int indice = lerInteiro() - 1;

    if (indice >= 0 && indice < alunos.size()) {

        Aluno aluno = alunos.get(indice);

        System.out.print("Novo nome: ");
        aluno.setNome(scanner.nextLine());

        System.out.print("Novo email: ");
        aluno.setEmail(scanner.nextLine());

        System.out.print("Novo telefone: ");
        aluno.setTelefone(scanner.nextLine());

        System.out.print("Nova idade: ");
        aluno.setIdade(lerInteiro());

        System.out.println("Aluno atualizado!");

    } else {
        System.out.println("Aluno inválido.");
    }
}

//Alterar Estado
private void alterarEstadoAluno() {

    listarAlunos();
    if (alunos.isEmpty()) return;

    System.out.print("Escolha o aluno: ");
    int indice = lerInteiro() - 1;

    if (indice < 0 || indice >= alunos.size()) {
        System.out.println("Aluno inválido.");
        return;
    }

    System.out.println("1. ATIVO");
    System.out.println("2. SUSPENSO");
    System.out.println("3. CONCLUIDO");
    System.out.println("4. DESISTENTE");

    int opcao = lerInteiro();

    EstadoAluno estado;

    switch (opcao) {
        case 1: estado = EstadoAluno.ATIVO; break;
        case 2: estado = EstadoAluno.SUSPENSO; break;
        case 3: estado = EstadoAluno.CONCLUIDO; break;
        case 4: estado = EstadoAluno.DESISTENTE; break;
        default:
            System.out.println("Estado inválido.");
            return;
    }

    alunos.get(indice).setEstado(estado);

    System.out.println("Estado atualizado!");
}

//Associar Aluno à Turma
private void associarAlunoTurma() {

    if (turmas.isEmpty()) {
        System.out.println("Não existem turmas.");
        return;
    }

    listarAlunos();
    System.out.print("Escolha o aluno: ");
    int indiceAluno = lerInteiro() - 1;

    listarTurmas();
    System.out.print("Escolha a turma: ");
    int indiceTurma = lerInteiro() - 1;

    if (indiceAluno >= 0 && indiceAluno < alunos.size()
            && indiceTurma >= 0 && indiceTurma < turmas.size()) {

        turmas.get(indiceTurma).adicionarAluno(alunos.get(indiceAluno));
        System.out.println("Aluno associado à turma!");

    } else {
        System.out.println("Dados inválidos.");
    }
}

//Registar Nota
private void registarNota() {

    listarAlunos();
    if (alunos.isEmpty()) return;

    System.out.print("Escolha o aluno: ");
    int indiceAluno = lerInteiro() - 1;

    listarUnidadesCurriculares();
    System.out.print("Escolha a UC: ");
    int indiceUc = lerInteiro() - 1;

    System.out.print("Nota (0-20): ");
    double nota = Double.parseDouble(scanner.nextLine());

    alunos.get(indiceAluno).registarNota(ucs.get(indiceUc), nota);

    System.out.println("Nota registada!");
}

//Listar Alunos por Turma
private void listarAlunosPorTurma() {

    listarTurmas();
    if (turmas.isEmpty()) return;

    System.out.print("Escolha a turma: ");
    int indice = lerInteiro() - 1;

    if (indice >= 0 && indice < turmas.size()) {
        turmas.get(indice).listarAlunos();
    } else {
        System.out.println("Turma inválida.");
    }
}

//ESTATÍSTICAS E RELATÓRIOS COMPLETOS
//MENU
private void menuEstatisticas() {
    int opcao = -1;

    while (opcao != 0) {
        System.out.println("\n--- ESTATÍSTICAS E RELATÓRIOS ---");
        System.out.println("1. Total de alunos");
        System.out.println("2. Total de professores");
        System.out.println("3. Total de cursos");
        System.out.println("4. Total de turmas");
        System.out.println("5. Média de um aluno");
        System.out.println("6. Média de uma turma");
        System.out.println("7. Alunos acima de média");
        System.out.println("8. Professor com mais UCs");
        System.out.println("9. Turma com mais alunos");
        System.out.println("10. Turma com menos alunos");
        System.out.println("11. Listar alunos por estado");
        System.out.println("12. Taxa de ocupação por turma");
        System.out.println("0. Voltar");
        System.out.print("Escolha uma opção: ");

        opcao = lerInteiro();

        switch (opcao) {
            case 1: System.out.println("Total alunos: " + alunos.size()); break;
            case 2: System.out.println("Total professores: " + professores.size()); break;
            case 3: System.out.println("Total cursos: " + cursos.size()); break;
            case 4: System.out.println("Total turmas: " + turmas.size()); break;
            case 5: mediaAluno(); break;
            case 6: mediaTurma(); break;
            case 7: alunosAcimaMedia(); break;
            case 8: professorComMaisUcs(); break;
            case 9: turmaComMaisAlunos(); break;
            case 10: turmaComMenosAlunos(); break;
            case 11: listarAlunosPorEstado(); break;
            case 12: taxaOcupacaoTurma(); break;
            case 0: break;
            default: System.out.println("Opção inválida!");
        }
    }
}

//Média de um aluno
private void mediaAluno() {

    listarAlunos();
    if (alunos.isEmpty()) return;

    System.out.print("Escolha o aluno: ");
    int indice = lerInteiro() - 1;

    if (indice >= 0 && indice < alunos.size()) {
        double media = alunos.get(indice).calcularMedia();
        System.out.println("Média do aluno: " + media);
    } else {
        System.out.println("Aluno inválido.");
    }
}

//Média de uma turma
private void mediaTurma() {

    listarTurmas();
    if (turmas.isEmpty()) return;

    System.out.print("Escolha a turma: ");
    int indice = lerInteiro() - 1;

    if (indice >= 0 && indice < turmas.size()) {
        double media = turmas.get(indice).calcularMediaTurma();
        System.out.println("Média da turma: " + media);
    } else {
        System.out.println("Turma inválida.");
    }
}

//Alunos acima de média
private void alunosAcimaMedia() {

    System.out.print("Introduza a média mínima: ");
    double valor = Double.parseDouble(scanner.nextLine());

    for (Aluno aluno : alunos) {
        if (aluno.calcularMedia() >= valor) {
            aluno.mostrarDetalhes();
        }
    }
}

//Professor com mais UCs
private void professorComMaisUcs() {

    if (professores.isEmpty()) return;

    Professor melhor = null;
    int max = 0;

    for (Professor p : professores) {
        int total = p.getNumeroUcs();
        if (total > max) {
            max = total;
            melhor = p;
        }
    }

    if (melhor != null) {
        System.out.println("Professor com mais UCs:");
        melhor.mostrarDetalhes();
    }
}

//Turma com mais alunos
private void turmaComMaisAlunos() {

    if (turmas.isEmpty()) return;

    Turma maior = null;
    int max = 0;

    for (Turma t : turmas) {
        int total = t.getNumeroAlunos();
        if (total > max) {
            max = total;
            maior = t;
        }
    }

    if (maior != null) {
        System.out.println("Turma com mais alunos:");
        maior.mostrarDetalhes();
    }
}

//Turma com menos alunos
private void turmaComMenosAlunos() {

    if (turmas.isEmpty()) return;

    Turma menor = turmas.get(0);
    int min = menor.getNumeroAlunos();

    for (Turma t : turmas) {
        if (t.getNumeroAlunos() < min) {
            min = t.getNumeroAlunos();
            menor = t;
        }
    }

    System.out.println("Turma com menos alunos:");
    menor.mostrarDetalhes();
}

//Listar alunos por estado
private void listarAlunosPorEstado() {

    System.out.println("1. ATIVO");
    System.out.println("2. SUSPENSO");
    System.out.println("3. CONCLUIDO");
    System.out.println("4. DESISTENTE");

    int opcao = lerInteiro();
    EstadoAluno estado = EstadoAluno.values()[opcao - 1];

    for (Aluno aluno : alunos) {
        if (aluno.getEstado() == estado) {
            aluno.mostrarDetalhes();
        }
    }
}

//Taxa de ocupação da turma
private void taxaOcupacaoTurma() {

    listarTurmas();
    if (turmas.isEmpty()) return;

    System.out.print("Escolha a turma: ");
    int indice = lerInteiro() - 1;

    if (indice >= 0 && indice < turmas.size()) {

        Turma turma = turmas.get(indice);

        int total = turma.getNumeroAlunos();
        int capacidade = turma.getCapacidadeMaxima();

        double taxa = (double) total / capacidade * 100;

        System.out.println("Taxa de ocupação: " + taxa + "%");

    } else {
        System.out.println("Turma inválida.");
    }
}
}

