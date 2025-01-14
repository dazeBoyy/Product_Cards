package com.app.productadapter.DTO;

import java.util.List;

public class ApiResponseDTO  {
    private String status;
    private String message;
    private List<SectionDTO> TOVARY;

    // Геттеры и сеттеры...

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<SectionDTO> getTOVARY() {
        return TOVARY;
    }

    public void setTOVARY(List<SectionDTO> TOVARY) {
        this.TOVARY = TOVARY;
    }
}
