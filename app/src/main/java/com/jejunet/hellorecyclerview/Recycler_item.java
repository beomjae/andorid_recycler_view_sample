package com.jejunet.hellorecyclerview;

/**
 * Created by user on 2016-07-15.
 */
public class Recycler_item {
    int image;
    String title;

    public Recycler_item(int image, String title) {
        this.image = image;
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
