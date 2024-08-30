package com.greveprojeto.organizadorGreve.controller;

import java.time.LocalDate;

public record CreateGreveDto(String motivo,
                             String categoria,
                             String sindicato,
                             String localGreve,
                             Long numeroTrabalhadores,
                             String dataInicio,
                             String dataFim,
                             String estadoGreve ) {
}
