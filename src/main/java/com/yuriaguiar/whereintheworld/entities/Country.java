package com.yuriaguiar.whereintheworld.entities;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table (name = "TB_COUNTRY")
public class Country  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "ID_COUNTRY")
    private Long id;

    @Column (name = "NM_COUNTRY")
    private String name;

    @Column (name = "NM_REGION")
    private String region;

    @Column (name = "QT_POPULATION")
    private String population;

    @Column (name = "NM_CAPITAL")
    private String capital;

    @Column (name = "SG_COUNTRY")
    private String sigla;

    @Lob
    @Column (name ="BI_FLAG")
    private byte[] biFlag;

    public Country() {
    }

    public Country(Long id, String name, String region, String population, String capital, String sigla, byte[] biFlag) {
        this.id = id;
        this.name = name;
        this.region = region;
        this.population = population;
        this.capital = capital;
        this.sigla = sigla;
        this.biFlag = biFlag;
    }

    public byte[] getBiFlag() {
        return biFlag;
    }

    public void setFlag(byte[] biFlag) {
        this.biFlag = biFlag;
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