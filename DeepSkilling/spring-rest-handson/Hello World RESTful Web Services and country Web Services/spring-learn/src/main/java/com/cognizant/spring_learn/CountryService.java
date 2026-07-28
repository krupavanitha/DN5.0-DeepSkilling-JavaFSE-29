package com.cognizant.spring_learn;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CountryService {

    private static List<Country> countryList = new ArrayList<>();

    static {
        countryList.add(new Country("IN", "India"));
        countryList.add(new Country("US", "United States"));
        countryList.add(new Country("JP", "Japan"));
    }

    public List<Country> getAllCountries() {
        return countryList;
    }
}