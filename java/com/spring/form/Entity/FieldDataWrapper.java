package com.spring.form.Entity;

import java.util.List;

public class FieldDataWrapper {

    Integer listSize;
    List<FieldData> fieldDataList;

    public FieldDataWrapper() {
    }

    public FieldDataWrapper(List<FieldData> fieldDataList) {
        this.fieldDataList = fieldDataList;
    }

    public Integer getListSize() {
        return listSize;
    }

    public void setListSize(Integer listSize) {
        this.listSize = listSize;
    }

    public List<FieldData> getFieldDataList() {
        return fieldDataList;
    }

    public void setFieldDataList(List<FieldData> fieldDataList) {
        this.fieldDataList = fieldDataList;
    }
}
