import User.Policeman;

public class Patrol {
    private Integer numberOfPatrol;
    public String kindOfPatrol;
    private int numberOfPoliceCar;
    Policeman[] arrayOfPoliceman = new Policeman[2];

    public Patrol(Integer numberOfPatrol,String kindOfPatrol,int numberOfPoliceCar) {
        this.numberOfPatrol = numberOfPatrol;
        this.kindOfPatrol = kindOfPatrol;
        this.numberOfPoliceCar = numberOfPoliceCar;
    }
    public String getKindOfPatrol(){
        return kindOfPatrol;
    }

    public void setKindOfPatrol(String kindOfPatrol) {
        this.kindOfPatrol = kindOfPatrol;
    }

    public Integer getNumberOfPatrol() {
        return numberOfPatrol;
    }

    public void setNumberOfPatrol(Integer numberOfPatrol) {
        this.numberOfPatrol = numberOfPatrol;
    }

    public int getNumberOfPoliceCar() {
        return numberOfPoliceCar;
    }

    public void setNumberOfPoliceCar(int numberOfPoliceCar) {
        this.numberOfPoliceCar = numberOfPoliceCar;
    }
    public void sendPatrol()
    {
        arrayOfPoliceman[0].isBusy = true;
        arrayOfPoliceman[1].isBusy = true;
    }
    public void endPatrol()
    {
        arrayOfPoliceman[0].isBusy = false;
        arrayOfPoliceman[1].isBusy = false;
    }
}

