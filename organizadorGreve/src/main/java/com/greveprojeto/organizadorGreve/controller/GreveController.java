package com.greveprojeto.organizadorGreve.controller;

import com.greveprojeto.organizadorGreve.entity.Greve;
import com.greveprojeto.organizadorGreve.service.GreveService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/v1/greve")
public class GreveController {

    private GreveService greveService;

    public GreveController(GreveService greveService) {
        this.greveService = greveService;
    }

    @PostMapping
    public ResponseEntity<Greve> createGreve(@RequestBody CreateGreveDto createGreveDto) {
        var greveID = greveService.createGreve(createGreveDto);
        return ResponseEntity.created(URI.create("v1/greve/" + greveID.toString())).build();
    }

    @GetMapping("/{greveID}")
    public ResponseEntity<Greve> getGreveById(@PathVariable("greveId") String greveId) {
        var greve = greveService.getGreveById(greveId);
        if (greve.isPresent()) {
            return ResponseEntity.ok(greve.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/greves/{sindicato}")
    public ResponseEntity<List<Greve>> listUsersBySindicato(@PathVariable("sindicato") String sindicato) {
        var greves = greveService.listUsersBySindicato(sindicato);

        return ResponseEntity.ok(greves);
    }

    @GetMapping
    public ResponseEntity<List<Greve>> listGreve() {
        var greves = greveService.listUsers();

        return ResponseEntity.ok(greves);
    }

    @PutMapping("/{greveId}")
    public ResponseEntity<Void> updateGreveById(@PathVariable("greveId") String greveID,
                                               @RequestBody UpdateGreveDto updateGreveDto) {
        greveService.updateGreveById(greveID, updateGreveDto);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{greveId}")
    public ResponseEntity<Void> deleteById(@PathVariable("greveId") String greveID) {
        greveService.deletebyId(greveID);
        return ResponseEntity.noContent().build();
    }
}
