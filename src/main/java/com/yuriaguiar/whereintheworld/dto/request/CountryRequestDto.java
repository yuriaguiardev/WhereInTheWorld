package com.yuriaguiar.whereintheworld.dto.request;

import jakarta.persistence.Column;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;

public class CountryRequestDto implements Serializable {
    private String name;
    private String region;
    private String population;
    private String capital;
    private String sigla;
    private MultipartFile flag;

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

    public MultipartFile getFlag() {
        return flag;
    }

    public void setFlag(MultipartFile flag) {
        this.flag = flag;
    }
}
