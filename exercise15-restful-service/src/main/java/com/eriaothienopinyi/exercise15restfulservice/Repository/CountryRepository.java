package com.eriaothienopinyi.exercise15restfulservice.Repository;

import com.eriaothienopinyi.exercise15restfulservice.Domain.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
