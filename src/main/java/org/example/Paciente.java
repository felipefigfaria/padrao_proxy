package org.example;

import java.util.Arrays;
import java.util.List;

public class Paciente implements IPaciente {

    private String cpf;
    private String nome;
    private Integer idade;
    private String cidade;
    private String exame;

    public Paciente(String cpf) {
        this.cpf = cpf;
        Paciente paciente = DB.getPaciente(cpf);
        this.nome = paciente.nome;
        this.idade = paciente.idade;
        this.cidade = paciente.cidade;
        this.exame = paciente.exame;
    }

    public Paciente(String cpf, String nome, Integer idade, String cidade, String exame) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
        this.exame = exame;
    }

    public String getCpf() {
        return this.cpf;
    }

    @Override
    public List<String> obterDados() {
        return Arrays.asList(this.nome, this.cidade);
    }

    @Override
    public String obterExame(Funcionario funcionario) {
        return this.exame;
    }
}
