package com.eriaothienopinyi.exercise15restfulservice.Service;

import com.eriaothienopinyi.exercise15restfulservice.Domain.City;
import com.eriaothienopinyi.exercise15restfulservice.Domain.Country;

import java.util.List;

public interface AppService {
    public List<Country> findAllCountries();
    public List<City> findAllCities();
}
