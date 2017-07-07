package com.thomasphillips3.photogallery;

import com.google.gson.annotations.SerializedName;

/**
 * Created by thomas on 7/4/17.
 */

public class GalleryItem {
    @SerializedName("title")
    private String mCaption;

    @SerializedName("url_s")
    private String mUrl;

    @SerializedName("id")
    private String mId;

    public String getCaption() {
        return mCaption;
    }

    public void setCaption(String caption) {
        mCaption = caption;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    @Override
    public String toString() {
        return mCaption;

    }
}
