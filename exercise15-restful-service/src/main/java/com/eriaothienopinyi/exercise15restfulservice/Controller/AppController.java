package com.eriaothienopinyi.exercise15restfulservice.Controller;

import com.eriaothienopinyi.exercise15restfulservice.Domain.City;
import com.eriaothienopinyi.exercise15restfulservice.Domain.Country;
import com.eriaothienopinyi.exercise15restfulservice.Service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppController {
    @Autowired
    AppService appService;

    @GetMapping("/countries")
    public List<Country> findCountries(){
        return appService.findAllCountries();
    }

    @GetMapping("/cities")
    public List<City> findCities(){
        return appService.findAllCities();
    }

}
