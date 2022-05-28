package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import play.db.jpa.Model;
import utils.Conversions;


@Entity
    public class Stationlist extends Model {
        public String title;
        public double latitude;
        public double longitude;

        @OneToMany(cascade = CascadeType.ALL)
        public List<Reading> readings = new ArrayList<Reading>();

        public String latestConditions;

        public Stationlist(String title, double latitude, double longitude) {
            this.title = title;
            this.latitude = latitude;
            this.longitude =longitude;
        }

    }




