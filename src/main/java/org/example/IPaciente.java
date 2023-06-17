package org.example;

import java.util.List;

public interface IPaciente {
    List<String> obterDados();
    String obterExame(Funcionario funcionario);
}