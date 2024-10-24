package com.yuriaguiar.whereintheworld.entities;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table (name = "tb_user")
public class Country implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "ID")
    private Long id;
    @Column (name = "NAME")
    private String name;
    @Column (name = "REGION")
    private String region;
    @Column (name = "POPULATION")
    private String population;
    @Column (name = "CAPITAL")
    private String capital;
    @Column (name = "SIGLA")
    private String sigla;

    public Country() {
    }

    public Country(Long id, String name, String region, String population, String capital, String sigla) {
        this.id = id;
        this.name = name;
        this.region = region;
        this.population = population;
        this.capital = capital;
        this.sigla = sigla;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
}