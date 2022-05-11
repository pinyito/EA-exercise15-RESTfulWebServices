package com.eriaothienopinyi.exercise15restfulservice.Repository;

import com.eriaothienopinyi.exercise15restfulservice.Domain.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CityRepository extends JpaRepository<City, Integer> {
}
