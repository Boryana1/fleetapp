package com.fleetmanagement.fleetapp.services;
import com.fleetmanagement.fleetapp.models.Country;
import com.fleetmanagement.fleetapp.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getCountries(){
        return countryRepository.findAll();
    }

//    save new country
    public void save(Country country){
        countryRepository.save(country);
    }

}
