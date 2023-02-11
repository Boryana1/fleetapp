package com.fleetmanagement.fleetapp.services;
import com.fleetmanagement.fleetapp.models.Country;
import com.fleetmanagement.fleetapp.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

//    get by id
    public Optional <Country> findById(Integer id){
        return countryRepository.findById(id);
    }

}
