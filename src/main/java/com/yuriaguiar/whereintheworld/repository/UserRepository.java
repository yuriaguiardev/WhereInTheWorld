package com.yuriaguiar.whereintheworld.repository;

import com.yuriaguiar.whereintheworld.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<Country, Long> {
    List<Country> findAllByName(String name);
    Optional<Country> findByName(String name);
    Optional<Country> findBySigla(String sigla);
    List<Country> findAllByRegion(String region);






}
