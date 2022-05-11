package com.eriaothienopinyi.exercise15restfulservice.Service;

import com.eriaothienopinyi.exercise15restfulservice.Domain.Country;
import com.eriaothienopinyi.exercise15restfulservice.Repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CountryServiceImpl implements CountryService {
    @Autowired
    CountryRepository countryRepository;

    @Override
    public List<Country> findAll() {
        return countryRepository.findAll();
    }
}
