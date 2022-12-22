package agrupamento.create;

import java.util.*;
import java.util.stream.Collectors;

public class Escola {
    private String nome, CNPJ;
    private Endereco endereco;
    private List<Departamento> departamentos;
    private List<Aluno> discentes;

    public Escola(String nome, String CNPJ) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.departamentos = new ArrayList<Departamento>();
        this.discentes = new ArrayList<Aluno>();
    }

    public void criarDepartamento(String nome) {
        Departamento departamento = new Departamento(nome);
        departamentos.add(departamento);
    }

    public void fecharDepartamento(Departamento departamento) {
        departamentos.remove(departamento);
    }

    public void matricularAluno(Aluno aluno) {
        discentes.add(aluno);
    }

    public void trancarMatricula(Aluno aluno) {
        discentes.remove(aluno);
    }

    public void agruparAlunos(double a) {
        Map<String, Set<Aluno>> agrupamento = discentes.stream().collect(Collectors.groupingBy(Aluno::recuperarNaturalidade, TreeMap::new, Collectors.toSet()));
        System.out.println("Resultado do agrupamento por naturalidade: ");
        agrupamento.forEach((String chave, Set<Aluno> conjunto) -> System.out.println(chave + " = " + conjunto));
    }

    public void agruparAlunos(int a) {
        Map<String, Set<Aluno>> agrupamento = discentes.stream().collect(Collectors.groupingBy(Aluno::recuperarNaturalidade, Collectors.toSet()));
        System.out.println("Resultado do agrupamento por naturalidade: ");
        agrupamento.forEach((String chave, Set<Aluno> conjunto) -> System.out.println(chave + " = " + conjunto));
    }

    public void agruparAlunos(boolean b) {
        Map<String, List<Aluno>> agrupamento = discentes.stream().collect(Collectors.groupingBy(Aluno::recuperarNaturalidade));
        System.out.println("Agrupamento por naturalidade:");
        agrupamento.forEach((naturalidade, alunos) -> {
            System.out.println(naturalidade + ": " + alunos);
        });
    }

    public void agruparAlunos() {
        Map<String, List<Aluno>> agrupamento = new HashMap<>();
        for (Aluno aluno : discentes) {
            String naturalidade = aluno.recuperarNaturalidade();
            if (!agrupamento.containsKey(naturalidade)) {
                agrupamento.put(naturalidade, new ArrayList<>());
            }
            agrupamento.get(naturalidade).add(aluno);
        }
        System.out.println("Agrupamento por naturalidade: " + agrupamento);
    }
}
