package com.yuriaguiar.whereintheworld.resources;

import com.yuriaguiar.whereintheworld.entities.Country;
import com.yuriaguiar.whereintheworld.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/countrys")
public class CountrysResource {

    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<List<Country>> findAll() {
        List<Country> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{name}")
    public ResponseEntity<Country> findByName(@PathVariable String name) {
        Country obj = service.findByName(name);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping(value = "/sigla/{sigla}")
    public ResponseEntity<Country> findBySigla(@PathVariable String sigla) {
        Country obj = service.findBySigla(sigla);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping(value = "/region/{region}")
    public ResponseEntity<List<Country>> findAllByRegion(@PathVariable String region) {
        List<Country> obj = service.findAllByRegion(region);
        return ResponseEntity.ok().body(obj);
    }

}
