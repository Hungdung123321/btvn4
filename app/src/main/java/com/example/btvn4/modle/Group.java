package com.example.btvn4.modle;

public class Group {
    private String image;
    private String groupTitle;
    private Float fan;
    private String posts;
    private String status;
    public Group(int image, String groupTitle, float fan, String posts, String status) {
        this.image = String.valueOf(image);
        this.groupTitle = groupTitle;
        this.fan = fan;
        this.posts = posts;
        this.status=status;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getGroupTitle() {
        return groupTitle;
    }

    public void setGroupTitle(String groupTitle) {
        this.groupTitle = groupTitle;
    }

    public float getFan() {
        return fan;
    }

    public void setFan(float fan) {
        this.fan = fan;
    }

    public String getPosts() {
        return posts;
    }

    public void setPosts(String posts) {
        this.posts = posts;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
