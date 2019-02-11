package com.notarsed.findmycraftbeer;

import java.util.List;

/**
 * Brewery Object to store Info about the individual Breweries
 */
public class Brewery{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getOPENING_HOURS() {
        return OPENING_HOURS;
    }

    public void setOPENING_HOURS(String OPENING_HOURS) {
        this.OPENING_HOURS = OPENING_HOURS;
    }

    public String getPHONE_NUMBER() {
        return PHONE_NUMBER;
    }

    public void setPHONE_NUMBER(String PHONE_NUMBER) {
        this.PHONE_NUMBER = PHONE_NUMBER;
    }

    public List<String> getPHOTO_METADATAS() {
        return PHOTO_METADATAS;
    }

    public void setPHOTO_METADATAS(List<String> PHOTO_METADATAS) {
        this.PHOTO_METADATAS = PHOTO_METADATAS;
    }

    public String getRATING() {
        return RATING;
    }

    public void setRATING(String RATING) {
        this.RATING = RATING;
    }

    public String getWEBSITE_URI() {
        return WEBSITE_URI;
    }

    public void setWEBSITE_URI(String WEBSITE_URI) {
        this.WEBSITE_URI = WEBSITE_URI;
    }

    private String address;
    private String ID;
    private String OPENING_HOURS;
    private String PHONE_NUMBER;
    private List<String> PHOTO_METADATAS;
    private String RATING;
    private String WEBSITE_URI;


}
