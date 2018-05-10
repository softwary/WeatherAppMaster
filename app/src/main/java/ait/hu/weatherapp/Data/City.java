package ait.hu.weatherapp.Data;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class City implements Serializable {

    @PrimaryKey(autoGenerate = true)
    private long cityId;

    private String cityName;

    public long getCityId() {
        return cityId;
    }

    public void setCityId(long cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public City(String cityName) {
        this.cityName = cityName;
    }


}
