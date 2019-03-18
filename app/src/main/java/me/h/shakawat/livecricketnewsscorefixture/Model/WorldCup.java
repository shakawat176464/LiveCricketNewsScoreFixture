package me.h.shakawat.livecricketnewsscorefixture.Model;

public class WorldCup {

    private int flag_1;
    private int flag_2;

    private String playNoTxt;
    private String teamNameTxt;
    private String dateTxt;
    private String timeTxt;
    private String stadiumTxt;

    public WorldCup(int flag_1, int flag_2, String playNoTxt, String teamNameTxt, String dateTxt, String timeTxt, String stadiumTxt) {
        this.flag_1 = flag_1;
        this.flag_2 = flag_2;
        this.playNoTxt = playNoTxt;
        this.teamNameTxt = teamNameTxt;
        this.dateTxt = dateTxt;
        this.timeTxt = timeTxt;
        this.stadiumTxt = stadiumTxt;
    }

    public int getFlag_1() {
        return flag_1;
    }

    public void setFlag_1(int flag_1) {
        this.flag_1 = flag_1;
    }

    public int getFlag_2() {
        return flag_2;
    }

    public void setFlag_2(int flag_2) {
        this.flag_2 = flag_2;
    }

    public String getPlayNoTxt() {
        return playNoTxt;
    }

    public void setPlayNoTxt(String playNoTxt) {
        this.playNoTxt = playNoTxt;
    }

    public String getTeamNameTxt() {
        return teamNameTxt;
    }

    public void setTeamNameTxt(String teamNameTxt) {
        this.teamNameTxt = teamNameTxt;
    }

    public String getDateTxt() {
        return dateTxt;
    }

    public void setDateTxt(String dateTxt) {
        this.dateTxt = dateTxt;
    }

    public String getTimeTxt() {
        return timeTxt;
    }

    public void setTimeTxt(String timeTxt) {
        this.timeTxt = timeTxt;
    }

    public String getStadiumTxt() {
        return stadiumTxt;
    }

    public void setStadiumTxt(String stadiumTxt) {
        this.stadiumTxt = stadiumTxt;
    }

}
