package models;
import javax.persistence.Entity;

import play.db.jpa.Model;
import utils.Conversions;


@Entity
public class Reading extends Model {
    public int code;
    public double temp;
    public double windSpeed;
    public String pressure;
    public int windDirection;
    public String title;

    public Reading(int code, double temp, double windSpeed, String pressure, int windDirection) {
        this.code = code;
        this.temp = temp;
        this.windSpeed = windSpeed;
        this.pressure = pressure;
        this.windDirection = windDirection;
    }
    public String getWeatherCodeToStr(){
        return Conversions.weatherCodeToStr(code);
    }
    public float getCelsiusToFahrenheit(){
        return Conversions.celsiusToFahrenheit(temp);
   }
    public String getKmhToBeaufort(){
        return Conversions.kmhToBeaufort(windSpeed);
    }
    public String getcompassToDegree(){
        return Conversions.compassToDegree(windDirection);
    }
    public double getWindChill(){
        return Conversions.windChill(temp,windSpeed);
    }
    public Reading(String title) {
        this.title = title;
    }
}




