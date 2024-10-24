package com.yuriaguiar.whereintheworld.repository;

import com.yuriaguiar.whereintheworld.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Country, Long> {

}
