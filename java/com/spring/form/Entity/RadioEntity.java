package com.spring.form.Entity;

public class RadioEntity {

    int radioFieldId;
    String  radioFieldName;

    public RadioEntity() {
    }

    public RadioEntity(Integer radioFieldId, String radioFieldName) {
        this.radioFieldId = radioFieldId;
        this.radioFieldName = radioFieldName;
    }

    public Integer getRadioFieldId() {
        return radioFieldId;
    }

    public void setRadioFieldId(Integer radioFieldId) {
        this.radioFieldId = radioFieldId;
    }

    public String getRadioFieldName() {
        return radioFieldName;
    }

    public void setRadioFieldName(String radioFieldName) {
        this.radioFieldName = radioFieldName;
    }
}
