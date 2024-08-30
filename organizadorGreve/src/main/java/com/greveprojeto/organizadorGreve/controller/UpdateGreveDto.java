package com.greveprojeto.organizadorGreve.controller;

import java.time.LocalDate;

public record UpdateGreveDto(Long numeroTrabalhadores,
                             String localGreve,
                             LocalDate dataInicio,
                             LocalDate dataFim,
                             String estadoGreve )  {
}
