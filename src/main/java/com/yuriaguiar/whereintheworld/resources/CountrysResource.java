package com.yuriaguiar.whereintheworld.resources;

import com.yuriaguiar.whereintheworld.dto.request.CountryRequestDto;
import com.yuriaguiar.whereintheworld.entities.Country;
import com.yuriaguiar.whereintheworld.services.UserService;
import io.swagger.v3.oas.annotations.media.Content;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

import java.io.IOException;
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
    @Operation(summary = "Realiza o cadastro do pais",
            requestBody = @RequestBody(content = @Content(mediaType = "multipart/form-data")))
    @PostMapping(consumes = "multipart/form-data")
    public ResponseEntity<Void> createCountry(@ModelAttribute CountryRequestDto countryDto) throws IOException {
        Long idCountry = this.service.saveCountry(countryDto);
        var uriLocation = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(idCountry).toUri();
        return ResponseEntity.created(uriLocation).build();
    }



}
