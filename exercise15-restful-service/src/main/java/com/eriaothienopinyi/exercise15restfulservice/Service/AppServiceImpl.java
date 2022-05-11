package com.eriaothienopinyi.exercise15restfulservice.Service;

import com.eriaothienopinyi.exercise15restfulservice.Domain.City;
import com.eriaothienopinyi.exercise15restfulservice.Domain.Country;
import com.eriaothienopinyi.exercise15restfulservice.Repository.CityRepository;
import com.eriaothienopinyi.exercise15restfulservice.Repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AppServiceImpl implements AppService {
    @Autowired
    CountryRepository countryRepository;
    @Autowired
    CityRepository cityRepository;

    @Override
    public List<Country> findAllCountries() {
        return countryRepository.findAll();
    }

    @Override
    public List<City> findAllCities() {
        return cityRepository.findAll();
    }
}
