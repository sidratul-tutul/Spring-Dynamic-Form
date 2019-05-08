package com.spring.form.Entity;

public class FieldData {

      private Integer filedId;
      private String filedName;
      private String radioFieldType;
      private String nullCheckBox;
      private String fieldComment;

    public FieldData()
    {

    }

    public FieldData(Integer filedId, String filedName, String radioFieldType, String nullCheckBox, String fieldComment) {
        this.filedId = filedId;
        this.filedName = filedName;
        this.radioFieldType = radioFieldType;
        this.nullCheckBox = nullCheckBox;
        this.fieldComment = fieldComment;
    }

    public Integer getFiledId() {
        return filedId;
    }

    public void setFiledId(Integer filedId) {
        this.filedId = filedId;
    }

    public String getFiledName() {
        return filedName;
    }

    public void setFiledName(String filedName) {
        this.filedName = filedName;
    }

    public String getRadioFieldType() {
        return radioFieldType;
    }

    public void setRadioFieldType(String radioFieldType) {
        this.radioFieldType = radioFieldType;
    }

    public String getNullCheckBox() {
        return nullCheckBox;
    }

    public void setNullCheckBox(String nullCheckBox) {
        this.nullCheckBox = nullCheckBox;
    }

    public String getFieldComment() {
        return fieldComment;
    }

    public void setFieldComment(String fieldComment) {
        this.fieldComment = fieldComment;
    }
}
