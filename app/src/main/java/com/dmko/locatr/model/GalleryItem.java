package com.dmko.locatr.model;

import android.net.Uri;

import com.google.gson.annotations.SerializedName;

public class GalleryItem {
    @SerializedName("title")
    private String mTitle;
    @SerializedName("id")
    private String mId;
    @SerializedName("url_s")
    private String mUrl;
    @SerializedName("owner")
    private String mOwner;
    @SerializedName("latitude")
    private double mLat;
    @SerializedName("longitude")
    private double mLon;

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        this.mId = id;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public String getOwner() {
        return mOwner;
    }

    public void setOwner(String owner) {
        mOwner = owner;
    }

    public double getLat() {
        return mLat;
    }

    public void setLat(double lat) {
        mLat = lat;
    }

    public double getLon() {
        return mLon;
    }

    public void setLon(double lon) {
        mLon = lon;
    }

    public Uri getPhotoPageUri() {
        return Uri.parse("https://www.flickr.com/photos/")
                .buildUpon()
                .appendPath(mOwner)
                .appendPath(mId)
                .build();
    }

    @Override
    public String toString() {
        return mTitle;
    }
}
