package com.eriaothienopinyi.exercise15restfulservice.Controller;

import com.eriaothienopinyi.exercise15restfulservice.Domain.City;
import com.eriaothienopinyi.exercise15restfulservice.Domain.Country;
import com.eriaothienopinyi.exercise15restfulservice.Service.CityService;
import com.eriaothienopinyi.exercise15restfulservice.Service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppController {
    @Autowired
    CountryService countryService;

    @Autowired
    CityService cityService;

    @GetMapping("/countries")
    public List<Country> findAllCountries(){
        return countryService.findAll();
    }

    @GetMapping("/cities")
    public List<City> findAllCities(){
        return cityService.findAll();
    }

}
