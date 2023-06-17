package org.example;

import java.util.HashMap;
import java.util.Map;

public class DB {

    private static Map<String, Paciente> pacientes = new HashMap<>();

    public static Paciente getPaciente(String cpf) {
        return pacientes.get(cpf);
    }

    public static void addPaciente(Paciente paciente) {
        pacientes.put(paciente.getCpf(), paciente);
    }
}