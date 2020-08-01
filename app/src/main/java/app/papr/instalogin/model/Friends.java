package app.papr.instalogin.model;

import java.io.Serializable;

public class Friends implements Serializable {
    private String name ;
    private String country ;
    private String desc;
    private int image;


    public Friends (String name, String desc, String country, int image ){
        this.name = name;
        this.country = country;
        this.desc = desc;
        this.image = image;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }


}
