package com.cognizant.orm_learn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Transactional
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    @Transactional
    public Country getCountry(String code) {
        return countryRepository.findByCode(code);
    }
   @Transactional
public void addCountry(Country country) {
    countryRepository.save(country);
}
@Transactional
public void deleteCountry(String code) {
    countryRepository.deleteByCode(code);
}
@Transactional
public List<Country> getCountriesStartingWith(String alphabet) {
    return countryRepository.findByNameStartingWith(alphabet);
}
@Transactional
public Country getCountryByName(String name) {
    return countryRepository.findByName(name);
}
@Transactional
public List<Country> getCountriesContaining(String text) {
    return countryRepository.findByNameContaining(text);
}
}