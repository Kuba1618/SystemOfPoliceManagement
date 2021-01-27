package database;

public class MongoObject {

    private String memberId = "";
    private int timer = 0;
    private int xp = 0;

    public MongoObject() {

    }

    public String getMemmberId() {
        return memberId;
    }

    public int getXp() {
        return xp;
    }
    public int getTimer() {
        return timer;
    }

    public void setMemberId(String memberID) {
        this.memberId = memberID;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }
    public void setTimer(int timer) {
        this.timer = timer;
    }


}
