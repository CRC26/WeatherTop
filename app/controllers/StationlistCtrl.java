package controllers;
import java.util.List;
import models.Stationlist;
import models.Reading;
import play.Logger;
import play.mvc.Controller;
import utils.Conversions;


public class StationlistCtrl extends Controller
{
    public static void index(Long id) {
        Stationlist stationlist = Stationlist.findById(id);
        Logger.info("Stationlist id = " + id);
        Reading latestReading = null;
        if (stationlist.readings.size() > 0) {
            latestReading= stationlist.readings.get(stationlist.readings.size() - 1);
            stationlist.latestConditions = Conversions.weatherCodeToStr(latestReading.code);
        }

        render("stationlist.html", stationlist, latestReading);
    }
    public static void deletereading (Long id, Long readingid)
    {
        Stationlist stationlist = Stationlist.findById(id);
        Reading reading = Reading.findById(readingid);
        Logger.info ("Removing " + reading.title);
        stationlist.readings.remove(reading);
        stationlist.save();
        reading.delete();
        render("stationlist.html", stationlist);
    }
    public static void addReading(Long id, int code, float temp, int windSpeed, String pressure, int windDirection)
    {
        Reading reading = new Reading(code, temp, windSpeed, pressure, windDirection);
        Stationlist stationlist = Stationlist.findById(id);
        stationlist.readings.add(reading);
        stationlist.save();
        redirect ("/stationlists/" + id);
    }
    public static void currentweather(String title, double latitude, double longitude ) {
        Stationlist stationlist = new Stationlist(title, latitude, longitude);
        Logger.info("Adding Latest reading " + title);
        stationlist.save();
        render("/stationlist.html");
    }

}