package com.greveprojeto.organizadorGreve.controller;

import java.time.LocalDate;

public record UpdateGreveDto(Long numeroTrabalhadores,
                             String localGreve,
                             String dataInicio,
                             String dataFim,
                             String estadoGreve )  {
}
