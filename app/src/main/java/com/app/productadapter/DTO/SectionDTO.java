package com.app.productadapter.DTO;

import java.util.List;

public class SectionDTO {
    private int ID;
    private String NAME;
    private List<ProductDTO> data;

    // Геттеры и сеттеры...

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public List<ProductDTO> getData() {
        return data;
    }

    public void setData(List<ProductDTO> data) {
        this.data = data;
    }
}
