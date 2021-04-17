package com.tbrkcbn;

import java.util.Date;

public class Appointment {

    private String costumerName;
    private String costumerSurName;
    private String operationType;
    private String date;
    private String hour;

    public Appointment(String costumerName, String costumerSurName, String operationType, String date, String hour) {
        this.costumerName = costumerName;
        this.costumerSurName = costumerSurName;
        this.operationType = operationType;
        this.date = date;
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "'"+costumerName+" "+costumerSurName+
                "' isimli müşteri ile "+date+" tarihindeki '"+operationType+"' randevusu başarıyla oluşturulmuştur!";
    }

    public String getCostumerName() {
        return costumerName;
    }

    public void setCostumerName(String costumerName) {
        this.costumerName = costumerName;
    }

    public String getCostumerSurName() {
        return costumerSurName;
    }

    public void setCostumerSurName(String costumerSurName) {
        this.costumerSurName = costumerSurName;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }
}
