package me.h.shakawat.livecricketnewsscorefixture.Model;

public class RecentMatch {

    private String flagNum1, flagNum2,teamName,matchFormat,dateTime,matchStatus,matchResult,stadium;


    public RecentMatch() {
    }

    public RecentMatch(String flagNum1, String flagNum2, String teamName, String matchFormat, String dateTime, String matchStatus, String matchResult, String stadium) {
        this.flagNum1 = flagNum1;
        this.flagNum2 = flagNum2;
        this.teamName = teamName;
        this.matchFormat = matchFormat;
        this.dateTime = dateTime;
        this.matchStatus = matchStatus;
        this.matchResult = matchResult;
        this.stadium = stadium;
    }

    public String getFlagNum1() {
        return flagNum1;
    }

    public void setFlagNum1(String flagNum1) {
        this.flagNum1 = flagNum1;
    }

    public String getFlagNum2() {
        return flagNum2;
    }

    public void setFlagNum2(String flagNum2) {
        this.flagNum2 = flagNum2;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getMatchFormat() {
        return matchFormat;
    }

    public void setMatchFormat(String matchFormat) {
        this.matchFormat = matchFormat;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getMatchStatus() {
        return matchStatus;
    }

    public void setMatchStatus(String matchStatus) {
        this.matchStatus = matchStatus;
    }

    public String getMatchResult() {
        return matchResult;
    }

    public void setMatchResult(String matchResult) {
        this.matchResult = matchResult;
    }

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

}
