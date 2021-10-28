/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.escuelaing.covidParcial.services;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.exceptions.UnirestException;
import edu.eci.escuelaing.covidParcial.model.Country;
import org.json.JSONObject;

/**
 *
 * @author jgarc
 */
public interface CovidServices {
    public JSONObject getCovidByCountry(String country) throws UnirestException; 
    public JSONObject  getGeneralCovid()throws UnirestException ; 
}
