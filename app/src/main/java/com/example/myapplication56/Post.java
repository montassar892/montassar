package com.example.myapplication56;

public class Post {
    String title;
    String Description;
    String image;

    public Post(String title, String description, String image) {
        this.title = title;
        Description = description;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
