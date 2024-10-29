package com.yuriaguiar.whereintheworld.services;

import com.yuriaguiar.whereintheworld.dto.CountryMapper;
import com.yuriaguiar.whereintheworld.dto.request.CountryRequestDto;
import com.yuriaguiar.whereintheworld.entities.Country;
import com.yuriaguiar.whereintheworld.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;


import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;
    @Autowired
    private CountryMapper countryMapper;

    public List<Country> findAll(){
        return repository.findAll();
    }

    public Country findByName(String name){
        Optional<Country> obj = repository.findByName(name.toUpperCase());
        return obj.get();
    }

    public Country findBySigla(String sigla){
        Optional<Country> obj = repository.findBySigla(sigla.toUpperCase());
        return obj.get();
    }

    public List<Country> findAllByRegion(String region){
        return repository.findAllByRegion(region.toUpperCase());
    }

    public Long saveCountry(CountryRequestDto countryDto) throws IOException {
        return repository.save(countryMapper.toEntity(countryDto)).getId();

    }


}
