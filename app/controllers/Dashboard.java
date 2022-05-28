package controllers;

import java.util.ArrayList;
import java.util.List;

import models.Member;
import models.Stationlist;
import models.Reading;
import play.Logger;
import play.mvc.Controller;

public class Dashboard extends Controller {
  public static void index() {
    Logger.info("Rendering Dashboard");
    Member member = Accounts.getLoggedInMember();
    List<Stationlist> stationlists = member.stationlists;
    render("dashboard.html",member, stationlists);
  }

  public static void deleteStationlist(Long id, Long stationlistid) {
    Member member = Accounts.getLoggedInMember();
    Stationlist stationlist = Stationlist.findById(stationlistid);
    member.stationlists.remove(stationlist);
    stationlist.delete();
    member.save();
    Logger.info("Removing" + stationlist.title);
    redirect("/dashboard");
  }

  public static void addStationlist(String title,double latitude, double longitude) {
    Member member = Accounts.getLoggedInMember();
    Stationlist stationlist = new Stationlist(title, latitude, longitude);
    member.stationlists.add(stationlist);
    Logger.info("Adding a new Station called " + title);
    stationlist.save();
    redirect("/dashboard");
  }

}

