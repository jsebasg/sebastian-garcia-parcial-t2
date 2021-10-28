/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.escuelaing.covidParcial.services.impl;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import edu.eci.escuelaing.covidParcial.services.HttpConnectionService;
import org.json.JSONObject;

/**
 *
 * @author jgarc
 */
public class HttpConnectionServiceImpl implements HttpConnectionService {
    @Override
    public JSONObject getCovidByCountry(String country) throws UnirestException{
        
        
        HttpResponse<String> response = Unirest.get("https://covid-19-coronavirus-statistics.p.rapidapi.com/v1/stats?country=" + country)
	.header("x-rapidapi-host", "covid-19-coronavirus-statistics.p.rapidapi.com")
	.header("x-rapidapi-key", "4c37e8cdcdmshb741c0366e02b47p1471bfjsn23b4f66dddf4")
	.asString(); 
        
        return new JSONObject(response.getBody()); 
        
    }

    @Override
    public JSONObject  getGeneralCovid() throws UnirestException {
        
        HttpResponse<String> response = Unirest.get("https://covid-19-coronavirus-statistics.p.rapidapi.com/v1/total?stats")
	.header("x-rapidapi-host", "covid-19-coronavirus-statistics.p.rapidapi.com")
	.header("x-rapidapi-key", "4c37e8cdcdmshb741c0366e02b47p1471bfjsn23b4f66dddf4")
	.asString();
        
        return new JSONObject(response.getBody()); 
    }
}
