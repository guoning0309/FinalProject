package com.example.finalproject;

public class ResultItem {
    private int id;
    private String curName;
    private String curResult;

    public ResultItem() {
        super();
        curName = "";
        curResult = "";
    }
    public ResultItem(String curName, String curResult) {
        super();
        this.curName = curName;
        this.curResult = curResult;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCurName() {
        return curName;
    }
    public void setCurName(String curName) {
        this.curName = curName;
    }
    public String getCurResult() {
        return curResult;
    }
    public void setCurResult(String curResult) {
        this.curResult = curResult;
    }
}
