package com.rns.tiffeat.web.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.rns.tiffeat.web.bo.domain.Customer;
import com.rns.tiffeat.web.bo.domain.GooglePojo;

public class GoogleUtil implements Constants {
	
	public static Customer getGoogleCustomer(String googleCode) throws IOException {
		String parameters = "code=" + googleCode + Constants.GOOGLE_ACCESS_TOKEN_URL_PARAMS;
		URL url = new URL(GOOGLE_GET_ACCESS_TOKEN_URL);
		URLConnection urlConn = url.openConnection();
        urlConn.setDoOutput(true);
        OutputStreamWriter writer = new OutputStreamWriter(urlConn.getOutputStream());
        writer.write(parameters);
        writer.flush();
        //get output in outputString 
        String line, outputString = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
        while ((line = reader.readLine()) != null) {
            outputString += line;
        }
        System.out.println(outputString);
        JsonObject json = (JsonObject)new JsonParser().parse(outputString);
        String access_token = json.get(GOOGLE_ACCESS_TOKEN).getAsString();
        System.out.println(access_token);

        //get User Info 
        url = new URL(GOOGLE_GET_USER_DATA_URL+ access_token);
        urlConn = url.openConnection();
        outputString = "";
        reader = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
        while ((line = reader.readLine()) != null) {
            outputString += line;
        }
        System.out.println(outputString);
        // Convert JSON response into Pojo class
        GooglePojo data = new Gson().fromJson(outputString, GooglePojo.class);
        System.out.println(data);
        writer.close();
        reader.close();
        Customer customer = new Customer();
        customer.setEmail(data.getEmail());
        customer.setName(data.getName());
        return customer;
	}

}
