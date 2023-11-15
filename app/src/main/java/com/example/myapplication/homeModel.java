package com.example.myapplication;

public class homeModel {

    String name,homeName,narx;
    int avatar;

    public homeModel(String name, String homeName, String narx, int avatar) {
        this.name = name;
        this.homeName = homeName;
        this.narx = narx;
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHomeName() {
        return homeName;
    }

    public void setHomeName(String homeName) {
        this.homeName = homeName;
    }

    public String getNarx() {
        return narx;
    }

    public void setNarx(String narx) {
        this.narx = narx;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }
}
