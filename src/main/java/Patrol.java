

public class Patrol {
    private Integer numberOfPatrol;
    private String kindOfPatrol;
    private int numberOfPoliceCar;

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
}

