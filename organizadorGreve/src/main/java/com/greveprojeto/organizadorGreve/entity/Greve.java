package com.greveprojeto.organizadorGreve.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name="tb_greve")
public class Greve {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID greveID;

    @Column(name = "motivo")
    private String motivo;

    @Column(name = "categoria")
    private String categoria;

    @Column(name = "sindicato")
    private String sindicato;

    @Column(name = "localGreve")
    private String localGreve;

    @Column(name = "numeroTrabalhadores")
    private Long numeroTrabalhadores;

    @Column(name = "dataInicio")
    private String dataInicio;

    @Column(name = "dataFim")
    private String dataFim;

    @Column(name = "estadoGreve")
    private String estadoGreve;

    @CreationTimestamp
    private Instant creationTimestamp;

    @UpdateTimestamp
    private Instant updateTimestamp;

    public Greve(UUID greveID, String motivo, String categoria, String sindicato, String localGreve, Long numeroTrabalhadores, String dataInicio, String dataFim, String estadoGreve, Instant creationTimestamp, Instant updateTimestamp) {
        this.greveID = greveID;
        this.motivo = motivo;
        this.categoria = categoria;
        this.sindicato = sindicato;
        this.localGreve = localGreve;
        this.numeroTrabalhadores = numeroTrabalhadores;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.estadoGreve = estadoGreve;
        this.creationTimestamp = creationTimestamp;
        this.updateTimestamp = updateTimestamp;
    }

    public Greve() {
    }

    public UUID getGreveID() {
        return greveID;
    }

    public void setGreveID(UUID greveID) {
        this.greveID = greveID;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getLocalGreve() {
        return localGreve;
    }

    public void setLocalGreve(String localGreve) {
        this.localGreve = localGreve;
    }

    public Instant getUpdateTimestamp() {
        return updateTimestamp;
    }

    public void setUpdateTimestamp(Instant updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

    public Instant getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(Instant creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    public String getEstadoGreve() {
        return estadoGreve;
    }

    public void setEstadoGreve(String estadoGreve) {
        this.estadoGreve = estadoGreve;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Long getNumeroTrabalhadores() {
        return numeroTrabalhadores;
    }

    public void setNumeroTrabalhadores(Long numeroTrabalhadores) {
        this.numeroTrabalhadores = numeroTrabalhadores;
    }

    public String getSindicato() {
        return sindicato;
    }

    public void setSindicato(String sindicato) {
        this.sindicato = sindicato;
    }
}
