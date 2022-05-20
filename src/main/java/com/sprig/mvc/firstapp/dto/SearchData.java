package com.sprig.mvc.firstapp.dto;

public class SearchData {
    private String keyword;

    public SearchData(String key){
        this.keyword = key;
    }
    public SearchData() {} 

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
    public String getKeyword() {
        return keyword;
    }
}
