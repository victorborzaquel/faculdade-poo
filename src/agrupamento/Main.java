package agrupamento.create;

public class Main {
    private static final Aluno[] alunos = {
        new Aluno("João", "São Paulo"),
        new Aluno("Maria", "Rio de Janeiro"),
        new Aluno("José", "São Paulo"),
        new Aluno("Ana", "Rio de Janeiro"),
        new Aluno("Pedro", "Barra"),
        new Aluno("Paula", "Miami"),
        new Aluno("Carlos", "Realengo"),
        new Aluno("Carla", "Barra"),
        new Aluno("Joaquim", "Tijuca"),
        new Aluno("Joaquina", "Tijuca"),
    };

    public static void main(String[] args) {
        Aluno aluno = new Aluno("João", "São Paulo");

        System.out.println(aluno);
        Escola escola = new Escola("Escola de Programação", "123456789");

        // groupingByConcurrent
        // groupingBy
        matricularAlunos(escola);
        System.out.println("Default");
        escola.agruparAlunos();
        System.out.println("Boolean");
        escola.agruparAlunos(true);
        System.out.println("Int");
        escola.agruparAlunos(1);
        System.out.println("Double");
        escola.agruparAlunos(1d);
    }

    public static void matricularAlunos(Escola escola) {
        for (Aluno aluno : alunos) {
            escola.matricularAluno(aluno);
        }
    }
}
