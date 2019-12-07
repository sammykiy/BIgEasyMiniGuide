package com.example.bigeasyminiguide.ui.main;

public class Place {

    //** Title or Area of Place
    private String bPlaceTitle;

    //** Image Resource
    private int bPlaceResourceID = NO_IMAGE_PROVIDED;

    //** Short Description of Place
    private String bPlaceDescription;

    //** Address of Place
    private String bPlaceAddress;

    //** Address of Place
    private String bPlaceWebsite;


    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     * Create a new Place object.
     *
     * @param placeTitle is the name of the place, or the place in a general description
     * @param placeDescription is a short description of the place
     * @param placeAddress is the image resource ID for the image associated with the place
     * @param placeWebsite is a short description of the placethe website address for more information
     **/
    public Place(String placeTitle, String placeDescription, String placeAddress, String placeWebsite){
        bPlaceTitle = placeTitle;
        bPlaceDescription = placeDescription;
        bPlaceAddress = placeAddress;
        bPlaceWebsite = placeWebsite;
    }
    /**
     * Create a new Place object.
     *
     * @param placeTitle is the name of the place, or the place in a general description
     * @param placeResourceID is the image resource ID for the image associated with the place
     * @param placeDescription is a short description of the place
     * @param placeAddress is the image resource ID for the image associated with the place
     * @param placeWebsite is a short description of the placethe website address for more information
     **/
    /** Create a new Places object.**/
    public Place(String placeTitle, int placeResourceID, String placeDescription, String placeAddress, String placeWebsite){
        bPlaceTitle = placeTitle;
        bPlaceResourceID = placeResourceID;
        bPlaceDescription = placeDescription;
        bPlaceAddress = placeAddress;
        bPlaceWebsite = placeWebsite;
    }
    //** Get default title */
    public String getPlaceTitle() {
        return bPlaceTitle;
    }
    //** Get description */
    public int getPlaceResourceID() {
        return bPlaceResourceID;
    }

    public String getPlaceDescription() { return bPlaceDescription;   }

    public String getPlaceAddress() { return bPlaceAddress;   }

    public String getPlaceWebsite() { return bPlaceWebsite;   }

    public boolean hasImage(){
        return bPlaceResourceID != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Place" +
                "bPlaceTitle='" + bPlaceTitle + '\'' +
                ", bPlaceResourceID='" + bPlaceResourceID + '\'' +
                ", bPlaceDescription=" + bPlaceDescription +
                ", bPlaceAddress=" + bPlaceAddress +
                ", bPlaceWebsite=" + bPlaceWebsite +
                '}';
    }
}
