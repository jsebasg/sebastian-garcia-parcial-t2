/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.escuelaing.covidParcial.services.impl;

import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import edu.eci.escuelaing.covidParcial.model.Country;
import edu.eci.escuelaing.covidParcial.services.CovidServices;
import edu.eci.escuelaing.covidParcial.services.HttpConnectionService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jgarc
 */
@Service
public class CovidServicesImpl implements CovidServices {
    @Autowired
    HttpConnectionService httpConnectionService;
    
    @Override
    public JSONObject getCovidByCountry(String country) throws UnirestException {
         return httpConnectionService.getCovidByCountry(country);
         
    }

    @Override
    public JSONObject getGeneralCovid() throws UnirestException {
        return httpConnectionService.getGeneralCovid(); 
    }
    
}
