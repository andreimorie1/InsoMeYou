package com.example.insomeyou;

public class Recycler    {

    private int imageview1;
    private String textview1;
    private String detail1;

    Recycler(int imageview1, String textview1, String detail1){
        this.imageview1=imageview1;
        this.textview1=textview1;
        this.detail1=detail1;
    }

    public int getImageview1() {
        return imageview1;
    }

    public String getTextview1() {
        return textview1;
    }

    public String getDetail1() {
        return detail1;
    }
}
