package com.thomasphillips3.photogallery;

/**
 * Created by thomas on 7/4/17.
 */

public class GalleryItem {
    private String mCaption;
    private String mUrl;
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
