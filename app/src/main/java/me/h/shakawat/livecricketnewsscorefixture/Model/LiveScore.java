package me.h.shakawat.livecricketnewsscorefixture.Model;

public class LiveScore {

    private String streming,matchName,team1,team2,result,batshman1,batshman2,ballar1,ballar2;


    public LiveScore() {
    }

    public LiveScore(String streming, String matchName, String team1, String team2, String result, String batshman1, String batshman2, String ballar1, String ballar2) {
        this.streming = streming;
        this.matchName = matchName;
        this.team1 = team1;
        this.team2 = team2;
        this.result = result;
        this.batshman1 = batshman1;
        this.batshman2 = batshman2;
        this.ballar1 = ballar1;
        this.ballar2 = ballar2;
    }


    public String getStreming() {
        return streming;
    }

    public void setStreming(String streming) {
        this.streming = streming;
    }

    public String getMatchName() {
        return matchName;
    }

    public void setMatchName(String matchName) {
        this.matchName = matchName;
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getBatshman1() {
        return batshman1;
    }

    public void setBatshman1(String batshman1) {
        this.batshman1 = batshman1;
    }

    public String getBatshman2() {
        return batshman2;
    }

    public void setBatshman2(String batshman2) {
        this.batshman2 = batshman2;
    }

    public String getBallar1() {
        return ballar1;
    }

    public void setBallar1(String ballar1) {
        this.ballar1 = ballar1;
    }

    public String getBallar2() {
        return ballar2;
    }

    public void setBallar2(String ballar2) {
        this.ballar2 = ballar2;
    }
}
