package org.example;

public class Funcionario {

    private String nome;
    private boolean medico;

    public Funcionario(String nome, boolean medico) {
        this.nome = nome;
        this.medico = medico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isMedico() {
        return medico;
    }

    public void setMedico(boolean medico) {
        this.medico = medico;
    }
}