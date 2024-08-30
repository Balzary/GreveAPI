package com.greveprojeto.organizadorGreve.repository;

import com.greveprojeto.organizadorGreve.entity.Greve;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface GreveRepository extends JpaRepository<Greve, UUID> {

    List<Greve> findBySindicatoIgnoreCase(String sindicato);
}
