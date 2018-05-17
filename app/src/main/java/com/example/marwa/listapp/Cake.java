package com.example.marwa.listapp;

/**
 * Created by marwa on 17/03/18.
 */

public class Cake {
    int imgId;
    String headerTxt;
    String Desc;
    public Cake(String header, String desc, int thumb) {
        imgId = thumb;
        Desc = desc;
        headerTxt = header;

    }
    public int getImgId() {
        return imgId;
    }

    public void setImgId(int thumbnailID) {
        this.imgId = thumbnailID;
    }

    public String getHeaderTxt() {
        return headerTxt;
    }

    public void setHeaderTxt(String headerText) {
        this.headerTxt = headerText;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String descText) {
        this.Desc = descText;
    }

    @Override
    public String toString() {
        return headerTxt;
    }


}
