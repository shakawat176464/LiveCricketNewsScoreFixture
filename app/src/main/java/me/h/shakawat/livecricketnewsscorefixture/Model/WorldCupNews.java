package me.h.shakawat.livecricketnewsscorefixture.Model;

public class WorldCupNews {

    private String image,time,head,desc;

    public WorldCupNews() {
    }

    public WorldCupNews(String image, String time, String head, String desc) {
        this.image = image;
        this.time = time;
        this.head = head;
        this.desc = desc;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
