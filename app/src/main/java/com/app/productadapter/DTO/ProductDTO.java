package com.app.productadapter.DTO;

import java.util.List;

public class ProductDTO {
    private String ID;
    private String NAME;
    private String DETAIL_PICTURE;
    private double PROPERTY_RATING_VALUE;
    private int CATALOG_QUANTITY;
    private List<PriceDTO> EXTENDED_PRICE;

    // Геттеры и сеттеры...

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getDETAIL_PICTURE() {
        return DETAIL_PICTURE;
    }

    public void setDETAIL_PICTURE(String DETAIL_PICTURE) {
        this.DETAIL_PICTURE = DETAIL_PICTURE;
    }

    public double getPROPERTY_RATING_VALUE() {
        return PROPERTY_RATING_VALUE;
    }

    public void setPROPERTY_RATING_VALUE(double PROPERTY_RATING_VALUE) {
        this.PROPERTY_RATING_VALUE = PROPERTY_RATING_VALUE;
    }

    public int getCATALOG_QUANTITY() {
        return CATALOG_QUANTITY;
    }

    public void setCATALOG_QUANTITY(int CATALOG_QUANTITY) {
        this.CATALOG_QUANTITY = CATALOG_QUANTITY;
    }

    public List<PriceDTO> getEXTENDED_PRICE() {
        return EXTENDED_PRICE;
    }

    public void setEXTENDED_PRICE(List<PriceDTO> EXTENDED_PRICE) {
        this.EXTENDED_PRICE = EXTENDED_PRICE;
    }
}

