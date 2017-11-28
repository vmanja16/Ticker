package com.example.android.networkconnect;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Vikram on 11/27/2017.
 */

public class Quote {

    private JSONObject obj, data;
    private String symbol;
    private String date;
    private String open, high, low, close, volume;
    private boolean valid;

    // Constructor
    public Quote(String input_string){
        try{
            this.obj = new JSONObject(input_string);
            // get META DATA
            JSONObject meta_data = obj.getJSONObject("Meta Data");
            this.symbol = meta_data.getString("2. Symbol");
            this.date = meta_data.getString("3. Last Refreshed");

            // get Performance data
            JSONObject data = obj.getJSONObject("Time Series (Daily)").getJSONObject(date);
            this.open = data.getString("1. open");
            this.high = data.getString("2. high");
            this.low = data.getString("3. low");
            this.close = data.getString("4. close");
            this.volume = data.getString("5. volume");

            // Set valid
            this.valid = true;

        } catch (JSONException e){

            this.valid = false;
        }

    }
    public String getDataString(){
        return  "Date:   " + date + "\n" +
                "Symbol: " + symbol + "\n" +
                "Open:   " + open + "\n" +
                "High:   " + high + "\n" +
                "Low:    " + low + "\n" +
                "Close:  " + close + "\n" +
                "Volume: " + volume + "\n";
    }
    public boolean isValid(){return valid;}
    public String getSymbol(){return symbol;}
}
