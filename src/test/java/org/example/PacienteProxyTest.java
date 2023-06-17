package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PacienteProxyTest {

    @BeforeEach
    void setUp() {
        DB.addPaciente(new Paciente("17546733230", "Joao", 21, "Paraiba do Sul", "Exame de Fezes"));
        DB.addPaciente(new Paciente("12345678900", "Maria", 18, "Tres Rios", "Exame de Sangue"));
    }

    @Test
    void deveRetornarDadosPaciente() {
        PacienteProxy paciente = new PacienteProxy("17546733230");

        assertEquals(Arrays.asList("Joao", "Paraiba do Sul"), paciente.obterDados());
    }

    @Test
    void deveRetonarExamePaciente() {
        Funcionario funcionario = new Funcionario("Felipe", true);
        PacienteProxy paciente = new PacienteProxy("12345678900");

        assertEquals("Exame de Sangue", paciente.obterExame(funcionario));
    }

    @Test
    void deveRetonarExcecaoFuncionarioNaoAutorizadoAcessarDadosPaciente() {
        try {
            Funcionario funcionario = new Funcionario("Camila", false);
            PacienteProxy paciente = new PacienteProxy("12345678900");

            paciente.obterExame(funcionario);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("O funcionário não é médico. Acesso proibido.", e.getMessage());
        }
    }
}