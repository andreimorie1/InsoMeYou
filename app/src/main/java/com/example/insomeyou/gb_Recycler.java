package com.example.insomeyou;

public class gb_Recycler {


    private int gb_imageview1;
    private String gb_header1;
    private String gb_detail1;

    gb_Recycler(int gb_imageview1,String gb_header1, String gb_detail1){
        this.gb_header1=gb_header1;
        this.gb_imageview1=gb_imageview1;
        this.gb_detail1=gb_detail1;
    }

    public int getGb_imageview1() {
        return gb_imageview1;
    }

    public String getGb_header1() {
        return gb_header1;
    }

    public String getGb_detail1() {
        return gb_detail1;
    }

}
