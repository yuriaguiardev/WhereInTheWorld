package com.yuriaguiar.whereintheworld.resources;

import com.yuriaguiar.whereintheworld.entities.Country;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/countrys")
public class CountrysResource {

    @GetMapping
    public ResponseEntity<Country> findAll() {
        Country c = new Country(1L,"Brasil","America do Sul","100", "Brasilia", "BR");
        return ResponseEntity.ok().body(c);
    }
}
