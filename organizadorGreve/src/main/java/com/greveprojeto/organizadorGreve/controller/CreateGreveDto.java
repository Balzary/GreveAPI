package com.greveprojeto.organizadorGreve.controller;

import java.time.LocalDate;

public record CreateGreveDto(String motivo,
                             String categoria,
                             String sindicato,
                             Long numeroTrabalhadores,
                             String localGreve,
                             LocalDate dataInicio,
                             LocalDate dataFim,
                             String estadoGreve ) {
}
