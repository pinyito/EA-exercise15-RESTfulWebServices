package com.eriaothienopinyi.exercise15restfulservice.Service;

import com.eriaothienopinyi.exercise15restfulservice.Domain.City;
import com.eriaothienopinyi.exercise15restfulservice.Repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CityServiceImpl implements CityService {
    @Autowired
    CityRepository cityRepository;

    @Override
    public List<City> findAll() {
        return cityRepository.findAll();
    }
}
