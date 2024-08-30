package com.greveprojeto.organizadorGreve.service;

import com.greveprojeto.organizadorGreve.controller.CreateGreveDto;
import com.greveprojeto.organizadorGreve.controller.UpdateGreveDto;
import com.greveprojeto.organizadorGreve.entity.Greve;
import com.greveprojeto.organizadorGreve.repository.GreveRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class GreveService {

    private GreveRepository greveRepository;

    public GreveService(GreveRepository greveRepository) {
        this.greveRepository = greveRepository;
    }

    public UUID createGreve(CreateGreveDto createGreveDto) {

        var entity = new Greve(
                UUID.randomUUID(),
                createGreveDto.motivo(),
                createGreveDto.categoria(),
                createGreveDto.sindicato(),
                createGreveDto.numeroTrabalhadores(),
                createGreveDto.localGreve(),
                createGreveDto.dataInicio(),
                createGreveDto.dataFim(),
                createGreveDto.estadoGreve(),
                Instant.now(),
                null);

        var greveSaved = greveRepository.save(entity);

        return greveSaved.getGreveID();
    }

    public Optional<Greve> getGreveById(String greveId) {
        return greveRepository.findById(UUID.fromString(greveId));
    }

    public List<Greve> listUsersBySindicato(String sindicato) {
        return greveRepository.findBySindicatoIgnoreCase(sindicato);
    }

    public List<Greve> listUsers() {
        return greveRepository.findAll();
    }

    public void updateGreveById(String greveId,
                               UpdateGreveDto updateGreveDto){
        var id = UUID.fromString(greveId);
        var greveEntity = greveRepository.findById(id);

        if (greveEntity.isPresent()) {
            var greve = greveEntity.get();

            if (updateGreveDto.numeroTrabalhadores() != null) {
                greve.setNumeroTrabalhadores(updateGreveDto.numeroTrabalhadores());
            }

            if (updateGreveDto.localGreve() != null) {
                greve.setLocalGreve(updateGreveDto.localGreve());
            }

             if (updateGreveDto.dataInicio() != null) {
                greve.setDataInicio(updateGreveDto.dataInicio());
            }

             if (updateGreveDto.dataFim() != null) {
                greve.setDataFim(updateGreveDto.dataFim());
            }

             if (updateGreveDto.estadoGreve() != null) {
                greve.setEstadoGreve(updateGreveDto.estadoGreve());
            }

            greveRepository.save(greve);
        }
    }

    public void deletebyId(String greveId) {
        var id = UUID.fromString(greveId);
        var greveExists = greveRepository.existsById(id);
        if (greveExists) {
            greveRepository.deleteById(id);
        }
    }

}
