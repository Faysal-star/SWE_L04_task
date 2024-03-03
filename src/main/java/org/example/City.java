package org.example;

import java.util.Comparator;

public class City{
    private String city;
    private String province;

    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    String getCityName(){
        return this.city;
    }

    String getProvinceName(){
        return this.province;
    }


}

class sortByProvince implements Comparator<City> {
    public int compare(City a, City b){
        return a.getProvinceName().compareTo(b.getProvinceName());
    }
}
