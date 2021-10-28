/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.escuelaing.covidParcial.controller;

import edu.eci.escuelaing.covidParcial.services.CovidServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author jgarc
 */

@RestController
public class CovidService {
    @Autowired
    CovidServices covidService;
    
    @RequestMapping(value = "covid", method = RequestMethod.GET)
    public ResponseEntity<?> getCovid(@PathVariable(name="country") String country) {
        try {
            return new ResponseEntity<>(covidService.getGeneralCovid(), HttpStatus.ACCEPTED);
        } catch(Exception e) {
            return new ResponseEntity<>("Error al buscar pais", HttpStatus.BAD_REQUEST);
        }
    }
    
    @RequestMapping(value = "covid/{country}", method = RequestMethod.GET)
    public ResponseEntity<?> getCovidByCountry(@PathVariable(name="country") String country) {
        try {
            return new ResponseEntity<>(covidService.getCovidByCountry(country), HttpStatus.ACCEPTED);
        } catch(Exception e) {
            return new ResponseEntity<>("Error al buscar pais", HttpStatus.BAD_REQUEST);
        }
    }
}
