package com.yuriaguiar.whereintheworld.dto;

import com.yuriaguiar.whereintheworld.dto.request.CountryRequestDto;
import com.yuriaguiar.whereintheworld.entities.Country;
import org.springframework.stereotype.Component;

import java.io.IOException;
@Component
public class CountryMapper {
    public Country toEntity(CountryRequestDto countryDto) throws IOException {
        byte[] documentoBase64 = countryDto.getFlag().getBytes();
        Country country = new Country();
        country.setFlag(documentoBase64);
        country.setName(countryDto.getName());
        country.setPopulation(countryDto.getPopulation());
        country.setCapital(countryDto.getCapital());
        country.setRegion(countryDto.getRegion());
        country.setSigla(countryDto.getSigla());
        return country;
    }
}
