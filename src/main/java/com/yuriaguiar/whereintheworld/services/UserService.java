package com.yuriaguiar.whereintheworld.services;

import com.yuriaguiar.whereintheworld.entities.Country;
import com.yuriaguiar.whereintheworld.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;


import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<Country> findAll(){
        return repository.findAll();
    }

    public Country findByName(String name){
        Optional<Country> obj = repository.findByName(name);
        return obj.get();
    }

    public Country findBySigla(String sigla){
        Optional<Country> obj = repository.findBySigla(sigla);
        return obj.get();
    }

    public List<Country> findAllByRegion(String region){
        return repository.findAllByRegion(region);
    }


}
