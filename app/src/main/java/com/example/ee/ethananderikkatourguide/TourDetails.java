package com.example.ee.ethananderikkatourguide;

public class TourDetails {
    private String fName;
    private String fLocation;

    TourDetails(String mName, String mLocation) {
        fName = mName;
        fLocation = mLocation;
    }


    public String getFeatureName() {
        return fName;
    }

    public String getLocation() {
        return fLocation;
    }
}


